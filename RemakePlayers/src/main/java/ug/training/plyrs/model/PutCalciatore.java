package ug.training.plyrs.model;

import javax.persistence.Column;

public class PutCalciatore {

	@Column(name="squadra",nullable=true)
	private String squadra;
	
	public String getSquadra() {
		return this.squadra;
	}
}
