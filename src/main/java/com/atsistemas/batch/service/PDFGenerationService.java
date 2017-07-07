package com.atsistemas.batch.service;

import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.json.JSONObject;

public interface PDFGenerationService {

	/**
	 * Permitirá generar un PDF a partir de un JSON concreto.
	 * (TEST)
	 * @param jObject
	 */
	public void generate(JSONObject jObject) throws MalformedURLException, IOException, InvalidFormatException;
}