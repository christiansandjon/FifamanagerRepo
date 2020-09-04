package com.smc.fifa.taskservice;

import com.smc.fifa.entityservice.JoueurDao;
import com.smc.fifa.model.Joueur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JoueurServiceImpl implements JoueurService {
    private final JoueurDao joueurDao;

    @Autowired
    public JoueurServiceImpl(@Qualifier("joueurDao") JoueurDao joueurDao) {
        this.joueurDao = joueurDao;
    }

    @Override
    public void addJoueur(Integer id, Joueur joueur) {
        joueurDao.addJoueur(joueur);
    }

    @Override
    public void addJoueur(Joueur joueur) {
        joueurDao.addJoueur(joueur);
    }

    @Override
    public List<Joueur> getAllJoueur() {
        return joueurDao.getAllJoueur();
    }

    @Override
    public Optional<Joueur> getJoueur(Integer id) {
        return joueurDao.getJoueur(id);
    }

    @Override
    public boolean deleteJoueur(Integer id) {
        return joueurDao.deleteJoueur(id);
    }

    @Override
    public void updateJoueur(Integer id, Joueur newJoueur) {
         joueurDao.updateJoueur(id, newJoueur);
    }
}
