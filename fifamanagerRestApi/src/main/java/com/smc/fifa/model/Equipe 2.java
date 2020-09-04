package com.smc.fifa.model;

public class Equipe {

    private Integer id;
    private String nom;
    private String championnat;

    public Equipe(Integer id, String nom, String championnat) {
        this.id = id;
        this.nom = nom;
        this.championnat = championnat;
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

    public String getChampionnat() {
        return championnat;
    }

    public void setChampionnat(String championnat) {
        this.championnat = championnat;
    }
}