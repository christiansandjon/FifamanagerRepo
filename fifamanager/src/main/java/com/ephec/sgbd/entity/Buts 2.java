package com.ephec.sgbd.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Buts {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	private Joueur joueur;


	public Buts() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Joueur getJoueur() {
		return this.joueur;
	}

	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Buts buts = (Buts) o;
		return id == buts.id &&
				Objects.equals(joueur, buts.joueur);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, joueur);
	}
}