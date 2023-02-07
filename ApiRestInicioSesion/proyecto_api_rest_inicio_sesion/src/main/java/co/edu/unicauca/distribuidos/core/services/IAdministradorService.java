

package co.edu.unicauca.distribuidos.core.services;

import java.util.List;

import co.edu.unicauca.distribuidos.core.services.DTO.AdministradorDTO;

public interface IAdministradorService {

	public List<AdministradorDTO> findAll();		
	public AdministradorDTO save(AdministradorDTO product);	//registrar
        
}
