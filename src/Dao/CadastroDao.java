package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionF;
import model.Cadastro;

public class CadastroDao {

    private static Connection con = null;
    private int id = 0;
    private boolean renderizaModal = false;
    private String msnErro;
    private static Cadastro cadastro = new Cadastro();    

    public CadastroDao() {
        con = ConnectionF.getConnection();
    }

    public static boolean create(Cadastro c) {

       
        String sql = ("INSERT INTO cadastro(login,senha,nome,numero,email,bairro,endereco,profissao,descricao)VALUES(?,?,?,?,?,?,?,?,?)");

        PreparedStatement stmt = null;

        
        try {
            stmt = con.prepareStatement(sql);

            stmt.setString(1, c.getLogin());
            stmt.setString(2, c.getSenha());
            stmt.setString(3, c.getNome());
            stmt.setInt(4, c.getNumero());
            stmt.setString(5, c.getEmail());
            stmt.setString(6, c.getBairro());
            stmt.setString(7, c.getEndereco());

            stmt.setString(8, c.getProfissao());
            stmt.setString(9, c.getDescricao());

            stmt.executeUpdate();
            cadastro = c;
            return true;

        } catch (SQLException ex) {
            System.err.println("ERRO!" + ex);
            return false;
        } finally {
            ConnectionF.closeConnection(con, stmt);
        }

    }
    
    public static boolean createProfissao(String endereco, String profissao, String descricao){
    	
    	String sql = ("INSERT INTO cadastro(endereco,profissao,descricao)VALUES(?,?,?) where email = ?");

        PreparedStatement stmt = null;

        try {
        	
            stmt = con.prepareStatement(sql);

            stmt.setString(1, endereco);
            stmt.setString(2, profissao);
            stmt.setString(3, descricao);
            
            stmt.setString(4, cadastro.getEmail());
            

            stmt.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println("ERRO!" + ex);
            return false;
        } finally {
            ConnectionF.closeConnection(con, stmt);
        }
    }

	public List<Cadastro> findAll() {

        String sql = ("SELECT * FROM cadastro");
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cadastro> cadastros = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Cadastro cadastro = new Cadastro();

                cadastro.setLogin(rs.getString("login"));
                cadastro.setSenha(rs.getString("senha"));
                cadastro.setNome(rs.getString("nome"));
                cadastro.setNumero(rs.getInt("numero"));
                cadastro.setEmail(rs.getString("email"));
                cadastro.setBairro(rs.getString("bairro"));
                cadastro.setEndereco(rs.getString("endereco"));
                cadastro.setProfissao(rs.getString("profissao"));
                cadastro.setDescricao(rs.getString("descricao"));

                cadastros.add(cadastro);
            }

        } catch (SQLException ex) {
            System.err.println("ERRO!" + ex);
        } finally {
            ConnectionF.closeConnection(con, stmt, rs);
        }

        return cadastros;
    }

    public boolean validarUsuarioESenha(String login, String senha) throws IllegalAccessException{
        String sql = "select * from cadastro where login = ? and senha = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean retorno = false;
        try{
            stmt.setString(1, login);
            stmt.setString(2, senha);
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Cadastro c = new Cadastro();
                c.setLogin(rs.getString("login"));
                c.setSenha(rs.getString("senha"));
                c.setNome(rs.getString("nome"));
                c.setNumero(rs.getInt("numero"));
                c.setEmail(rs.getString("email"));
                c.setBairro(rs.getString("bairro"));
                c.setEndereco(rs.getString("endereco"));
                c.setProfissao(rs.getString("profissao"));
                c.setDescricao(rs.getString("descricao"));
                
                if (senha.equals(c.getSenha())  && login.equals(c.getLogin()))
    				retorno = true;
            }
            
            
            return retorno;
            
        }catch (SQLException ex) {
            throw new IllegalAccessException("usuario ou senha incorreta");
        } finally {
            ConnectionF.closeConnection(con, stmt, rs);
        }    
        
    }
    
    public void update(Cadastro cad) throws SQLException {
		con = new ConnectionF().getConnection();
		String sql = ("INSERT INTO cadastro"
				+ "(login, senha, nome, numero, email, bairro, endereco, profissao, descricao)"
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?) " + " WHERE id = ?");

		PreparedStatement stmt = con.prepareStatement(sql);

		stmt.setString(1, cad.getLogin());
		stmt.setString(2, cad.getSenha());
		stmt.setString(3, cad.getNome());
		stmt.setInt(4, cad.getNumero());
		stmt.setString(5, cad.getEmail());
		stmt.setString(6, cad.getBairro());
		stmt.setString(7, cad.getEndereco());

		stmt.setString(8, cad.getProfissao());
		stmt.setString(9, cad.getDescricao());

		stmt.setInt(10, cad.getId());

		stmt.execute();
		stmt.close();

		con.close();
	}

    public void delete(int id) throws SQLException {
		con = new ConnectionF().getConnection();

		String sql = ("DELETE FROM pessoa WHERE id = ?");

		PreparedStatement stmt = con.prepareStatement(sql);

		stmt.setInt(1, id);
		stmt.execute();

		con.close();
	}
    
}