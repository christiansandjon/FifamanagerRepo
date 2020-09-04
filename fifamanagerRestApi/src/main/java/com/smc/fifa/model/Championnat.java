package com.smc.fifa.model;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;


public class Championnat implements Serializable {

    private Integer id;
    @NotBlank
    private String nom;
    @NotBlank
    private String saison;
    private Integer numberEquipes;
    private Date dateDebut;
    private Date dateFin;
    private String user;

    public Championnat() {
    }

    public Championnat(Integer id, @NotBlank String nom, @NotBlank String saison, Integer numberEquipes, Date dateDebut, Date dateFin, String user) {
        this.id = id;
        this.nom = nom;
        this.saison = saison;
        this.numberEquipes = numberEquipes;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.user = user;
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

    public String getSaison() {
        return saison;
    }

    public void setSaison(String saison) {
        this.saison = saison;
    }

    public Integer getNumberEquipes() {
        return numberEquipes;
    }

    public void setNumberEquipes(Integer numberEquipes) {
        this.numberEquipes = numberEquipes;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}