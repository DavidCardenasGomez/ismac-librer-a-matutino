package com.distribuida.principal;

import com.distribuida.entities.Autor;

public class AutorPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //clase principal autor para gestionar la abse de datos
	    Autor autor1 = new Autor(1, "Gabriel", "Colombiana", "gabriel.gm@gmail.com", "09393923", null);
        Autor autor2 = new Autor(2, "Isabel", "Allende", "Chilena", "isabel.allende@gmail.com", null);

        // Mostrar información de los autores
        System.out.println(autor1.toString());
        System.out.println(autor2.toString());
	}

}
