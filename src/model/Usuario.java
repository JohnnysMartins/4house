package model;

public class Usuario {

	private String usuario;
	private String senha;

	public Usuario(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getSenha() {
		return this.senha;
	}

	public String getUsuario() {
		return this.usuario;
	}
	
}
