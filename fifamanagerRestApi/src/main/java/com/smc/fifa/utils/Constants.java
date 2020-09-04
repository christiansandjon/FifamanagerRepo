package com.smc.fifa.utils;

public class Constants {

    // CRUD USER
    public static final String GET_ALL_USER = "select * from user";
    public static final String GET_USER_BY_ID = "select id, login, pwd from user where id = ?";
    public static final String ADD_USER = "insert into user (login, pwd) VALUES (?,?)";
    public static final String DELETE_USER = "delete from user where id = ?";
    public static final String UPDATE_USER = "update user set login = ?, pwd = ? where id = ?";
    public static final String CHECK_USER_LOGIN = "select login, pwd from user where login = ? and pwd = ?";

    // CRUD CHAMPIONNAT
    public static final String GET_ALL_CHAMPIONNAT = "select championnat.id, nom, saison, nb_equipe, dateDebut, dateFin, login " +
            "from championnat inner join user on user.id=championnat.fk_user";
    public static final String GET_CHAMPIONNAT_BY_ID = "select championnat.id, nom, saison, nb_equipe, dateDebut, dateFin, login from championnat inner join user on " +
            "user.id=championnat.fk_user where championnat.id = ?";
    public static final String ADD_CHAMPIONNAT = "insert into championnat (nom, saison, nb_equipe, dateDebut, dateFin) " +
            "values (?,?,?,?,?)";
    public static final String DELETE_CHAMPIONNAT = "delete from championnat where id = ?";
    public static final String UPDATE_CHAMPIONNAT = "update championnat set nom = ?, saison = ?, nb_equipe = ?, dateDebut = ?, dateFin = ? where id = ?";

    // CRUD EQUIPE
    public static final String GET_ALL_EQUIPE = "select equipe.id, equipe.nom, championnat.nom from equipe inner join championnat on championnat.id= equipe.ch_id";
    public static final String GET_EQUIPE_BY_ID = "select equipe.id, equipe.nom, championnat.nom from equipe inner join championnat on championnat.id= equipe.ch_id where equipe.id = ?";
    public static final String ADD_EQUIPE = "insert into equipe (nom,ch_id) values (?,?)";
    public static final String DELETE_EQUIPE = "delete from equipe where id = ?";
    public static final String UPDATE_EQUIPE = "update equipe set nom = ? where id = ?";

    // CRUD JOUEUR
    public static final String GET_ALL_JOUEUR = "select joueur.id, joueur.prenom, joueur.nom, joueur.poste, equipe.nom from joueur inner join equipe on equipe.id= joueur.eq_id";
    public static final String GET_JOUEUR_BY_ID = "select joueur.id, joueur.prenom, joueur.nom, joueur.poste, equipe.nom from joueur inner join equipe on equipe.id= joueur.eq_id where joueur.id = ?";
    public static final String ADD_JOUEUR = "insert into joueur (prenom,nom,poste,eq_id) VALUES (?,?,?,?)";
    public static final String DELETE_JOUEUR = "delete from joueur where id = ?";
    public static final String UPDATE_JOUEUR = "update joueur set prenom = ?, nom = ?, poste = ?, set eq_id = ? where id = ?";

}
