package com.smc.fifa.model;

import java.util.Date;


public class Match {

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


}