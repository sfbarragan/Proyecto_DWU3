package com.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detalle")
public class Detalle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_detalle;
	
	@Column
	private int id_factura;
	@Column
	private int id_producto;
	@Column
	private int cantidad;
	@Column
	private Double precio;
	@Column
	private Double precioUnitario;
	@Column
	private Double IVA;
	@Column
	private Double total;
	
	
	public int getId_detalle() {
		return id_detalle;
	}

	public void setId_detalle(int id_detalle) {
		this.id_detalle = id_detalle;
	}

	public int getId_factura() {
		return id_factura;
	}

	public void setId_factura(int id_factura) {
		this.id_factura = id_factura;
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public Double getIVA() {
		return IVA;
	}

	public void setIVA(Double iVA) {
		IVA = iVA;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Detalle [id_detalle=" + id_detalle + ", id_factura=" + id_factura + ", id_producto=" + id_producto
				+ ", cantidad=" + cantidad + ", precio=" + precio + ", precioUnitario=" + precioUnitario + ", IVA="
				+ IVA + ", total=" + total + "]";
	}

	

}
