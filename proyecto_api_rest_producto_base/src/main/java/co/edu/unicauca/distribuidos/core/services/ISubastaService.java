package co.edu.unicauca.distribuidos.core.services;

import java.util.List;

import co.edu.unicauca.distribuidos.core.services.DTO.SubastaDTO;

public interface ISubastaService {

    public List<SubastaDTO> findAll();

    public SubastaDTO findById(Integer id);

    public SubastaDTO save(SubastaDTO product); // Registrar subasta :v
}
