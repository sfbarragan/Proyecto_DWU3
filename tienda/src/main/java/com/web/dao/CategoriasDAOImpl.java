package com.web.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.web.idao.ICategoriaDAO;
import com.web.model.Categorias;
import com.web.model.JPAUtil;

public class CategoriasDAOImpl implements ICategoriaDAO{
	
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();

	@Override
	public void guardar(Categorias categorias) {
		entity.getTransaction().begin();
		entity.persist(categorias);
		entity.getTransaction().commit();
	}

	@Override
	public void editar(Categorias categorias) {
		entity.getTransaction().begin();
		entity.merge(categorias);
		entity.getTransaction().commit();
	}

	@Override
	public Categorias buscar(int id_categorias) {
		Categorias oCategoria = new Categorias();
		oCategoria = entity.find(Categorias.class, id_categorias);
		//JPAUtil.shutdown();
		return oCategoria;
	}

	@Override
	public List<Categorias> obtenerCategorias() {
		List<Categorias> listaCategorias = new ArrayList<Categorias>();
		//sentencia JPQL 
		Query query = entity.createQuery("SELECT c FROM Categorias c");
		listaCategorias = query.getResultList();
		return listaCategorias;
	}

	@Override
	public void eliminar(int id_categorias) {
		Categorias oCategorias = new Categorias();
		oCategorias = entity.find(Categorias.class, id_categorias);
		entity.getTransaction().begin();
		entity.remove(oCategorias);
		entity.getTransaction().commit();
		
	}

}
