package com.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "modo_pago")
public class ModoPago {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_modopago;
	
	@Column
	private String nombre;
	

	public int getId_modopago() {
		return id_modopago;
	}

	public void setId_modopago(int id_modopago) {
		this.id_modopago = id_modopago;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "ModoPago [id_modopago=" + id_modopago + ", nombre=" + nombre + "]";
	}
	
	
}
