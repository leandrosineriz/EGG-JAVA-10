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
        String autor;
        int numeroDeEjemplares;
        while (true) {            
            System.out.println("Ingrese el titulo del libro('n' para salir):");
            titulo = leer.next();
            if (titulo.equalsIgnoreCase("n")) {
                break;
            }
            System.out.println("Ingrese el autor:");
            autor = leer.next();
            System.out.println("Ingrese el numero de ejemplares");
            numeroDeEjemplares = leer.nextInt();
            this.libros.add(new Libro(titulo, autor, numeroDeEjemplares, 0));
        }
    }
    
    public void MostrarLibros(){
        System.out.println(this.libros);
    }
    
    public void Agregarlibro(Libro l){
        if (!this.libros.add(l)) {
            System.out.println("\nNo se pudo agregar el libro");
        } else {
            System.out.println("\nSe añadio el libro correctamente");
        }
    }
    
    public boolean BuscarLibro(String titulo){
        for(Libro l : this.libros){
            if (l.getTitulo().equals(titulo)) {
                System.out.println(l);
                return true;
            }
        }
        System.out.println("No se encontro el libro");
        return false;
    }
    
    public boolean Prestamo(String titulo){
        for(Libro l : this.libros){
            if (l.getTitulo().equals(titulo)) {
                if (l.getNumeroDeEjemplaresPrestados() < l.getNumeroDeEjemplares()) {
                    l.setNumeroDeEjemplaresPrestados(l.getNumeroDeEjemplaresPrestados()+ 1);
                    System.out.println("Se presto el libro.");
                    return true;
                } else {
                    System.out.println("No hay mas copias del libro para prestar");
                    return false;
                }
            }
        }
        
        System.out.println("No se encontro el libro");
        return false;
    }
    
    public boolean Devolucion(String titulo){
        for(Libro l : this.libros){
            if (l.getTitulo().equals(titulo)) {
                if (l.getNumeroDeEjemplaresPrestados() > 0) {
                    l.setNumeroDeEjemplaresPrestados(l.getNumeroDeEjemplaresPrestados() - 1);
                    System.out.println("Se devolvio el libro.");
                    return true;
                } else {
                    System.out.println("No hay copias de ese libro prestadas");
                    return false;
                }
            }
        }
        System.out.println("No se encontro el libro");
        return false;
    }
}
