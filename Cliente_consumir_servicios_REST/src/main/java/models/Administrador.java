
package models;

import java.util.Date;
import javax.ws.rs.client.WebTarget;

public class Administrador {
	
    private Integer id;		

	private String nombres;
       	
        private String apellidos;
        
        private String login;
        			
        private String contraseña;
       
	public Administrador(Integer id, String nombres, String apellidos, String login, String contraseña) {
            super();
            this.id = id;
            this.nombres = nombres;
            this.apellidos = apellidos;
            this.login = login;
            this.contraseña = contraseña;
    }	
	public Administrador()
	{
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public WebTarget target(String endPoint) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
	
	

 

	
	
}
