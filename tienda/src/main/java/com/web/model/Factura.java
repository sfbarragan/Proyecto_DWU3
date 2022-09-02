package com.web.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "factura")
public class Factura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_factura;
	
	@Column
	private int id_cliente;
	@Column
	private int id_modopago;
	@Column
	private Date fecha;
	@Column
	private String numeroFactura;

	
	public int getId_factura() {
		return id_factura;
	}
	public void setId_factura(int id_factura) {
		this.id_factura = id_factura;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public int getId_modopago() {
		return id_modopago;
	}
	public void setId_modopago(int id_modopago) {
		this.id_modopago = id_modopago;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getNumeroFactura() {
		return numeroFactura;
	}
	public void setNumeroFactura(String numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

	@Override
	public String toString() {
		return "Factura [id_factura=" + id_factura + ", id_cliente=" + id_cliente + ", id_modopago=" + id_modopago
				+ ", fecha=" + fecha + ", numeroFactura=" + numeroFactura + "]";
	}
	
	
}
