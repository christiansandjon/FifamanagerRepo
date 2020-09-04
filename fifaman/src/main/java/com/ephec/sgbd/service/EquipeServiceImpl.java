package com.ephec.sgbd.service;

import com.ephec.sgbd.model.Championnat;
import com.ephec.sgbd.model.Equipe;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
public class EquipeServiceImpl implements EquipeService {

    // == fields ==
    @Getter
    private final Championnat championnat = new Championnat();

    public Championnat getChampionnat() {
        return championnat;
    }

    // == public methods ==
    @Override
    public void addEquipe(Equipe toAdd) {
        championnat.addEquipe(toAdd);
    }

    @Override
    public void removeEquipe(int id) {
        championnat.remove(id);
    }

    @Override
    public Equipe getEquipe(int id) {
        return championnat.getEquipe(id);
    }

    @Override
    public void updateEquipe(Equipe toUpdate) {
        championnat.updateEquipe(toUpdate);
    }
}
