
package co.edu.unicauca.distribuidos.core.controllers;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.distribuidos.core.services.DTO.ProductoDTO;
import co.edu.unicauca.distribuidos.core.services.IProductoService;

@RestController
@RequestMapping("/api")
public class ProductoRestController {

	@Autowired
	private IProductoService ProductoService;

	@GetMapping("/productos")
	public List<ProductoDTO> index() {
		return ProductoService.findAll();
	}

	@GetMapping("/productos/{id}")
	public ProductoDTO show(@PathVariable Integer id) {
		ProductoDTO objProducto = null;
		objProducto = ProductoService.findById(id);
		return objProducto;
	}

	@GetMapping("consultarProductos")
	public String getMessageParametros(@RequestParam String nombres,
			@RequestParam String apellidos,
			@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fecha) {
		String msg = String.format("buscando un cliente por nombre: %s, apellidos: %s fecha %s", nombres, apellidos,
				fecha);
		System.out.println(msg);
		return msg;
	}

	@PostMapping("/productos")
	public ProductoDTO create(@RequestBody ProductoDTO cliente) {
		ProductoDTO objProducto = null;
		objProducto = ProductoService.save(cliente);
		return objProducto;
	}

	/*
	 * @PostMapping("/subastas")
	 * public SubastaDTO create2(@RequestBody SubastaDTO cliente) {
	 * SubastaDTO objProducto = null;
	 * objProducto = ProductoService.save2(cliente);
	 * return objProducto;
	 * }
	 */
	@GetMapping("/productos/listarCabeceras")
	public void listarCabeceras(@RequestHeader Map<String, String> headers) {
		System.out.println("cabeceras");
		headers.forEach((key, value) -> {
			System.out.println(String.format("Cabecera '%s' = %s", key, value));
		});
	}

}
