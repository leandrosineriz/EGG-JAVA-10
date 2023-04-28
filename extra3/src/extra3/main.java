/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra3;

import Class.Libro;
import Service.Libreria;
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
        Libreria lb = new Libreria();
        Scanner leer = new Scanner(System.in);
        while (true) {            
            System.out.println("\n\n1. Mostrar libros\n"
                    + "2. Agregar libro\n"
                    + "3. Buscar libro\n"
                    + "4. Prestar libro\n"
                    + "5. Devolver libro");
            
            int opc = leer.nextInt();
            
            switch (opc) {
                case 1:
                    lb.MostrarLibros();
                    break;
                case 2:
                    System.out.println("\n\nIngrese el titulo del libro a agregar:");
                    String titulo = leer.next();
                    System.out.println("Ingrese el autor:");
                    String autor = leer.next();
                    System.out.println("Ingrese el numero de ejemplares");
                    int numeroDeEjemplares = leer.nextInt();
                    lb.Agregarlibro(new Libro(titulo, autor, numeroDeEjemplares, 0));
                    break;
                case 3:
                    System.out.println("Ingrese el titulo del libro a buscar:");
                    titulo = leer.next();
                    lb.BuscarLibro(titulo);
                    break;
                case 4:
                    System.out.println("Ingrese el titulo del libro a prestar:");
                    titulo = leer.next();
                    lb.Prestamo(titulo);
                    break;
                case 5:
                    System.out.println("Ingrese el titulo del libro a devolver:");
                    titulo = leer.next();
                    lb.Devolucion(titulo);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
    
}
