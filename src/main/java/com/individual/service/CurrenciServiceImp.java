package com.individual.service;


import com.individual.DAO.CurrenciDAOImp;
import com.individual.entity.Currenci;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrenciServiceImp implements CurrenciService{

    CurrenciDAOImp currenciDAOImp;

    @Autowired
    public CurrenciServiceImp(CurrenciDAOImp currenciDAOImp) {
        this.currenciDAOImp = currenciDAOImp;
    }

    @Override
    public List<Currenci> findAll() {
        return currenciDAOImp.findAll();
    }
}
