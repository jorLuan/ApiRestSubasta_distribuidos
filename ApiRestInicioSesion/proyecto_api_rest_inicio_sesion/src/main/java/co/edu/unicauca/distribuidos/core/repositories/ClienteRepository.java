

package co.edu.unicauca.distribuidos.core.repositories;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;


import co.edu.unicauca.distribuidos.core.models.ClienteEntity;

@Repository
public class ClienteRepository {
	
	private ArrayList<ClienteEntity> listaDeClientes;
	
	public ClienteRepository()
	{
		this.listaDeClientes= new ArrayList<ClienteEntity>();
		cargarClientes();
	}
	
   public List<ClienteEntity> findAll()
   {
	   System.out.println("Invocando a listar usuarios");
	   return this.listaDeClientes;	
   }
	
	
	public ClienteEntity save(ClienteEntity producto)	
	{
		 System.out.println("Invocando a registrar usuario");
		 ClienteEntity objProducto=null;
		 if (this.listaDeClientes.add(producto))
		 {
			 objProducto=producto;
		 }
		 
		 return objProducto;
	}
	
	private void cargarClientes()
	{
		ClienteEntity objCliente1= new ClienteEntity(1,"jorge","andrade","jluligo@gmail.com","3146311948","jorLuan","1234");
		this.listaDeClientes.add(objCliente1);
		ClienteEntity objCliente2= new ClienteEntity(2, "juan","salamanca","ju@gmail.com","1234567890","juand","valentinateamo");
		this.listaDeClientes.add(objCliente2);

	}
}
