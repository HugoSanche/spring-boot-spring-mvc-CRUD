package com.individual.DAO;

import com.individual.entity.Currenci;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class CurrenciDAOImp implements CurrenciDAO{

    private EntityManager entityManager;

    @Autowired
    public CurrenciDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Currenci> findAll() {
        TypedQuery<Currenci> query=entityManager.createQuery("from Currenci", Currenci.class);
        return query.getResultList();
    }
}
