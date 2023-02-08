package co.edu.unicauca.distribuidos.core.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicauca.distribuidos.core.models.ProductoEntity;
import co.edu.unicauca.distribuidos.core.models.SubastaEntity;
import co.edu.unicauca.distribuidos.core.repositories.SubastaRepository;
import co.edu.unicauca.distribuidos.core.services.DTO.ProductoDTO;
import co.edu.unicauca.distribuidos.core.services.DTO.SubastaDTO;

@Service
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

    @Override
    public ProductoDTO mostarProdSubastado(Integer id) {
        ProductoEntity objCLienteEntity = this.servicioAccesoBaseDatos.mostrarProduct(id);
        ProductoDTO clienteDTO = this.modelMapper.map(objCLienteEntity, ProductoDTO.class);
        return clienteDTO;
    }

    @Override
    public SubastaDTO Ofertar(Integer id, SubastaDTO cliente) {
        SubastaEntity cancionEntity = this.modelMapper.map(cliente, SubastaEntity.class);
        SubastaEntity cancionEntityActualizado = this.servicioAccesoBaseDatos.update(id, cancionEntity);
        SubastaDTO cancionesDTO = this.modelMapper.map(cancionEntityActualizado, SubastaDTO.class);
        return cancionesDTO;
    }
}
