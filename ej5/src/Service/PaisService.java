/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author itsmi
 */
public class PaisService {
    HashSet<String> paises;

    public PaisService() {
        this.paises = new HashSet();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        while (true) {            
            System.out.println("Ingrese un pais('n' para salir):");
            String aux = leer.next();
            if (aux.equalsIgnoreCase("n")) {
                System.out.println(this.paises);
                break;
            }
            this.paises.add(aux);
        }
    }
    
    public void OrdenarPaises(){
        System.out.println("Ordenando paises...");
        ArrayList<String> auxPaises = new ArrayList(this.paises);
        Collections.sort(auxPaises);
        System.out.println(auxPaises);
    }
    
    public void EliminarPais(){
        System.out.println("Ingrese el pais a eliminar:");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String eliminar = leer.next();
        Iterator<String> it = this.paises.iterator();
        Boolean eliminado = false;
        while (it.hasNext()) {            
            
            if (it.next().equals(eliminar)) {
                it.remove();
                eliminado = true;
                break;
            }
        }
        
        if (eliminado) {
            System.out.println("Se elimino el pais correctamente.");
        } else {
            System.out.println("No se encontro el pais solicitado.");
        }
        
        System.out.println(this.paises);
    }
    
    
    
    
}
