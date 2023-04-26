/*
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
 * programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
 * después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
 * salir, se mostrará todos los perros guardados en el ArrayList.
 */
package ej1;

import java.util.ArrayList;
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
            System.out.println("Desea ingresar otra raza?('no' = salir)");
            if ("no".equals(leer.next())) {
                break;
            }
        }
        
        System.out.println(perros);
    }

}
