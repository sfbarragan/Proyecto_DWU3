package com.web.idao;

import java.util.List;

import com.web.model.Categoria;
import com.web.model.Producto;

public interface IProductoDAO {

	public void guardarProducto(Producto producto);
	public void editarProducto(Producto producto);
	public Producto buscarProducto(int id);
	public List<Producto> obtenerProductos();
	public void eliminarProducto(int id);
	public List<Categoria> obtenerCategorias();
}
