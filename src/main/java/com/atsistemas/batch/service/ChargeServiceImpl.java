package com.atsistemas.batch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atsistemas.batch.dao.ChargeDao;
import com.atsistemas.batch.model.Charge;
import com.atsistemas.batch.service.ChargeService;

@Service("chargeService")
public class ChargeServiceImpl implements ChargeService {

	@Autowired
	private ChargeDao chargeDao;
	
	@Override
	public void persist(Charge c) throws Exception {
		chargeDao.save(c);
	}

}
