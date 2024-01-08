package com.individual.DAO;

import com.individual.entity.Currenci;
import com.individual.entity.Individual;

import java.util.List;

public interface IndividualDAO {
    List<Individual> findAll();

    Individual findIndividualById(int theId);
     void save(Individual theIndividual);
    void update(Individual theIndividual);
    void deletedIndividualById(int theId);
    Currenci findCurrencyById(int theId);

    void deletedCurrencyById(int theId);

}
