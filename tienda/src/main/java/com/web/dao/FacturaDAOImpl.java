package com.web.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.mysql.cj.jdbc.PreparedStatement;
import com.web.idao.IDetalleDAO;
import com.web.model.Cliente;
import com.web.model.Detalle;
import com.web.model.Factura;
import com.web.model.JPAUtil;

public class FacturaDAOImpl implements IDetalleDAO{
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	
	PreparedStatement ps;
	
	@Override
	public void generarCompra(Factura factura) {
		int id_factura;
		entity.getTransaction().begin();
		entity.persist(factura);
		entity.getTransaction().commit();

		id_factura = factura.getId_factura();
		
		for(Detalle detalle: factura.getDetalleCompras()){
			entity.getTransaction().begin();
			entity.persist(detalle);
			entity.getTransaction().commit();
		}
	}

	@Override
	public Factura buscarFactura(int id) {
		Factura oFactura = new Factura();
		oFactura = entity.find(Factura.class, id);
		//JPAUtil.shutdown();
		return oFactura;
	}
}
