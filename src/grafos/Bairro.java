package grafos;

public enum Bairro {

	
	PIEDADE(1,"Piedade"),
	CANDEIAS(2,"Candeias"),
	BARRADEJANGADA(3,"Barra de Jangada"),
	CAJUEIROSECO(4,"Cajueiro Seco"),
	PRAZERES(5,"Prazeres"),
	COMPORTAS(6,"Comportas"),
	GUARARAPES(7,"Guararapes"),
	MURIBECA(8,"Muribeca"),
	DOISCARNEIROS(9,"Dois Carneiros"),
	MARCOSFREIRE(10,"Marcos Freire"),
	MURIBECADOSGUARARAPES(11,"Muribeca dos Guararapes"),
	CAVALEIRO(12,"Cavaleiro"),
	MURIBEQUINHA(13,"Muribequinha"),
	FLORIANO(14,"Floriano"),
	CENTRO(15,"Centro"),
	BULHOES(16,"Bulhões"),
	VARGEMFRIA(17,"Vargem Fria"),
	MANASSU(18,"Manassu"),
	CURADOII(19,"Curado II"),
	CURADOIII(20,"Curado III"),
	CURADOV(21,"Curado V"),
	CURADOIV(22,"Curado IV");
	
	private int codigo;
	private String nome;
	
	Bairro(int codigo, String nome){
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public int getCodigo(){
		return this.codigo;
	}

	public String getNome() {
		return nome;
	}

}
