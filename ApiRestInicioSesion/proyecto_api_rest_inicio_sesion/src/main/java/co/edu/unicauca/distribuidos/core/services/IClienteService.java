

package co.edu.unicauca.distribuidos.core.services;

import java.util.List;

import co.edu.unicauca.distribuidos.core.services.DTO.ClienteDTO;

public interface IClienteService {

	public List<ClienteDTO> findAll();		
	public ClienteDTO save(ClienteDTO product);	//registrar
        
}
