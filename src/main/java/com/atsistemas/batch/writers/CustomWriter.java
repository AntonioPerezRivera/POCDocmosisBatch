package com.atsistemas.batch.writers;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.dozer.DozerBeanMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

import com.atsistemas.batch.model.Charge;
import com.atsistemas.batch.service.ChargeService;
import com.atsistemas.batch.service.PDFGenerationService;


@ComponentScan("com.example.service")
public class CustomWriter implements ItemWriter<Charge> {

	@Autowired
	DozerBeanMapper dozer;
	
	@Autowired
	private PDFGenerationService pdfService;
	
	@Autowired
	private ChargeService cService;
	

	@Override
	public void write(List<? extends Charge> items) throws Exception {
		System.out.println("Enviando datos..");
		sendDataToDocmosis(items);
	}
	
	private void sendDataToDocmosis(List<? extends Charge> items) throws Exception{
		JSONObject jObject = new JSONObject();
		jObject.put("accessKey", "0UAD-KLTP-JAKO-KKIA-DBBI-1ELH-WBKQ-KS91-23ED-8-4890");
		jObject.put("templateName", "pagoTemplate.doc");
		jObject.put("outputName", "outputFile.pdf");
		
		JSONObject data = new JSONObject();
		
		JSONArray jArray = new JSONArray();
		for(Charge item : items){
			cService.persist(item);
			JSONObject jO = assignJObject(item);
			jArray.put(jO);
		}
		
		data.put("reclamaciones", jArray);
		jObject.put("data", data);
		
		try {
			pdfService.generate(jObject);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private JSONObject assignJObject(Charge c) {

		JSONObject jO = new JSONObject();
		jO.put("tipo_reg", c.getTipo_reg());
		jO.put("identificador", c.getIdentificador());
		jO.put("ape_nom_razon_social", c.getApe_nom_razon_social());
		jO.put("id_operacion", c.getId_operacion());
		jO.put("cod_producto_financiero", c.getCod_producto_financiero());
		jO.put("importe_reclamado", c.getImporte_reclamado());
		jO.put("fecha_vcto_primera_cuota", c.getFecha_vcto_primera_cuota());
		jO.put("naturaleza_persona", c.getNaturaleza_persona());
		jO.put("direccion", c.getDireccion());
		jO.put("municipio", c.getMunicipio());
		jO.put("provincia", c.getProvincia());
		jO.put("cp", c.getCp());
		jO.put("pais", c.getPais());
		jO.put("tipo_carta", c.getTipo_carta());
		jO.put("codigo_texto", c.getCodigo_texto());
		jO.put("telefono", c.getTelefono());
		jO.put("email", c.getEmail());
		jO.put("marketing", c.getMarketing());
		jO.put("observaciones", c.getObservaciones());

		return jO;
	}
	

}
