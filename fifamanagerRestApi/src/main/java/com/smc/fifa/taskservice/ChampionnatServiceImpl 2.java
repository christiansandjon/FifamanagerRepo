package com.smc.fifa.taskservice;

import com.smc.fifa.entityservice.ChampionnatDao;
import com.smc.fifa.model.Championnat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChampionnatServiceImpl implements ChampionnatService {
    private final ChampionnatDao championnatDao;

    @Autowired
    public ChampionnatServiceImpl(@Qualifier("championnatDao") ChampionnatDao championnatDao) {
        this.championnatDao = championnatDao;
    }

    @Override
    public void addChampionnat(Integer id, Championnat championnat) {
        championnatDao.addChampionnat(championnat);
    }

    @Override
    public void addChampionnat(Championnat championnat) {
        championnatDao.addChampionnat(championnat);
    }

    @Override
    public List<Championnat> getAllChampionnat() {
        return championnatDao.getAllChampionnat();
    }

    @Override
    public Optional<Championnat> getChampionnat(Integer id) {
        return championnatDao.getChampionnat(id);
    }

    @Override
    public boolean deleteChampionnat(Integer id) {
        return championnatDao.deleteChampionnat(id);
    }

    @Override
    public void updateChampionnat(Integer id, Championnat newChampionnat) {
         championnatDao.updateChampionnat(id, newChampionnat);
    }
}
