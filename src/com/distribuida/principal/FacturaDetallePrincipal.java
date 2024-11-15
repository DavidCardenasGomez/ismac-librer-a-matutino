package com.distribuida.principal;

import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;
import com.distribuida.entities.Libro;

public class FacturaDetallePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Factura factura =new Factura(1,"FAC-0001",new java.util.Date(),100.25,15.25,null);
Libro libro =new Libro (1, "El Quijote", "Editorial A", 300, "Primera", "Español",1995, "Un clásico de la literatura", "Dura", "123456789", 5,"Imagen1.png", "Normal", 15.99, 101, 201, null);


FacturaDetalle facturadetalle =new FacturaDetalle(1,3,40.50, factura, libro);
System.out.println(facturadetalle.toString());
	}

}
