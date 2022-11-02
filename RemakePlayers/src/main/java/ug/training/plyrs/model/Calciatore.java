package ug.training.plyrs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="calciatori")
@Table(name="calciatori")
public class Calciatore {

	@Column(name="id", nullable = false)
	@Id
	private int id;
	@Column(name="nome", nullable = false)
	private String nome;
	@Column(name="cogno,e", nullable = false)
	private String cognome;
	@Column(name="squadra", nullable = true)
	private String squadra;

	public Calciatore(int id, String nome, String cognome, String squadra) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.squadra = squadra;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getSquadra() {
		return squadra;
	}

	public void setSquadra(String squadra) {
		this.squadra = squadra;
	}

}
