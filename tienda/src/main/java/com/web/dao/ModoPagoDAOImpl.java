package com.web.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.web.idao.IModoPagoDAO;
import com.web.model.JPAUtil;
import com.web.model.ModoPago;

public class ModoPagoDAOImpl implements IModoPagoDAO{
	
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();

	@Override
	public void guardar(ModoPago mpago) {
		entity.getTransaction().begin();
		entity.persist(mpago);
		entity.getTransaction().commit();
		
	}

	@Override
	public void editar(ModoPago mpago) {
		entity.getTransaction().begin();
		entity.merge(mpago);
		entity.getTransaction().commit();
		
	}

	@Override
	public ModoPago buscar(int id) {
		ModoPago oModoPago = new ModoPago();
		oModoPago = entity.find(ModoPago.class, id);
		//JPAUtil.shutdown();
		return oModoPago;
	}

	@Override
	public List<ModoPago> obtenerModoPago() {
		List<ModoPago> listaModoPago = new ArrayList<ModoPago>();
		//sentencia JPQL 
		Query query = entity.createQuery("SELECT p FROM ModoPago p");
		listaModoPago = query.getResultList();
		return listaModoPago;
	}

	@Override
	public void eliminar(int id) {
		ModoPago oModoPago = new ModoPago();
		oModoPago = entity.find(ModoPago.class, id);
		entity.getTransaction().begin();
		entity.remove(oModoPago);
		entity.getTransaction().commit();
		
	}

}
