package co.edu.unicauca.distribuidos.core.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.unicauca.distribuidos.core.repositories.SubastaRepository;
import co.edu.unicauca.distribuidos.core.services.DTO.SubastaDTO;

public class SubastaServiceImpl implements ISubastaService {
    @Autowired
    private SubastaRepository servicioAccesoBaseDatos;

    @Override
    public List<SubastaDTO> findAll() {
        return null;
    }

    @Override
    public SubastaDTO findById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SubastaDTO save(SubastaDTO product) {
        // TODO Auto-generated method stub
        return null;
    }

public class SubastaServiceImpl implements ISubastaService {
>>>>>>> Stashed changes

}
