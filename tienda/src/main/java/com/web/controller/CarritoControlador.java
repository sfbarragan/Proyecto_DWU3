package com.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.web.dao.FacturaDAOImpl;
import com.web.model.Cliente;
import com.web.model.Factura;


@ManagedBean(name = "carritoControlador")
@RequestScoped
public class CarritoControlador {
	FacturaDAOImpl facturaDAO = new FacturaDAOImpl();
	
	
	public String nuevo() {
		Factura oFactura = new Factura();
		//crear una coleccion de tipo mapa
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
				
		//pasar los datos del cliente
		sessionMap.put("factura", oFactura);
		return "/faces/catalogo.xhtml";
	}

	
	
	public String guardar(Factura factura) {
		facturaDAO.generarCompra(factura);
		return "/faces/catalogo.xhtml";
	}
}

