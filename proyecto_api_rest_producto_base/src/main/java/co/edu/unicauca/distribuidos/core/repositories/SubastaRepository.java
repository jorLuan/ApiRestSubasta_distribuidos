package co.edu.unicauca.distribuidos.core.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.unicauca.distribuidos.core.models.ProductoEntity;
import co.edu.unicauca.distribuidos.core.models.SubastaEntity;

@Repository
public class SubastaRepository {

    private ArrayList<SubastaEntity> listaDeSubastas;
    private ArrayList<ProductoEntity> listaDeP;
    private ProductoRepository productoprueba = new ProductoRepository();

    public SubastaRepository() {
        this.listaDeSubastas = new ArrayList<SubastaEntity>();
        cargarClientes();
    }

    public List<SubastaEntity> findAll() {
        System.out.println("Invocando a listar subastas");
        return this.listaDeSubastas;
    }

    public SubastaEntity findById(Integer id) {
        System.out.println("Invocando a consultar una subasta");
        SubastaEntity objProducto = null;

        for (SubastaEntity producto : listaDeSubastas) {
            if (producto.getProductId() == id) {
                objProducto = producto;
                break;
            }
        }

        return objProducto;
    }

    // Registra una subasta con un prodId especifico
    public SubastaEntity save(SubastaEntity producto) {
        listaDeP = productoprueba.getListaDeProductos();

        System.out.println("Invocando a registrar subasta");
        SubastaEntity objProducto = null;
        for (ProductoEntity producto2 : listaDeP) {
            if (producto2.getId() == producto.getProductId()) {

                if (this.listaDeSubastas.add(producto)) {
                    objProducto = producto;
                }

            }

        }
        return objProducto;
    }

    public ProductoEntity mostrarProduct(Integer id) {
        System.out.println("Invocando a consultar un producto subastado");
        ProductoEntity objProducto = null;
        listaDeP = productoprueba.getListaDeProductos();
        // if (findById(id).equals(0))

        for (ProductoEntity producto2 : listaDeP) {
            if (producto2.getId() == id) {
                for (SubastaEntity subasta : listaDeSubastas)
                    if (subasta.getProductId() == id)
                        objProducto = producto2;
                break;
            }

        }
        return objProducto;
    }

    public SubastaEntity update(Integer id, SubastaEntity producto) {
        System.out.println("Invocando a actualizar una subasta");
        SubastaEntity objProducto = null;

        for (int i = 0; i < this.listaDeSubastas.size(); i++) {
            if (this.listaDeSubastas.get(i).getProductId() == id
                    && producto.getValorSubasta() > listaDeSubastas.get(i).getValorSubasta()) {
                this.listaDeSubastas.set(i, producto);
                objProducto = producto;
                break;
            }
        }

        return objProducto;
    }

    public boolean delete(Integer id) {
        System.out.println("Invocando a eliminar un producto");
        boolean bandera = false;

        for (int i = 0; i < this.listaDeSubastas.size(); i++) {
            if (this.listaDeSubastas.get(i).getProductId() == id) {
                this.listaDeSubastas.remove(i);
                bandera = true;
                break;
            }
        }

        return bandera;
    }

    private void cargarClientes() {
        SubastaEntity objProducto1 = new SubastaEntity(1, true, 5000);
        this.listaDeSubastas.add(objProducto1);
        SubastaEntity objProducto2 = new SubastaEntity(2, true, 1000);
        this.listaDeSubastas.add(objProducto2);

    }
}
