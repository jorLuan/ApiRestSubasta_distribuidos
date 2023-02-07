package co.edu.unicauca.distribuidos.core.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class ProductoEntity {
    private Integer id;		
        @NotNull
        @Size(min=5,max=50)
	private String nombre;	
        private int valorOferta;
	public ProductoEntity()
	{
		
	}
}
