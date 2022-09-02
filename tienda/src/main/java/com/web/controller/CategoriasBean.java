package com.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.web.dao.CategoriasDAOImpl;
import com.web.model.Categorias;


@ManagedBean(name = "categoriasBean")
@RequestScoped
public class CategoriasBean {
	CategoriasDAOImpl categoriaDAO = new CategoriasDAOImpl();
	List<Categorias> listaCategorias = new ArrayList<>();
	
	public List<Categorias> getListaCategorias() {
		return categoriaDAO.obtenerCategorias();
	}

	public void setListaCategorias(List<Categorias> listaCategorias) {
		this.listaCategorias = listaCategorias;
	}

	public String editar(int id_categorias) {
		Categorias oCategorias = new Categorias();
		oCategorias = categoriaDAO.buscar(id_categorias);
		System.out.println(oCategorias);
		
		//crear una coleccion de tipo mapa
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		
		//pasar los datos del cliente
		sessionMap.put("categorias", oCategorias);
		
		return "/faces/editar_categoria.xhtml";
	}
	
	public String actualizar(Categorias categorias) {
		categoriaDAO.editar(categorias);
		return "/faces/categorias.xhtml";
	}
	
	public String eliminar(int id_categorias) {
		categoriaDAO.eliminar(id_categorias);
		return "/faces/categorias.xhtml";
	}
	
	public String nuevo() {
		Categorias oCategorias = new Categorias();
		//crear una coleccion de tipo mapa
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
				
		//pasar los datos del cliente
		sessionMap.put("categorias", oCategorias);
		return "/faces/crear_categoria.xhtml";
	}
	
	public String guardar(Categorias categorias) {
		categoriaDAO.guardar(categorias);
		return "/faces/categorias.xhtml";
	}
}
