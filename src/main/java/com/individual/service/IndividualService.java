package com.individual.service;

import com.individual.entity.Individual;

import java.util.List;

public interface IndividualService {
    List<Individual> findAll();
    Individual findById(String theId);
    void save(Individual theIndividual);

    void deletedById(String theId);
}
