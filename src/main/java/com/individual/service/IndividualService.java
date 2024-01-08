package com.individual.service;

import com.individual.entity.Individual;

import java.util.List;

public interface IndividualService {
    List<Individual> findAll();
    Individual findById(int theId);
    void save(Individual theIndividual);
    void update(Individual theIndividual);
    void deletedById_X(int theId);

}
