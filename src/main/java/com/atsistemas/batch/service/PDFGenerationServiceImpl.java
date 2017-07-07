package com.atsistemas.batch.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.atsistemas.batch.constants.ConstantsCommon;
import com.atsistemas.batch.service.PDFGenerationService;

@Service("pdfService")
public class PDFGenerationServiceImpl implements PDFGenerationService {

	@Override
	public void generate(JSONObject json) throws MalformedURLException, IOException, InvalidFormatException {
		
		final String url = ConstantsCommon.DWS_RENDER_URL;
		String outputFileName = "outfile.pdf";
		
		File f = this.sendData(url, json, outputFileName);
		
	}

	
	private File sendData(String url, JSONObject json, String outputFileName) throws IOException {

		CloseableHttpClient httpClient = HttpClientBuilder.create().build();
		File file = new File(outputFileName);
		FileOutputStream fos = new FileOutputStream(file);

		try {
			HttpPost request = new HttpPost(url);
			String jsonString = json.toString();
			StringEntity params = new StringEntity(jsonString, "UTF-8");
			request.addHeader("content-type", "application/json");
			request.setEntity(params);
			CloseableHttpResponse conn = httpClient.execute(request);

			int status = conn.getStatusLine().getStatusCode();

			if (status == 200) {

				byte[] buff = new byte[1000];
				int bytesRead = 0;

				try {
					while ((bytesRead = conn.getEntity().getContent().read(buff, 0, buff.length)) != -1) {
						fos.write(buff, 0, bytesRead);
					}
				} finally {
					fos.close();
				}
				
				System.out.println("Fichero creado:" + file.getAbsolutePath());

			} else {
				System.err.println("Error al crear el fichero = " + status);
				System.err.println("Mensaje:" + conn.getStatusLine().getReasonPhrase());
			}

		} catch (Exception ex) {
		} finally {
			httpClient.close();
		}
		return file;
	}

}