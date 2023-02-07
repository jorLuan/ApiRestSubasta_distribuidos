
package models;

import java.util.Date;

public class Cliente {
	
    private Integer id;		

	private String nombres;
       	
        private String apellidos;
        
        private String correo;	
        
        private String telefono;
        
        private String login;
        			
        private String contraseña;
       
	public Cliente(Integer id, String nombres, String apellidos, String correo, String telefono, String login, String contraseña) {
            super();
            this.id = id;
            this.nombres = nombres;
            this.apellidos = apellidos;
            this.correo = correo;
            this.telefono = telefono;
            this.login = login;
            this.contraseña = contraseña;
    }	
	public Cliente()
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
	
	

 

	
	
}
