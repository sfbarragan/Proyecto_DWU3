package com.web.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_producto;
	@Column
	private String nombre_producto;
	@Column(precision=6, scale=2)
	private float precio;
	@Column
	private int stock;
	@OneToOne
	@JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
	private Categoria id_categoria;
	@Column
	private char estado;
	@Lob
	@Column
	private byte[] foto;
	
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Categoria getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(Categoria id_categoria) {
		this.id_categoria = id_categoria;
	}
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Producto [id_producto=" + id_producto + ", nombre_producto=" + nombre_producto + ", precio=" + precio
				+ ", stock=" + stock + ", id_categoria=" + id_categoria + ", estado=" + estado + ", foto="
				+ Arrays.toString(foto) + "]";
	}
}
