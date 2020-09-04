package com.smc.fifa.taskservice;

import com.smc.fifa.model.Championnat;

import java.util.List;
import java.util.Optional;
import java.util.Random;

public interface ChampionnatService {

    void addChampionnat(Integer id, Championnat championnat);

    default void addChampionnat(Championnat championnat) {
        Integer id = new Random().nextInt();
        addChampionnat(id,championnat);
    }

    List<Championnat> getAllChampionnat();

    Optional<Championnat> getChampionnat(Integer id);

    boolean deleteChampionnat(Integer id);

    void updateChampionnat(Integer id, Championnat championnat);
}
