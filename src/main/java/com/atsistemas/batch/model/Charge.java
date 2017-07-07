package com.atsistemas.batch.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "charge")
public class Charge {

	@Column(name = "tipo_reg")
	private String tipo_reg;
	
	@Id
	@Column(name = "charge_id")
	private String identificador;
	
	@Column(name = "ape_nom_razon_social")
	private String ape_nom_razon_social;
	
	@Column(name = "id_operacion")
	private String id_operacion;
	
	@Column(name = "cod_producto_financiero")
	private String cod_producto_financiero;
	
	@Column(name = "importe_reclamado")
	private String importe_reclamado;
	
	@Column(name = "fecha_vcto_primera_cuota")
	private String fecha_vcto_primera_cuota;
	
	@Column(name = "naturaleza_persona")
	private String naturaleza_persona;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "municipio")
	private String municipio;
	
	@Column(name = "provincia")
	private String provincia;
	
	@Column(name = "cp")
	private String cp;
	
	@Column(name = "pais")
	private String pais;
	
	@Column(name = "tipo_carta")
	private String tipo_carta;
	
	@Column(name = "codigo_texto")
	private String codigo_texto;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "marketing")
	private String marketing;
	
	@Column(name = "observaciones")
	private String observaciones;

	
	public Charge(String tipo_reg, String id, String ape_nom_razon_social, String id_operacion,
			String cod_producto_financiero, String importe_reclamado, String fecha_vcto_primera_cuota,
			String naturaleza_persona, String direccion, String municipio, String provincia, String cp, String pais,
			String tipo_carta, String codigo_texto, String telefono, String email, String marketing,
			String observaciones) {
		
		super();
		this.tipo_reg = tipo_reg;
		this.identificador = id;
		this.ape_nom_razon_social = ape_nom_razon_social;
		this.id_operacion = id_operacion;
		this.cod_producto_financiero = cod_producto_financiero;
		this.importe_reclamado = importe_reclamado;
		this.fecha_vcto_primera_cuota = fecha_vcto_primera_cuota;
		this.naturaleza_persona = naturaleza_persona;
		this.direccion = direccion;
		this.municipio = municipio;
		this.provincia = provincia;
		this.cp = cp;
		this.pais = pais;
		this.tipo_carta = tipo_carta;
		this.codigo_texto = codigo_texto;
		this.telefono = telefono;
		this.email = email;
		this.marketing = marketing;
		this.observaciones = observaciones;
	}
	
	

	public Charge() {
		super();
	}



	public String getTipo_reg() {
		return tipo_reg;
	}

	public void setTipo_reg(String tipo_reg) {
		this.tipo_reg = tipo_reg;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String id) {
		this.identificador = id;
	}

	public String getApe_nom_razon_social() {
		return ape_nom_razon_social;
	}

	public void setApe_nom_razon_social(String ape_nom_razon_social) {
		this.ape_nom_razon_social = ape_nom_razon_social;
	}

	public String getId_operacion() {
		return id_operacion;
	}

	public void setId_operacion(String id_operacion) {
		this.id_operacion = id_operacion;
	}

	public String getCod_producto_financiero() {
		return cod_producto_financiero;
	}

	public void setCod_producto_financiero(String cod_producto_financiero) {
		this.cod_producto_financiero = cod_producto_financiero;
	}

	public String getImporte_reclamado() {
		return importe_reclamado;
	}

	public void setImporte_reclamado(String importe_reclamado) {
		this.importe_reclamado = importe_reclamado;
	}

	public String getFecha_vcto_primera_cuota() {
		return fecha_vcto_primera_cuota;
	}

	public void setFecha_vcto_primera_cuota(String fecha_vcto_primera_cuota) {
		this.fecha_vcto_primera_cuota = fecha_vcto_primera_cuota;
	}

	public String getNaturaleza_persona() {
		return naturaleza_persona;
	}

	public void setNaturaleza_persona(String naturaleza_persona) {
		this.naturaleza_persona = naturaleza_persona;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTipo_carta() {
		return tipo_carta;
	}

	public void setTipo_carta(String tipo_carta) {
		this.tipo_carta = tipo_carta;
	}

	public String getCodigo_texto() {
		return codigo_texto;
	}

	public void setCodigo_texto(String codigo_texto) {
		this.codigo_texto = codigo_texto;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMarketing() {
		return marketing;
	}

	public void setMarketing(String marketing) {
		this.marketing = marketing;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "Charge [tipo_reg=" + tipo_reg + ", id=" + identificador + ", ape_nom_razon_social=" + ape_nom_razon_social
				+ ", id_operacion=" + id_operacion + ", cod_producto_financiero=" + cod_producto_financiero
				+ ", importe_reclamado=" + importe_reclamado + ", fecha_vcto_primera_cuota=" + fecha_vcto_primera_cuota
				+ ", naturaleza_persona=" + naturaleza_persona + ", direccion=" + direccion + ", municipio=" + municipio
				+ ", provincia=" + provincia + ", cp=" + cp + ", pais=" + pais + ", tipo_carta=" + tipo_carta
				+ ", codigo_texto=" + codigo_texto + ", telefono=" + telefono + ", email=" + email + ", marketing="
				+ marketing + ", observaciones=" + observaciones + "]";
	}
	
}