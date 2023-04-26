/*
 * Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
 * alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
 * con sus 3 notas.
 */
package Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author itsmi
 */
public class Alumno {
    private String nombre;
    private final List<Integer> notas = new ArrayList();;

    public Alumno() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del alumno:");
        this.nombre = leer.next();
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota " + (i+1) + ":");
            notas.add(leer.nextInt());
        }
    }
    
    public Alumno(String nombre) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        this.nombre = nombre;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota " + (i+1) + ":");
            notas.add(leer.nextInt());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(int nota) {
        this.notas.add(nota);
    }
    
    
}
