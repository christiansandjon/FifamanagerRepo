package com.ephec.sgbd.entity;

import javax.persistence.*;

@Entity
public class Joueur {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nom;
    private String poste;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Joueur)) return false;

        Joueur joueur = (Joueur) o;

        if (id != null ? !id.equals(joueur.id) : joueur.id != null) return false;
        if (nom != null ? !nom.equals(joueur.nom) : joueur.nom != null) return false;
        return poste != null ? poste.equals(joueur.poste) : joueur.poste == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (poste != null ? poste.hashCode() : 0);
        return result;
    }
}