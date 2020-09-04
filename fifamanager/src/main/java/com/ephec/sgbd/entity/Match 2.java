package com.ephec.sgbd.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
public class Match {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date date;
    private Semestre semestre;
    private Equipe equiupe1;
    private Equipe equipe2;
    private Sanction sanction;
    private Buts buts;
    private Joueur joueur;

	public Match() {
	}

	public int getId() {
        return this.id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return this.date;
    }


    public void setDate(Date date) {
        this.date = date;
    }

    public Semestre getSemestre() {
        return this.semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }

    public Equipe getEquiupe1() {
        return this.equiupe1;
    }

    public void setEquiupe1(Equipe equiupe1) {
        this.equiupe1 = equiupe1;
    }

    public Equipe getEquipe2() {
        return this.equipe2;
    }

    public void setEquipe2(Equipe equipe2) {
        this.equipe2 = equipe2;
    }

    public Sanction getSanction() {
        return this.sanction;
    }

    public void setSanction(Sanction sanction) {
        this.sanction = sanction;
    }

    public Buts getButs() {
        return this.buts;
    }

    public void setButs(Buts buts) {
        this.buts = buts;
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
		Match that = (Match) o;
		return id == that.id &&
				Objects.equals(date, that.date) &&
				Objects.equals(semestre, that.semestre) &&
				Objects.equals(equiupe1, that.equiupe1) &&
				Objects.equals(equipe2, that.equipe2) &&
				Objects.equals(sanction, that.sanction) &&
				Objects.equals(buts, that.buts) &&
				Objects.equals(joueur, that.joueur);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, date, semestre, equiupe1, equipe2, sanction, buts, joueur);
	}
}