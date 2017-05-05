package br.com.livraria.model;

public enum Tipo {

	CD("Cd"),DVD("Dvd"), LIVRO("Livro"),
	VINIL("Vinil"), HQ("Hq");
	
	private String descricao;
	
	private Tipo(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
}
