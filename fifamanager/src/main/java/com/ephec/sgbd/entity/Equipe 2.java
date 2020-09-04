package com.ephec.sgbd.entity;

import javax.persistence.*;

@Entity
public class Equipe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nom;
	private Integer points;
	private boolean notPlaying;
	@ManyToOne
	private Semestre semestre;

	public Equipe() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points += points;
	}

	public Semestre getSemestre() {
		return semestre;
	}

	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}

	public boolean isNotPlaying() {
		return notPlaying;
	}

	public void setNotPlaying(boolean notPlaying) {
		this.notPlaying = notPlaying;
	}
}