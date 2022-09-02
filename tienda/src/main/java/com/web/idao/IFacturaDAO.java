package com.web.idao;

import java.util.List;

import com.web.model.Cliente;
import com.web.model.Detalle;
import com.web.model.Factura;
import com.web.model.Producto;

public interface  IFacturaDAO {
	public void generarCompra(Factura factura);
	public Factura buscarFactura(int id);
	public Cliente buscarCliente(String cedula);
	public Producto buscarProducto(int id);
	
	
	
}
