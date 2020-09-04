package com.ephec.sgbd.model;

public class Equipe {


    private Integer id;
    private String nom;
    private Championnat championnat;

    public Equipe() {
    }

    public Equipe(String nom) {
        this.nom = nom;
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

}