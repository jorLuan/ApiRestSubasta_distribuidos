package co.edu.unicauca.distribuidos.core.models;

import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class AdministradorEntity {
    private Integer id;		
        @NotNull
	private String nombres;
        @NotNull	
        private String apellidos;
        @NotNull
        private String login;
        @NotNull			
        private String contraseña;
	public AdministradorEntity()
	{
		
	}
}
