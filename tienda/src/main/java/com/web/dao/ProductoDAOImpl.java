package com.web.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.web.idao.IProductoDAO;
import com.web.model.JPAUtil;
import com.web.model.Producto;

public class ProductoDAOImpl implements IProductoDAO {

	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	
	@Override
	public List<Producto> obtenerProductos() {
		List<Producto> listaProductos = new ArrayList<Producto>();
		//sentencia JPQL 
		Query query = entity.createQuery("SELECT p FROM producto p");
		listaProductos = query.getResultList();
		return listaProductos;
	}

	//Se comentan todas las shutdown para que estén en escucha
	
	@Override
	public void guardarProducto(Producto producto) {
		entity.getTransaction().begin();
		entity.persist(producto);
		entity.getTransaction().commit();
		//JPAUtil.shutdown();
	}

	@Override
	public void editarProducto(Producto producto) {
		entity.getTransaction().begin();
		entity.merge(producto);
		entity.getTransaction().commit();
		//JPAUtil.shutdown();
	}

	@Override
	public Producto buscarProducto(int id) {
		Producto oProducto = new Producto();
		oProducto = entity.find(Producto.class, id);
		//JPAUtil.shutdown();
		return oProducto;
	}
	
	@Override
	public void eliminarProducto(int id) {
		Producto oProducto = new Producto();
		oProducto = entity.find(Producto.class, id);
		entity.getTransaction().begin();
		entity.remove(oProducto);
		entity.getTransaction().commit();
	}

}
