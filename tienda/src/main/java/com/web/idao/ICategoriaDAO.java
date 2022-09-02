package com.web.idao;

import java.util.List;

import com.web.model.Categorias;

public interface ICategoriaDAO {
	
	public void guardar(Categorias categorias);
	public void editar(Categorias categorias);
	public Categorias buscar(int id_categorias);
	public List<Categorias> obtenerCategorias();
	public void eliminar(int id_categorias);

}
