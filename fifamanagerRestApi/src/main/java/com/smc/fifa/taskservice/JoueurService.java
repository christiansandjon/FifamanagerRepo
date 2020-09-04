package com.smc.fifa.taskservice;

import com.smc.fifa.model.Joueur;

import java.util.List;
import java.util.Optional;
import java.util.Random;

public interface JoueurService {

    void addJoueur(Integer id, Joueur joueur);

    default void addJoueur(Joueur joueur) {
        Integer id = new Random().nextInt();
        addJoueur(id,joueur);
    }

    List<Joueur> getAllJoueur();

    Optional<Joueur> getJoueur(Integer id);

    boolean deleteJoueur(Integer id);

    void updateJoueur(Integer id, Joueur joueur);
}
