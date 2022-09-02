package com.web.idao;

import java.util.List;

import com.web.model.ModoPago;

public interface IModoPagoDAO {
	

	public void guardar(ModoPago mpago);
	public void editar(ModoPago mpago);
	public ModoPago buscar(int id);
	public List<ModoPago> obtenerModoPago();
	public void eliminar(int id);

}
