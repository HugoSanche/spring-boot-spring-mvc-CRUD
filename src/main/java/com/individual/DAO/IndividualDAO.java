package com.individual.DAO;

import com.individual.entity.Currenci;
import com.individual.entity.Individual;

import java.util.List;

public interface IndividualDAO {
    List<Individual> findAll();

    Individual findIndividualById(String theId);
     void save(Individual theIndividual);

    void deletedIndividualById(String theId);
    Currenci findCurrencyById(String theId);

    void deletedCurrencyById(String theId);

}
