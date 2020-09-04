package com.ephec.sgbd.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Resultat {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Equipe vainqueur;
    private Equipe perdant;
    private Equipe matchs_nul;
    private Joueur buteurs;
    private Joueur avertis;
    private int points_vainqueur;
    private int points_perdant;

	public Resultat() {
	}

	public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Equipe getVainqueur() {
        return this.vainqueur;
    }

    public void setVainqueur(Equipe vainqueur) {
        this.vainqueur = vainqueur;
    }

    public Equipe getPerdant() {
        return this.perdant;
    }

    public void setPerdant(Equipe perdant) {
        this.perdant = perdant;
    }

    public Equipe getMatchs_nul() {
        return this.matchs_nul;
    }

    public void setMatchs_nul(Equipe matchs_nul) {
        this.matchs_nul = matchs_nul;
    }

    public Joueur getButeurs() {
        return this.buteurs;
    }

    public void setButeurs(Joueur buteurs) {
        this.buteurs = buteurs;
    }

    public Joueur getAvertis() {
        return this.avertis;
    }

    public void setAvertis(Joueur avertis) {
        this.avertis = avertis;
    }

    public int getPoints_vainqueur() {
        return this.points_vainqueur;
    }

    public void setPoints_vainqueur(int points_vainqueur) {
        this.points_vainqueur = points_vainqueur;
    }

    public int getPoints_perdant() {
        return this.points_perdant;
    }

    public void setPoints_perdant(int points_perdant) {
        this.points_perdant = points_perdant;
    }

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Resultat resultat = (Resultat) o;
		return id == resultat.id &&
				points_vainqueur == resultat.points_vainqueur &&
				points_perdant == resultat.points_perdant &&
				Objects.equals(vainqueur, resultat.vainqueur) &&
				Objects.equals(perdant, resultat.perdant) &&
				Objects.equals(matchs_nul, resultat.matchs_nul) &&
				Objects.equals(buteurs, resultat.buteurs) &&
				Objects.equals(avertis, resultat.avertis);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, vainqueur, perdant, matchs_nul, buteurs, avertis, points_vainqueur, points_perdant);
	}
}