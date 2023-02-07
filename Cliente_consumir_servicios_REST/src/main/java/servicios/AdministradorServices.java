package servicios;

import java.util.Date;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import models.Administrador;
import org.glassfish.jersey.jackson.JacksonFeature;

import models.Cliente;

public class AdministradorServices {
	
	private String endPoint;
	private Client objAdministradorPeticiones; 
	
	public AdministradorServices()
	{
		this.endPoint="http://localhost:8080/api/admin";
		this.objAdministradorPeticiones = ClientBuilder.newClient().register(new JacksonFeature());
	}
	
	public List<Administrador> listarClientes()
	{
		List<Administrador> listaAdministrador=null;			
		
		WebTarget target = this.objAdministradorPeticiones.target(this.endPoint);
		
		Builder objPeticion=target.request(MediaType.APPLICATION_JSON);
		
		listaAdministrador = objPeticion.get(new GenericType<List<Administrador>>() {});	
		
		return listaAdministrador;
	}
	
	
	public Administrador registrarAdmin(Administrador objAdministradorRegistar)
	{
		Administrador  objAdministrador=null;
		
		WebTarget target = this.objAdministradorPeticiones.target(this.endPoint);	    
		
                Entity<Administrador> data = Entity.entity(objAdministradorRegistar, MediaType.APPLICATION_JSON_TYPE);

                Builder objPeticion=target.request(MediaType.APPLICATION_JSON_TYPE);

                objAdministrador = objPeticion.post(data, Administrador.class);		
	    
		return objAdministrador;
	}
	
}
