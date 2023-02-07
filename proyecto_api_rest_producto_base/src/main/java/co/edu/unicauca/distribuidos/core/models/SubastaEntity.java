package co.edu.unicauca.distribuidos.core.models;

import java.util.List;

import co.edu.unicauca.distribuidos.core.services.DTO.ProductoDTO;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SubastaEntity {

    private Integer id;
    private Boolean activa;
    private Integer productoOfertado;
    // private List<ProductoDTO> productosSubastados;

    public SubastaEntity() {

    }
}
