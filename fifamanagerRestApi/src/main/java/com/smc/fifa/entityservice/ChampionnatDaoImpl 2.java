package com.smc.fifa.entityservice;

import com.smc.fifa.model.Championnat;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static com.smc.fifa.utils.Constants.*;

@Repository("championnatDao")
public class ChampionnatDaoImpl implements ChampionnatDao {

    private final JdbcTemplate jdbcTemplate;

    public ChampionnatDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<Championnat> getAllChampionnat() {

        return jdbcTemplate.query(GET_ALL_CHAMPIONNAT, (resultSet, i) -> {
            Integer id = Integer.parseInt(resultSet.getString("id"));
            String nom = resultSet.getString("nom");
            String saison = resultSet.getString("saison");
            Integer numberEquipes = Integer.parseInt(resultSet.getString("nb_equipe"));
            Date dateDebut = resultSet.getDate("dateDebut");
            Date dateFin = resultSet.getDate("dateFin");
            String username = resultSet.getString("login");
            return new Championnat(id, nom, saison, numberEquipes, dateDebut, dateFin, username);
        });
    }

    @Override
    public Optional<Championnat> getChampionnat(Integer id) {
        Championnat championnat = jdbcTemplate.queryForObject(GET_CHAMPIONNAT_BY_ID, new Object[]{id}, (resultSet, i) -> {
            Integer championnatId = Integer.parseInt(resultSet.getString("id"));
            String nom = resultSet.getString("nom");
            String saison = resultSet.getString("saison");
            Integer numberEquipes = Integer.parseInt(resultSet.getString("nb_equipe"));
            Date dateDebut = resultSet.getDate("dateDebut");
            Date dateFin = resultSet.getDate("dateFin");
            String username = resultSet.getString("login");
            return new Championnat(id, nom, saison, numberEquipes, dateDebut, dateFin, username);
        });
        return Optional.ofNullable(championnat);
    }

    @Override
    public void addChampionnat(Integer id, Championnat championnat) {
        jdbcTemplate.update(ADD_CHAMPIONNAT,
                championnat.getNom(),
                championnat.getSaison(),
                championnat.getNumberEquipes(),
                championnat.getDateDebut(),
                championnat.getDateFin());
    }

    @Override
    public void addChampionnat(Championnat championnat) {
        jdbcTemplate.update(ADD_CHAMPIONNAT,
                championnat.getNom(),
                championnat.getSaison(),
                championnat.getNumberEquipes(),
                championnat.getDateDebut(),
                championnat.getDateFin());
    }

    @Override
    public boolean deleteChampionnat(Integer id) {
        return jdbcTemplate.update(DELETE_CHAMPIONNAT, id) > 0;
    }

    @Override
    public void updateChampionnat(Integer id, Championnat update) {
        this.jdbcTemplate.update(UPDATE_CHAMPIONNAT, update.getNom(),
                update.getSaison(),
                update.getNumberEquipes(),
                update.getDateDebut(),
                update.getDateFin(), id);
    }

}