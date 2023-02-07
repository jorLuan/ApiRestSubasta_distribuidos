package co.edu.unicauca.distribuidos.core.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SubastaEntity {

    private Integer productId;
    private Boolean abierto;
    private Integer valorSubasta;

    public SubastaEntity() {

    }
}
