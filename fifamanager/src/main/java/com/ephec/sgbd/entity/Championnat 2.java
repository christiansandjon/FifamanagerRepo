package com.ephec.sgbd.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

@Entity
@Table(name = "championnat")
@NamedNativeQuery(name = Championnat.QUERY_FIND, query = "select * from championnat")
public class Championnat implements Serializable {

	public static final String QUERY_FIND = "Championnat.find";

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id" , columnDefinition = "INTEGER")
	private Integer id;

	@Column(name = "nom", columnDefinition = "VARCHAR")
	private String nom;

	@Column(name = "saison", columnDefinition = "VARCHAR")
	private String saison;

	private HashSet<Equipe> equipes;
	private ArrayList<Match> matches;
	private int totalNumberEquipes;
	private Date dateDebut;

	public Championnat() {
	}

	public Championnat(String nom, String saison) {
		this.nom = nom;
		this.saison = saison;
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

	public String getSaison() {
		return this.saison;
	}

	public void setSaison(String saison) {
		this.saison = saison;
	}

}