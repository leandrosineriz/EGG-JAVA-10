/*
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
 * productos que venderemos y el precio que tendrán. Además, se necesita que la
 * aplicación cuente con las funciones básicas.
 * Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
 * eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
 * Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
 * Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Service;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author itsmi
 */
public class ProductosService {
    HashMap<String, Float> productos;

    public ProductosService() {
        this.productos = new HashMap<>();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String nombre;
        float valor;
        while (true) {            
            System.out.println("Ingrese el nombre del producto a ingresar('n' para salir):");
            nombre = leer.next();
            if (nombre.equalsIgnoreCase("n")) {
                System.out.println("Saliendo...");
                break;
            }
            System.out.println("Ingrese el valor del producto:");
            valor = leer.nextFloat();
            this.productos.put(nombre,valor);
        }
        System.out.println(this.productos);
    }
    
    public void MostrarProductos(){
        System.out.println(this.productos);
    }
    
    public void AgregarProducto(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String nombre;
        float valor;
        System.out.println("Ingrese el nombre del producto a ingresar:");
        nombre = leer.next();
        System.out.println("Ingrese el valor del producto:");
        valor = leer.nextFloat();
        this.productos.put(nombre,valor);
    }
    
    public void EliminarProducto(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del producto a eliminar:");
        String eliminar = leer.next();
        if (this.productos.remove(eliminar) == null) {
            System.out.println("No se encontro el producto.");
        } else {
            System.out.println("Se elimino el producto.");
        }
    }
    
    public void ModificarPrecio(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del producto que desea modificar el precio:");
        String modificar = leer.next();
        if (this.productos.containsKey(modificar)) {
            System.out.println("Ingrese el nuevo valor del producto:");
            float precio = leer.nextFloat();
            this.productos.replace(modificar, precio);
        } else {
            System.out.println("El producto no existe.");
        }
    }
    
    
}
