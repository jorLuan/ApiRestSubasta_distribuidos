package co.edu.unicauca.distribuidos.core.repositories;

import java.util.ArrayList;
import java.util.List;

import co.edu.unicauca.distribuidos.core.models.SubastaEntity;

public class SubastaRepository {

    private ArrayList<SubastaEntity> listaDeProductos;
    private ProductoRepository producto2;

    public SubastaRepository() {
        this.listaDeProductos = new ArrayList<SubastaEntity>();
        cargarClientes();
    }

    public List<SubastaEntity> findAll() {
        System.out.println("Invocando a listar subastas");
        return this.listaDeProductos;
    }

    public SubastaEntity findById(Integer id) {
        System.out.println("Invocando a consultar un producto");
        SubastaEntity objProducto = null;

        for (SubastaEntity producto : listaDeProductos) {
            if (producto.getProductId() == id) {
                objProducto = producto;
                break;
            }
        }

        return objProducto;
    }

    public SubastaEntity save(SubastaEntity producto) {

        System.out.println("Invocando a registrar subasta");
        producto2.findById(producto.getProductId());

        SubastaEntity objProducto = null;
        if (this.listaDeProductos.add(producto)) {
            objProducto = producto;
        }

        return objProducto;
    }

    public SubastaEntity update(Integer id, SubastaEntity producto) {
        System.out.println("Invocando a actualizar un producto");
        SubastaEntity objProducto = null;

        for (int i = 0; i < this.listaDeProductos.size(); i++) {
            if (this.listaDeProductos.get(i).getProductId() == id) {
                this.listaDeProductos.set(i, producto);
                objProducto = producto;
                break;
            }
        }

        return objProducto;
    }

    public boolean delete(Integer id) {
        System.out.println("Invocando a eliminar un producto");
        boolean bandera = false;

        for (int i = 0; i < this.listaDeProductos.size(); i++) {
            if (this.listaDeProductos.get(i).getProductId() == id) {
                this.listaDeProductos.remove(i);
                bandera = true;
                break;
            }
        }

        return bandera;
    }

    private void cargarClientes() {
        SubastaEntity objProducto1 = new SubastaEntity(1, true, 5000);
        this.listaDeProductos.add(objProducto1);
        SubastaEntity objProducto2 = new SubastaEntity(2, true, 1000);
        this.listaDeProductos.add(objProducto2);

    }
}
