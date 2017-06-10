package web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CadastroDao;

public class Login implements Tarefa {

	private String login;
	private String senha;
	private CadastroDao c = new CadastroDao();
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		
	        this.login = req.getParameter("usuario");
	        this.senha = req.getParameter("senha");

	        try {
				if (!c.validarUsuarioESenha(login, senha))
					return "/index.jsp";
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
	        
	        return "/principal.jsp";
	}

}