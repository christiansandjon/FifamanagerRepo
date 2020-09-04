package com.ephec.sgbd.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Semestre {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String nom;
	private Date date_debut;
	private Date date_fin;
	@ManyToOne
	private Championnat championnat;


	public Semestre() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDate_debut() {
		return this.date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public Date getDate_fin() {
		return this.date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	public Championnat getChampionnat() {
		return this.championnat;
	}

	public void setChampionnat(Championnat championnat) {
		this.championnat = championnat;
	}

}