package com.smc.fifa.entityservice;

import com.smc.fifa.model.Equipe;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static com.smc.fifa.utils.Constants.*;

@Repository("equipeDao")
public class EquipeDaoImpl implements EquipeDao {

    private final JdbcTemplate jdbcTemplate;

    public EquipeDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Equipe> getAllEquipe() {

        return jdbcTemplate.query(GET_ALL_EQUIPE, (resultSet, i) -> {
            Integer id = Integer.parseInt(resultSet.getString("id"));
            String name = resultSet.getString("equipe.nom");
            String championnat = resultSet.getString("championnat.nom");
            return new Equipe(id, name, championnat);
        });
    }

    @Override
    public Optional<Equipe> getEquipe(Integer id) {
        Equipe equipe = jdbcTemplate.queryForObject(GET_EQUIPE_BY_ID, new Object[]{id}, (resultSet, i) -> {
            Integer equipeId = Integer.parseInt(resultSet.getString("id"));
            String name = resultSet.getString("equipe.nom");
            String championnat = resultSet.getString("championnat.nom");
            return new Equipe(id, name, championnat);
        });
        return Optional.ofNullable(equipe);
    }

    @Override
    public void addEquipe(Integer id, Equipe equipe) {
        jdbcTemplate.update(ADD_EQUIPE, equipe.getNom(), equipe.getChampionnat());
    }

    @Override
    public void addEquipe(Equipe equipe) {
        jdbcTemplate.update(ADD_EQUIPE, equipe.getNom(), equipe.getChampionnat());
    }

    @Override
    public boolean deleteEquipe(Integer id) {
        return jdbcTemplate.update(DELETE_EQUIPE, id) > 0;
    }

    @Override
    public void updateEquipe(Integer id, Equipe update) {
        this.jdbcTemplate.update(UPDATE_EQUIPE, update.getNom(), id);
    }

}