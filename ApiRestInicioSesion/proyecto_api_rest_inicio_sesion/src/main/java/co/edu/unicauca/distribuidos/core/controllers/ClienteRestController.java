

package co.edu.unicauca.distribuidos.core.controllers;

//import java.util.Date;
import java.util.List;
//import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.format.annotation.DateTimeFormat;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.distribuidos.core.services.DTO.ClienteDTO;
import co.edu.unicauca.distribuidos.core.services.IClienteService;


@RestController
@RequestMapping("/api")
public class ClienteRestController {

	@Autowired
	private IClienteService ProductoService;
	
	@GetMapping("/clientes")
	public List<ClienteDTO> index() {
		return ProductoService.findAll();
	}

	@PostMapping("/clientes")
	public ClienteDTO create(@RequestBody ClienteDTO cliente) {	
		ClienteDTO objProducto = null;
		objProducto =  ProductoService.save(cliente);
		return objProducto;
	}

			
}
