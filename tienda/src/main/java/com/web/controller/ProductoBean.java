package com.web.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.web.dao.ProductoDAOImpl;
import com.web.model.Categoria;
import com.web.model.Producto;

@ManagedBean(name = "productoBean")
@SessionScoped
public class ProductoBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ProductoDAOImpl productoDAO = new ProductoDAOImpl();
	List<Producto> listaProductos = new ArrayList<>();
	List<Categoria> listaCategorias = getListaCategorias();
	
	public List<Categoria> getListaCategorias() {
		return productoDAO.obtenerCategorias();
	}
	
	public List<Producto> getListaProductos() {
		return productoDAO.obtenerProductos();
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	public String editarProducto(int id) {
		Producto oProducto = new Producto();
		oProducto = productoDAO.buscarProducto(id);
		
		//crear una colecion de tipo mapa
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		
		sessionMap.put("producto", oProducto);
		return "/faces/editarProducto.xhtml";
	}
	
	public String nuevoProducto() {
		Producto oProducto = new Producto();
		//crear una colecion de tipo mapa
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		
		//pasar los datos del cliente
		sessionMap.put("producto", oProducto);
		
		return "/faces/crearProducto.xhtml";
	}
	
	public String actualizarProducto(Producto producto) {
		productoDAO.editarProducto(producto);
		return "/faces/listaProductos.xhtml";
	}
	
	public String eliminarProducto(int id) {
		productoDAO.eliminarProducto(id);
		return "/faces/listaProductos.xhtml";
	}

	
	public String guardarProducto(Producto producto) {
		productoDAO.guardarProducto(producto);
		return "/faces/listaProductos.xhtml";
	}
}
