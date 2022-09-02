package com.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cliente;
	@Column
	private String nombre_cliente;
	@Column
	private String apellido_cliente;
	@Column
	private String direccion;
	@Column
	private String cedula;
	@Column
	private String telefono;
	@Column
	private String email;
	@Column
	private String contrasenia;
	@Column
	private String rol_id;
	



	public int getId_cliente() {
		return id_cliente;
	}



	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}



	public String getNombre_cliente() {
		return nombre_cliente;
	}



	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}



	public String getApellido_cliente() {
		return apellido_cliente;
	}



	public void setApellido_cliente(String apellido_cliente) {
		this.apellido_cliente = apellido_cliente;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getCedula() {
		return cedula;
	}



	public void setCedula(String cedula) {
		this.cedula = cedula;
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



	public String getContrasenia() {
		return contrasenia;
	}



	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}



	public String getRol_id() {
		return rol_id;
	}



	public void setRol_id(String rol_id) {
		this.rol_id = rol_id;
	}



	@Override
	public String toString() {
		return "Cliente [id_cliente=" + id_cliente + ", nombre_cliente=" + nombre_cliente + ", apellido_cliente="
				+ apellido_cliente + ", direccion=" + direccion + ", cedula=" + cedula + ", telefono=" + telefono
				+ ", email=" + email + ", contrasenia=" + contrasenia + ", rol_id=" + rol_id + "]";
	}
	
	
	
}
