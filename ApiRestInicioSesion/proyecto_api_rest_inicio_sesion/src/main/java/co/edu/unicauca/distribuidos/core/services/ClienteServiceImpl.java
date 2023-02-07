

package co.edu.unicauca.distribuidos.core.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicauca.distribuidos.core.models.ClienteEntity;
import co.edu.unicauca.distribuidos.core.repositories.ClienteRepository;
import co.edu.unicauca.distribuidos.core.services.DTO.ClienteDTO;


@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private ClienteRepository servicioAccesoBaseDatos;

	@Autowired
    private ModelMapper modelMapper;

	@Override
	public List<ClienteDTO> findAll() {	
		
		List<ClienteEntity> clientesEntity= this.servicioAccesoBaseDatos.findAll();
		List<ClienteDTO> clientesDTO=this.modelMapper.map(clientesEntity, new TypeToken<List<ClienteDTO>>() {}.getType());
		return clientesDTO;
	}
	@Override
	public ClienteDTO save(ClienteDTO cliente) {
		ClienteEntity clienteEntity=this.modelMapper.map(cliente, ClienteEntity.class);
		ClienteEntity objCLienteEntity= this.servicioAccesoBaseDatos.save(clienteEntity);
		ClienteDTO clienteDTO=this.modelMapper.map(objCLienteEntity, ClienteDTO.class);
		return clienteDTO;		
	}
}
