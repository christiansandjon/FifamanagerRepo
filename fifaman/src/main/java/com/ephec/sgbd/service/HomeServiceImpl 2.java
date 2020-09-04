package com.ephec.sgbd.service;

import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {
    @Override
    public String getWelcomeMessage() {
        return  "Bienvenu dans le Fifa Manager world Tournament.";
    }

    @Override
    public String getMyName(String user) {
        return user;
    }

    /*
    private ChampionnatRepository championnatRepository;

    public ChampionnatServiceImpl(ChampionnatRepository championnatRepository) {
        if (championnatRepository == null)
            throw new IllegalArgumentException("the championnat cannot be initialized (missing repositories)");
        this.championnatRepository = championnatRepository;
    }

    @Override
    public List<Championnat> afficherChampionnat(String nom) {
        return championnatRepository.afficherChampionnat(nom);
    }

    @Override
    public void creerChampionnat(Championnat championnat) {
        championnatRepository.creerChampionnat(championnat);
    }

     */
}
