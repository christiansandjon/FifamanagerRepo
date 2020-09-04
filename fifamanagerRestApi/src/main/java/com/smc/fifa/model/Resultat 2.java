package com.smc.fifa.model;

public class Resultat {

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


}