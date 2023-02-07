

package co.edu.unicauca.distribuidos.core.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicauca.distribuidos.core.models.AdministradorEntity;
import co.edu.unicauca.distribuidos.core.repositories.AdministradorRepository;
import co.edu.unicauca.distribuidos.core.services.DTO.AdministradorDTO;


@Service
public class AdministradorServiceImpl implements IAdministradorService {

	@Autowired
	private AdministradorRepository servicioAccesoBaseDatos;

	@Autowired
    private ModelMapper modelMapper;

	@Override
	public List<AdministradorDTO> findAll() {	
		
		List<AdministradorEntity> clientesEntity= this.servicioAccesoBaseDatos.findAll();
		List<AdministradorDTO> clientesDTO=this.modelMapper.map(clientesEntity, new TypeToken<List<AdministradorDTO>>() {}.getType());
		return clientesDTO;
	}

	@Override
	public AdministradorDTO save(AdministradorDTO cliente) {
		AdministradorEntity AdministradorEntity=this.modelMapper.map(cliente, AdministradorEntity.class);
		AdministradorEntity objAdministradorEntity= this.servicioAccesoBaseDatos.save(AdministradorEntity);
		AdministradorDTO AdministradorDTO=this.modelMapper.map(objAdministradorEntity, AdministradorDTO.class);
		return AdministradorDTO;		
	}
}
