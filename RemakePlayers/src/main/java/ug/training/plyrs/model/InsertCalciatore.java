package ug.training.plyrs.model;

import javax.persistence.Column;

public class InsertCalciatore {

	@Column(name="nome", nullable=false)
	private String nome;
	@Column(name="cognome", nullable=false)
	private String cognome;
	@Column(name="squadra", nullable=true, updatable=true)
	private String squadra;
	
	
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public String getSquadra() {
		return squadra;
	}
	
	

}
