/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Class.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author itsmi
 */
public class Libreria {
    HashSet<Libro> libros = new HashSet();

    public Libreria() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String titulo;
        while (true) {            
            System.out.println("Ingrese el titulo del libro('n' para salir):");
            titulo = leer.next();
            if (titulo.equalsIgnoreCase("n")) {
                break;
            }
            this.libros.add(new Libro(titulo));
        }
    }
    
    public void MostrarLibros(){
        System.out.println(this.libros);
    }
    
    
}
