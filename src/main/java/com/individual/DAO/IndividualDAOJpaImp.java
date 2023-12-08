package com.individual.DAO;

import com.individual.entity.Currenci;
import com.individual.entity.Individual;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IndividualDAOJpaImp implements IndividualDAO{

    private EntityManager entityManager;

    @Autowired
    public IndividualDAOJpaImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Individual> findAll() {
        TypedQuery<Individual> employees=entityManager.createQuery("from Individual order by firstName", Individual.class);
        return employees.getResultList();
    }

    @Override
    public Individual findIndividualById(String theId) {
       Individual theIndividual=entityManager.find(Individual.class,theId);

       return theIndividual;
    }

    //NOTE:We don't use @Trasactional at DAO layer It will be handled al service layer

    @Override
    public void save(Individual theIndividual) {
        //if id ==0 then insert/save else updated
       // Individual dbIndividual=entityManager.merge(theIndividual);
        //return entityManager.merge(dbIndividual);
         entityManager.persist(theIndividual);
    }

    @Transactional
    @Override
    public void deletedIndividualById(String theId) {
        //find Individual by id
        Individual theIndividual=entityManager.find(Individual.class,theId);
        entityManager.remove(theIndividual);
    }

    @Override
    public Currenci findCurrencyById(String theId) {
           Currenci theCurrency= entityManager.find(Currenci.class,theId);
        return theCurrency;
    }

    @Transactional
    @Override
    public void deletedCurrencyById(String theId) {

        //retrieve Currency
        Currenci theCurrency=entityManager.find(Currenci.class,theId);

        //remove the associate Object reference
        //break reference link
        theCurrency.getIndividual().setCurrency(null);

        entityManager.remove(theCurrency);
    }
}





