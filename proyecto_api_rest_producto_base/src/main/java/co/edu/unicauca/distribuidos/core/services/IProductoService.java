
package co.edu.unicauca.distribuidos.core.services;

import java.util.List;

import co.edu.unicauca.distribuidos.core.services.DTO.ProductoDTO;

public interface IProductoService {

	public List<ProductoDTO> findAll();

	public ProductoDTO findById(Integer id);

	public ProductoDTO save(ProductoDTO product); // registrar

}
