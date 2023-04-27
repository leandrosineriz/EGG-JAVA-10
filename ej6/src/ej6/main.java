/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
 * productos que venderemos y el precio que tendrán. Además, se necesita que la
 * aplicación cuente con las funciones básicas.
 * Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
 * eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
 * Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
 * Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package ej6;

import Service.ProductosService;
import java.util.Scanner;

/**
 *
 * @author itsmi
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProductosService ps = new ProductosService();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        while (true) {            
            System.out.println("1. Agregar producto\n"
                    + "2. Mostrar productos\n"
                    + "3. Modificar precio\n"
                    + "4. Eliminar producto");
            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                    ps.AgregarProducto();
                    break;
                case 2:
                    ps.MostrarProductos();
                    break;
                case 3:
                    ps.ModificarPrecio();
                    break;
                case 4:
                    ps.EliminarProducto();
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }
    }

}
