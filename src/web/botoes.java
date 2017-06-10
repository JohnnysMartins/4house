package web;
import Dao.CadastroDao;
import model.Cadastro;

public class botoes {

	public static void cadastrar(String login,String senha,String nome,int numero,String email,
			String bairro,String endereco,String a,String profissao,String descricao) {

		Cadastro cad = new Cadastro(login, senha, nome, numero, email, bairro,
				endereco, profissao, descricao);
		CadastroDao dao = new CadastroDao();

		if (dao.create(cad)) {
			System.out.println("Salvo com sucesso!!!");
		} else {
			System.out.println("Erro ao salvar");
		}

	}

}
