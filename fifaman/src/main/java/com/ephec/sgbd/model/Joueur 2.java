package com.ephec.sgbd.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Joueur {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nom;
    private String poste;

    @JoinColumn(name = "equipe")
    private Equipe equipe;

	public Joueur() {
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

    public String getPoste() {
        return this.poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Joueur joueur = (Joueur) o;
		return id == joueur.id &&
				Objects.equals(nom, joueur.nom) &&
				Objects.equals(poste, joueur.poste) &&
				Objects.equals(equipe, joueur.equipe);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nom, poste, equipe);
	}
}