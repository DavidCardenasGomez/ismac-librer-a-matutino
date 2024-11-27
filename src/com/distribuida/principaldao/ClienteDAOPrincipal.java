package com.distribuida.principaldao;
 
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;
 
public class ClienteDAOPrincipal {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl", ClienteDAO.class);
		
		
		
		//insert
		//Cliente  cliente = new Cliente(0,"1721441036","juan","taipe","Quito0","0967107486","jtaipe@correo.com");
		//clienteDAO.add(cliente);
		// update
		//Cliente cliente2 = new Cliente(39,"1701234666","Juan6","Taipe6","Quito","096710456","jtaipe6@correo.com");
		//clienteDAO.up(cliente2);
		
		//findone
		try {
			Cliente cliente3 = clienteDAO.findOne(41);
			System.out.println(cliente3.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Cliente cliente3= clienteDAO.findOne(39);
		//System.out.println(cliente3.toString());
		//dldete
		//clienteDAO.del(41);
		
		
		List<Cliente> clientes = clienteDAO.findAll();
		for (Cliente item : clientes) {
			System.out.println(item.toString());
		}
		context.close();
	}
}