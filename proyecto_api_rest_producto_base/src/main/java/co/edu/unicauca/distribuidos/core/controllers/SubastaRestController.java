package co.edu.unicauca.distribuidos.core.controllers;

import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.distribuidos.core.services.ISubastaService;
import co.edu.unicauca.distribuidos.core.services.DTO.ProductoDTO;
import co.edu.unicauca.distribuidos.core.services.DTO.SubastaDTO;

@RestController
@RequestMapping("/api")
public class SubastaRestController {

    @Autowired
    private ISubastaService subastaService;

    @GetMapping("/subastas")
    public List<SubastaDTO> index() {
        return subastaService.findAll();
    }

    @GetMapping("/subastas/{id}")
    public SubastaDTO show(@PathVariable Integer id) {
        SubastaDTO objProducto = null;
        objProducto = subastaService.findById(id);
        return objProducto;
    }

    @GetMapping("/productosSubastados/{id}")
    public ProductoDTO showProductoSubastado(@PathVariable Integer id) {
        ProductoDTO objProducto = null;
        objProducto = subastaService.mostarProdSubastado(id);
        return objProducto;
    }

    @GetMapping("consultarSubastas")
    public String getMessageParametros(@RequestParam String nombres,
            @RequestParam String apellidos,
            @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fecha) {
        String msg = String.format("buscando un cliente por nombre: %s, apellidos: %s fecha %s", nombres, apellidos,
                fecha);
        System.out.println(msg);
        return msg;
    }

    @PutMapping("/subastas/{id}")
    public SubastaDTO update(@RequestBody SubastaDTO cliente, @PathVariable Integer id) {
        SubastaDTO objCliente = null;
        SubastaDTO clienteActual = subastaService.findById(id);
        if (clienteActual != null) {
            objCliente = subastaService.Ofertar(id, cliente);
        }
        return objCliente;
    }

    @PostMapping("/subastas")
    public SubastaDTO create(@RequestBody SubastaDTO cliente) {
        SubastaDTO objProducto = null;
        objProducto = subastaService.save(cliente);
        return objProducto;
    }

}
