package co.edu.unicauca.distribuidos.core.services.DTO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SubastaDTO {
    private Integer id;
    private Boolean activa;
    private Integer productoOfertado;
    // private List<ProductoDTO> productosSubastados;

    public SubastaDTO() {

    }

}
