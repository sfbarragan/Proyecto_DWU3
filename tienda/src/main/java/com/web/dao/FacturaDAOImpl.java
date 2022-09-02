package com.web.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.mysql.cj.jdbc.PreparedStatement;
import com.web.idao.IFacturaDAO;
import com.web.model.Cliente;
import com.web.model.Detalle;
import com.web.model.Factura;
import com.web.model.JPAUtil;
import com.web.model.Producto;

public class FacturaDAOImpl implements IFacturaDAO{
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	
	PreparedStatement ps;
	
	@Override
	public void generarCompra(Factura factura) {
		entity.getTransaction().begin();
		entity.persist(factura);
		entity.getTransaction().commit();
	}

	@Override
	public Factura buscarFactura(int id) {
		Factura oFactura = new Factura();
		oFactura = entity.find(Factura.class, id);
		//JPAUtil.shutdown();
		return oFactura;
	}
	
	

	@Override
	public Cliente buscarCliente(String cedula) {
		Cliente oCliente = new Cliente();
		oCliente = entity.find(Cliente.class, cedula);
		return oCliente;
	}

	@Override
	public Producto buscarProducto(int id) {
		Producto oProducto = new Producto();
		oProducto = entity.find(Producto.class, id);
		return oProducto;
	}
}
