package com.distribuida.principal;

import com.distribuida.entities.Cliente;

public class ClientePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente =new Cliente(1,"1721441038","juan","taipe","tumbaco","096710456" ,"david@gmail.com");
		Cliente cliente2 =new Cliente(2,"1742441038","Diego","taipe","Tumbaco","096430456" ,"Jose@gmail.com");
      System.out.println(cliente.toString());
      
      System.out.println(cliente2.toString());
	}

}
