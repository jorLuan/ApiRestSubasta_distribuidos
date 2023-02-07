

package co.edu.unicauca.distribuidos.core.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicauca.distribuidos.core.models.ProductoEntity;
import co.edu.unicauca.distribuidos.core.repositories.ProductoRepository;
import co.edu.unicauca.distribuidos.core.services.DTO.ProductoDTO;


@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private ProductoRepository servicioAccesoBaseDatos;

	@Autowired
    private ModelMapper modelMapper;

	@Override
	public List<ProductoDTO> findAll() {	
		
		List<ProductoEntity> clientesEntity= this.servicioAccesoBaseDatos.findAll();
		List<ProductoDTO> clientesDTO=this.modelMapper.map(clientesEntity, new TypeToken<List<ProductoDTO>>() {}.getType());
		return clientesDTO;
	}

	@Override
	public ProductoDTO findById(Integer id) {		
		ProductoEntity objCLienteEntity= this.servicioAccesoBaseDatos.findById(id);
		ProductoDTO clienteDTO=this.modelMapper.map(objCLienteEntity, ProductoDTO.class);
		return clienteDTO;
	}

	@Override
	public ProductoDTO save(ProductoDTO cliente) {
		ProductoEntity clienteEntity=this.modelMapper.map(cliente, ProductoEntity.class);
		ProductoEntity objCLienteEntity= this.servicioAccesoBaseDatos.save(clienteEntity);
		ProductoDTO clienteDTO=this.modelMapper.map(objCLienteEntity, ProductoDTO.class);
		return clienteDTO;		
	}
}
