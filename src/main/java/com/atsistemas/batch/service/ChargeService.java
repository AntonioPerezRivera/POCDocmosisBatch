package com.atsistemas.batch.service;

import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.atsistemas.batch.model.Charge;

public interface ChargeService {

	/**
	 * Permitirá generar un PDF a partir de un JSON concreto.
	 * (TEST)
	 * @param jObject
	 */
	public void persist(Charge c) throws Exception;
}