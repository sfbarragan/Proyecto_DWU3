package com.web.controller;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.web.model.ModoPago;
import com.web.dao.ModoPagoDAOImpl;

@ManagedBean(name = "modoPagoBean")
@RequestScoped
public class ModoPagoBean {
	
	ModoPagoDAOImpl modoPagoDAO = new ModoPagoDAOImpl();
	List<ModoPago> listaModoPago = new ArrayList<>();
	
	public List<ModoPago> getListaModoPago() {
		return modoPagoDAO.obtenerModoPago();
	}

	public void setListaModoPago(List<ModoPago> listaModoPago) {
		this.listaModoPago = listaModoPago;
	}

	public String editar(int id) {
		ModoPago oModoPago = new ModoPago();
		oModoPago = modoPagoDAO.buscar(id);
		System.out.println(oModoPago);
		
		//crear una coleccion de tipo mapa
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		
		//pasar los datos del cliente
		sessionMap.put("modopago", oModoPago);
		
		return "/faces/editar_modo.xhtml";
	}
	
	public String actualizar(ModoPago mpago) {
		modoPagoDAO.editar(mpago);
		return "/faces/modopago.xhtml";
	}
	
	public String eliminar(int id) {
		modoPagoDAO.eliminar(id);
		return "/faces/modopago.xhtml";
	}
	
	public String nuevo() {
		ModoPago oModoPago = new ModoPago();
		//crear una coleccion de tipo mapa
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
				
		//pasar los datos del cliente
		sessionMap.put("modopago", oModoPago);
		return "/faces/crear_modo.xhtml";
	}
	
	public String guardar(ModoPago mpago) {
		modoPagoDAO.guardar(mpago);
		return "/faces/modopago.xhtml";
	}

}
