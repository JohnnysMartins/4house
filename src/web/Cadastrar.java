package web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CadastroDao;
import model.Cadastro;

public class Cadastrar implements Tarefa {

	
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		
	        String usuario = req.getParameter("usuario");
	        String login = req.getParameter("usuario");
	        String email = req.getParameter("email");
	        String senha = req.getParameter("senha");
	        String confirmacao = req.getParameter("confirmaSenha");
	        String telefone = req.getParameter("telefone");
	        String bairro = req.getParameter("bairro");
	        
	        if (senha.equals(confirmacao)) {
	        	Cadastro novoCadastro = new Cadastro();
		        novoCadastro.setNome(usuario);
		        novoCadastro.setEmail(email);
		        novoCadastro.setSenha(senha);
		        novoCadastro.setNumero(Integer.parseInt(telefone));
		        novoCadastro.setBairro(bairro);
		        novoCadastro.setLogin(login);
		        
		        CadastroDao.create(novoCadastro);
		        
		        return "/principal.jsp";
			}
	        
	        return "/cadastro.jsp";
	}
}
