package com.atsistemas.batch.mappers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.support.rowset.RowSet;

import com.atsistemas.batch.model.Charge;
 
public class ChargeExcelRowMapper implements RowMapper<Charge> {
 
    @Override
    public Charge mapRow(RowSet rowSet) throws Exception {
        Charge charge = new Charge();
        
        charge.setTipo_reg(rowSet.getColumnValue(0));
        charge.setIdentificador(rowSet.getColumnValue(1));
        charge.setApe_nom_razon_social(rowSet.getColumnValue(2));
        charge.setId_operacion(rowSet.getColumnValue(3));
        charge.setCod_producto_financiero(rowSet.getColumnValue(4));
        charge.setImporte_reclamado(rowSet.getColumnValue(5));
        charge.setFecha_vcto_primera_cuota(rowSet.getColumnValue(6));
        charge.setNaturaleza_persona(rowSet.getColumnValue(7));
        charge.setDireccion(rowSet.getColumnValue(8));
        charge.setMunicipio(rowSet.getColumnValue(9));
        charge.setProvincia(rowSet.getColumnValue(10));
        charge.setCp(rowSet.getColumnValue(11));
        charge.setPais(rowSet.getColumnValue(12));
        charge.setTipo_carta(rowSet.getColumnValue(13));
        charge.setCodigo_texto(rowSet.getColumnValue(14));
        charge.setTelefono(rowSet.getColumnValue(15));
        charge.setEmail(rowSet.getColumnValue(16));
        charge.setMarketing(rowSet.getColumnValue(17));
        charge.setObservaciones(rowSet.getColumnValue(18));

        return charge;
    }
    
}