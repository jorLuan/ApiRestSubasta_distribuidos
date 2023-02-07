package co.edu.unicauca.distribuidos.core.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import co.edu.unicauca.distribuidos.core.models.SubastaEntity;
import co.edu.unicauca.distribuidos.core.repositories.SubastaRepository;
import co.edu.unicauca.distribuidos.core.services.DTO.SubastaDTO;

public class SubastaServiceImpl implements ISubastaService {

    @Autowired
    private SubastaRepository servicioAccesoBaseDatos;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<SubastaDTO> findAll() {

        List<SubastaEntity> clientesEntity = this.servicioAccesoBaseDatos.findAll();
        List<SubastaDTO> clientesDTO = this.modelMapper.map(clientesEntity, new TypeToken<List<SubastaDTO>>() {
        }.getType());
        return clientesDTO;
    }

    @Override
    public SubastaDTO findById(Integer id) {
        SubastaEntity objCLienteEntity = this.servicioAccesoBaseDatos.findById(id);
        SubastaDTO clienteDTO = this.modelMapper.map(objCLienteEntity, SubastaDTO.class);
        return clienteDTO;
    }

    @Override
    public SubastaDTO save(SubastaDTO cliente) {
        SubastaEntity clienteEntity = this.modelMapper.map(cliente, SubastaEntity.class);
        SubastaEntity objCLienteEntity = this.servicioAccesoBaseDatos.save(clienteEntity);
        SubastaDTO clienteDTO = this.modelMapper.map(objCLienteEntity, SubastaDTO.class);
        return clienteDTO;
    }
}
