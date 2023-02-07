package co.edu.unicauca.distribuidos.core.services.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SubastaDTO {

    private Integer productId;
    private Boolean abierto;
    private Integer valorSubasta;

    public SubastaDTO() {

    }

}
