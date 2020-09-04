package com.ephec.sgbd.entity;
/*
import com.ephec.sgbd.model.Championnat;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class ChampionnatEntity implements ChampionnatEntityInterface {

    private EntityManager em;

    public ChampionnatEntity(EntityManager entityManager) {
        this.em = entityManager;
    }

    @Override
    public List<Championnat> findByName(String nom) {
        List<Championnat> championnats = em.createNamedQuery(Championnat.QUERY_FIND, Championnat.class)
                .setParameter("nom", nom)
                .getResultList();
        return championnats;
    }

    @Override
    public void updateExportBusy(int id) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.createNamedQuery(Championnat.QUERY_UPDATE, Championnat.class)
                    .setParameter("id", id)
                    .executeUpdate();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
        }
    }

    @Override
    public void removeTrackDocExport(int id) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.createNamedQuery(Championnat.QUERY_DELETE, Championnat.class)
                    .setParameter("id", id)
                    .executeUpdate();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
        }
    }

    @Override
    public void insertTrackDocExport(Championnat championnat) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(championnat);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
        }
    }
}

 */
