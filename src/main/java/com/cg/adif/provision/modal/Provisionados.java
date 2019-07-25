package com.cg.adif.provision.modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="provisionados")
public class Provisionados {
	
	@Id
	@NotNull
	@Column(name="codigo_sap_expediente")
	private String codigo_sap_expediente;
	
	@Column(name="cod_sociedad",columnDefinition="varchar(4) default '2000'")
    private String cod_sociedad;
	
	@Column(name="periodo_certificacion")
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date periodo;

	public String getCodigo_sap_expediente() {
		return codigo_sap_expediente;
	}

	public void setCodigo_sap_expediente(String codigo_sap_expediente) {
		this.codigo_sap_expediente = codigo_sap_expediente;
	}

	public String getCod_sociedad() {
		return cod_sociedad;
	}

	public void setCod_sociedad(String cod_sociedad) {
		this.cod_sociedad = cod_sociedad;
	}

	public Date getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Date periodo) {
		this.periodo = periodo;
	}
	


	

	

}
