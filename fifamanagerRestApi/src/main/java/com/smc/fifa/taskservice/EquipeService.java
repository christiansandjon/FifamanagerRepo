package com.smc.fifa.taskservice;

import com.smc.fifa.model.Equipe;

import java.util.List;
import java.util.Optional;
import java.util.Random;

public interface EquipeService {

    void addEquipe(Integer id, Equipe equipe);

    default void addEquipe(Equipe equipe) {
        Integer id = new Random().nextInt();
        addEquipe(id,equipe);
    }

    List<Equipe> getAllEquipe();

    Optional<Equipe> getEquipe(Integer id);

    boolean deleteEquipe(Integer id);

    void updateEquipe(Integer id, Equipe equipe);
}
