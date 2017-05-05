package br.com.livraria.model;

public enum Estado {
	
	NOVO("Novo"),
	USADO("Usado"),
	SEMINOVO("Semi-novo");
	
	private String descricao;
	
	private Estado(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao(){
		return descricao;
	}
}
