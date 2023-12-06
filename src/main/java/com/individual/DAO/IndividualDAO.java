package com.individual.DAO;

import com.individual.entity.Individual;

import java.util.List;

public interface IndividualDAO {
    List<Individual> findAll();

    Individual findIndividualById(int theId);
     void save(Individual theIndividual);

    void deletedById(int theId);
}
