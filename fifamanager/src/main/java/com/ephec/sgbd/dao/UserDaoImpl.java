package com.ephec.sgbd.dao;

import com.ephec.sgbd.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;
import java.util.List;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    // define entity manager
    private EntityManager em;

    // constructor injection
    @Autowired
    public UserDaoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    @Transactional
    public List<User> findAll() {
        return em.createNamedQuery(User.USER_FINDALL, User.class)
                .getResultList();
    }

    @Override
    @Transactional
    public User findById(Integer id) {
        User user = em.find(User.class, id);
        return user;
    /*
    createNamedQuery(User.USER_FIND_BY_ID, User.class)
                .setParameter(1,id)
                .getResultList()
                .get(1);
     */
    }

    @Override
    @Transactional
    public void addUser(User user) {
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            em.persist(user);
            et.commit();
        } catch (EntityExistsException e) {
            if (et != null && et.isActive()) {
                et.rollback();
            }
        }
    }

    @Override
    public void delete(Integer id) {
        em.createNamedQuery(User.USER_DELETE, User.class)
                .setParameter(1, id);
    }

    @Override
    public void update(Integer id, User update) {
        em.createNamedQuery(User.USER_UPDATE, User.class)
                .setParameter(1, update.getLogin())
                .setParameter(2, update.getPwd())
                .setParameter(3, id);
    }

}