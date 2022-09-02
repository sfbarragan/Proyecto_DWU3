package com.web.idao;

import java.util.List;

import com.web.model.Detalle;
import com.web.model.Factura;
import com.web.model.Producto;

public interface  IDetalleDAO {
	public void generarCompra(Factura factura);
	public Factura buscarFactura(int id);
	
}
