package gm.inventarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import gm.inventarios.modelo.Producto;

@SpringBootApplication
public class InventariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventariosApplication.class, args);

		//Prueba de Lombok
		Producto producto = new Producto();
		producto.setDescripcion("Camisa Talla mediana");
		producto.setPrecio(250.75);
		producto.setExistencia(30);

		//Imprimir el objeto toString de Lombok
		System.out.println(producto);
	}

}
