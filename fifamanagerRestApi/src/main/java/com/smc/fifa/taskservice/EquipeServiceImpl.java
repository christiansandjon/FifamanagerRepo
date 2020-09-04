package com.smc.fifa.taskservice;

import com.smc.fifa.entityservice.EquipeDao;
import com.smc.fifa.model.Equipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipeServiceImpl implements EquipeService {
    private final EquipeDao equipeDao;

    @Autowired
    public EquipeServiceImpl(@Qualifier("equipeDao") EquipeDao equipeDao) {
        this.equipeDao = equipeDao;
    }

    @Override
    public void addEquipe(Integer id, Equipe equipe) {
        equipeDao.addEquipe(equipe);
    }

    @Override
    public void addEquipe(Equipe equipe) {
        equipeDao.addEquipe(equipe);
    }

    @Override
    public List<Equipe> getAllEquipe() {
        return equipeDao.getAllEquipe();
    }

    @Override
    public Optional<Equipe> getEquipe(Integer id) {
        return equipeDao.getEquipe(id);
    }

    @Override
    public boolean deleteEquipe(Integer id) {
        return equipeDao.deleteEquipe(id);
    }

    @Override
    public void updateEquipe(Integer id, Equipe newEquipe) {
         equipeDao.updateEquipe(id, newEquipe);
    }
}
