
package co.edu.unicauca.distribuidos.core.controllers;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.distribuidos.core.services.DTO.ProductoDTO;
import co.edu.unicauca.distribuidos.core.services.IProductoService;
<<<<<<< Updated upstream
import co.edu.unicauca.distribuidos.core.services.ISubastaService;
=======
>>>>>>> Stashed changes

@RestController
@RequestMapping("/api")
public class ProductoRestController {

	@Autowired
	private IProductoService ProductoService;
<<<<<<< Updated upstream
	@Autowired
	private ISubastaService subastaService;
=======
>>>>>>> Stashed changes

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

<<<<<<< Updated upstream
	@GetMapping("productos2/{name}/{age}")
	public String getMessage(@PathVariable String name,
			@PathVariable("age") String edad) {
		String msg = String.format("%s es %s años viejo", name, edad);
		System.out.println(msg);
		return msg;
	}

=======
>>>>>>> Stashed changes
	@GetMapping("consultarProductos")
	public String getMessageParametros(@RequestParam String nombres,
			@RequestParam String apellidos,
			@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fecha) {
		String msg = String.format("buscando un cliente por nombre: %s, apellidos: %s fecha %s", nombres, apellidos,
				fecha);
		System.out.println(msg);
		return msg;
<<<<<<< Updated upstream
	}

	@PostMapping("/prouctos")
	public ProductoDTO create(@RequestBody ProductoDTO cliente) {
		ProductoDTO objProducto = null;
		objProducto = ProductoService.save(cliente);
		return objProducto;
	}

	/*
	 * @PutMapping("/productos/{id}")
	 * public ProductoDTO update(@RequestBody ProductoDTO cliente, @PathVariable
	 * Integer id) {
	 * ProductoDTO objProducto = null;
	 * ProductoDTO ProductoActual = ProductoService.findById(id);
	 * if(ProductoActual!=null)
	 * {
	 * objProducto = ProductoService.update(id,cliente);
	 * }
	 * return objProducto;
	 * }
	 */

	/*
	 * @DeleteMapping("/clientes/{id}")
	 * public Boolean delete(@PathVariable Integer id) {
	 * Boolean bandera=false;
	 * ProductoDTO ProductoActual = ProductoService.findById(id);
	 * if(ProductoActual!=null)
	 * {
	 * bandera = ProductoService.delete(id);
	 * }
	 * return bandera;
	 * 
	 * }
	 */
=======
	}

	@PostMapping("/productos")
	public ProductoDTO create(@RequestBody ProductoDTO cliente) {
		ProductoDTO objProducto = null;
		objProducto = ProductoService.save(cliente);
		return objProducto;
	}
>>>>>>> Stashed changes

	@GetMapping("/productos/listarCabeceras")
	public void listarCabeceras(@RequestHeader Map<String, String> headers) {
		System.out.println("cabeceras");
		headers.forEach((key, value) -> {
			System.out.println(String.format("Cabecera '%s' = %s", key, value));
		});
	}

}
