package com.smc.fifa.model;

public class Joueur {


    private Integer id;
    private String prenom;
    private String nom;
    private String poste;
    private String equipe;

	public Joueur() {
	}

    public Joueur(Integer id, String prenom, String nom, String poste, String eq_id) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.poste = poste;
        this.equipe = eq_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }
}