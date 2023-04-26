/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
 * un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
 * está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
 * ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
 * la lista ordenada.
 */
package ej2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
        List<String> perros = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        while(true){
            System.out.println("Ingrese una raza de perro: ");
            perros.add(leer.next());
            System.out.println("Desea ingresar otra raza?('n' para salir)");
            if ("n".equals(leer.next())) {
                break;
            }
        }
        
        System.out.println(perros);
        System.out.println("Ingrese el la raza de perros que desea eliminar.");
        String eliminar = leer.next();
        Iterator<String> itPerros = perros.iterator();
        
        while (itPerros.hasNext()) {            
            if (itPerros.next().equals(eliminar)) {
                itPerros.remove();
            }
        }
        
        System.out.println(perros);
    }

}
