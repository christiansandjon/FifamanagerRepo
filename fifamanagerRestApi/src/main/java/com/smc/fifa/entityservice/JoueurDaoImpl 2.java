package com.smc.fifa.entityservice;

import com.smc.fifa.model.Joueur;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static com.smc.fifa.utils.Constants.*;

@Repository("joueurDao")
public class JoueurDaoImpl implements JoueurDao {

    private final JdbcTemplate jdbcTemplate;

    public JoueurDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Joueur> getAllJoueur() {

        return jdbcTemplate.query(GET_ALL_JOUEUR, (resultSet, i) -> {
            Integer joueurId = Integer.parseInt(resultSet.getString("id"));
            String prenom = resultSet.getString("prenom");
            String nom = resultSet.getString("nom");
            String poste = resultSet.getString("poste");
            String equipe = resultSet.getString("equipe.nom");
            return new Joueur(joueurId, prenom, nom, poste, equipe);
        });
    }

    @Override
    public Optional<Joueur> getJoueur(Integer id) {
        Joueur joueur = jdbcTemplate.queryForObject(GET_JOUEUR_BY_ID, new Object[]{id}, (resultSet, i) -> {
            Integer joueurId = Integer.parseInt(resultSet.getString("id"));
            String prenom = resultSet.getString("prenom");
            String nom = resultSet.getString("nom");
            String poste = resultSet.getString("poste");
            String equipe = resultSet.getString("equipe.nom");
            return new Joueur(joueurId, prenom, nom, poste, equipe);
        });
        return Optional.ofNullable(joueur);
    }

    @Override
    public void addJoueur(Integer id, Joueur joueur) {
        jdbcTemplate.update(ADD_JOUEUR, joueur.getPrenom(),joueur.getNom(),joueur.getPoste(), joueur.getEquipe());
    }

    @Override
    public void addJoueur(Joueur joueur) {
        jdbcTemplate.update(ADD_JOUEUR, joueur.getPrenom(),joueur.getNom(),joueur.getPoste(), joueur.getEquipe());
    }


    @Override
    public boolean deleteJoueur(Integer id) {
        return jdbcTemplate.update(DELETE_JOUEUR, id) > 0;
    }

    @Override
    public void updateJoueur(Integer id, Joueur update) {
        this.jdbcTemplate.update(UPDATE_JOUEUR, update.getPrenom(), update.getNom(), update.getPoste(),update.getEquipe(),  id);
    }

}