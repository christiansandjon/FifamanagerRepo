package com.ephec.sgbd.service;

import com.ephec.sgbd.model.Championnat;
import com.ephec.sgbd.model.Equipe;

public interface EquipeService {

    void addEquipe(Equipe toAdd);

    void removeEquipe(int id);

    Equipe getEquipe(int id);

    void updateEquipe(Equipe toUpdate);

    Championnat getChampionnat();
}
