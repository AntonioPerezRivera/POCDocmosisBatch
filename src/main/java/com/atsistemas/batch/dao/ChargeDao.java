package com.atsistemas.batch.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.atsistemas.batch.model.Charge;

@Repository
public interface ChargeDao extends CrudRepository<Charge, Integer> {
	
}