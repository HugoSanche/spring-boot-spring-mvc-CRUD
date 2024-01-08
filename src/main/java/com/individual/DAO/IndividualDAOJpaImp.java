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
    public Individual findIndividualById(int theId) {
       Individual theIndividual=entityManager.find(Individual.class,theId);

       return theIndividual;
    }

    //NOTE:We don't use @Trasactional at DAO layer It will be handled al service layer

    @Override
    public void save(Individual theIndividual) {

        System.out.println("Save the individual "+theIndividual);
        try {
            entityManager.persist(theIndividual);
        }catch (Exception e){
            System.out.println(e);
        }
    }


    @Override
    public void update(Individual theIndividual) {
        System.out.println("Update the individual "+theIndividual);
        try {
            entityManager.merge(theIndividual);
        }catch (Exception e){
            System.out.println(e);
        }
    }


    @Transactional
    @Override
    public void deletedIndividualById(int theId) {
        //find Individual by id
        Individual theIndividual=entityManager.find(Individual.class,theId);

       theIndividual.setCurrency(null);
       entityManager.merge(theIndividual);
        System.out.println("Delete individual by Id "+theIndividual);
        entityManager.remove(theIndividual);
    }

    @Override
    public Currenci findCurrencyById(int theId) {
           Currenci theCurrency= entityManager.find(Currenci.class,theId);
        return theCurrency;
    }



    @Transactional
    @Override
    public void deletedCurrencyById(int theId) {

        System.out.println("TEST");
        //retrieve Currency
        Currenci theCurrency=entityManager.find(Currenci.class,theId);

        //remove the associate Object reference
        //break reference link

        System.out.println("Uno");
      //  theCurrency.getIndividual().setCurrency(null);
//
//        System.out.println("Dos");
//        theCurrency.getIndividual().setCountry(null);
//        System.out.println("Tres");
//
//        theCurrency.getCountries().setCurrency(null);
//        System.out.println("Tres");

       // System.out.println(theCurrency.getIndividual());

        System.out.println("The Currency "+theCurrency);
        entityManager.remove(theCurrency);
    }
}





