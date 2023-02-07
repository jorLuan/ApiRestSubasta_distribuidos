
package co.edu.unicauca.distribuidos.core.repositories;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.unicauca.distribuidos.core.models.ProductoEntity;

@Repository
public class ProductoRepository {

	private ArrayList<ProductoEntity> listaDeProductos;

	public ArrayList<ProductoEntity> getListaDeProductos() {
		return listaDeProductos;
	}

	public ProductoRepository() {
		this.listaDeProductos = new ArrayList<ProductoEntity>();

		cargarClientes();
	}

	public List<ProductoEntity> findAll() {
		System.out.println("Invocando a listar productos");
		return this.listaDeProductos;
	}

	public ProductoEntity findById(Integer id) {
		System.out.println("Invocando a consultar un producto");
		ProductoEntity objProducto = null;

		for (ProductoEntity producto : listaDeProductos) {
			if (producto.getId() == id) {
				objProducto = producto;
				break;
			}
		}

		return objProducto;
	}

	public ProductoEntity save(ProductoEntity producto) {
		System.out.println("Invocando a almacenar producto");
		ProductoEntity objProducto = null;
		if (this.listaDeProductos.add(producto)) {
			objProducto = producto;
		}

		return objProducto;
	}

	/*
	 * public SubastaEntity save2(SubastaEntity producto) {
	 * System.out.println("Invocando a almacenar producto");
	 * SubastaEntity objProducto = null;
	 * for (ProductoEntity producto2 : listaDeProductos) {
	 * if (producto2.getId() == producto.getProductId()) {
	 * 
	 * if (this.listaDeProdSubastados.add(producto)) {
	 * objProducto = producto;
	 * }
	 * } else
	 * System.out.println("El producto " + producto.getProductId() + " no existe");
	 * }
	 * return objProducto;
	 * }
	 */

	public ProductoEntity update(Integer id, ProductoEntity producto) {
		System.out.println("Invocando a actualizar un producto");
		ProductoEntity objProducto = null;

		for (int i = 0; i < this.listaDeProductos.size(); i++) {
			if (this.listaDeProductos.get(i).getId() == id) {
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
			if (this.listaDeProductos.get(i).getId() == id) {
				this.listaDeProductos.remove(i);
				bandera = true;
				break;
			}
		}

		return bandera;
	}

	private void cargarClientes() {
		ProductoEntity objProducto1 = new ProductoEntity(1, "mona lisa", 5000);
		this.listaDeProductos.add(objProducto1);
		ProductoEntity objProducto2 = new ProductoEntity(2, "ban goh", 1000);
		this.listaDeProductos.add(objProducto2);
		ProductoEntity objProducto3 = new ProductoEntity(3, "cuadro de las rosas", 560000);
		this.listaDeProductos.add(objProducto3);
		ProductoEntity objProducto = new ProductoEntity(4, "sarcofagpo", 4000);
		this.listaDeProductos.add(objProducto);
	}

}
