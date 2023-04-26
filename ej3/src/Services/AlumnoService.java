/*
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
 * toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
 * pregunta al usuario si quiere crear otro Alumno o no.
 * Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
 * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
 * final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
 * del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
 * promedio final, devuelto por el método y mostrado en el main.
 */
package Services;

import Class.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author itsmi
 */
public class AlumnoService {
    
    final List<Alumno> alumnos = new ArrayList();

    public AlumnoService() {
        while (true) {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            System.out.println("INGRESE LOS DATOS DEL ALUMNO");
            alumnos.add(new Alumno());
            System.out.println("Desea ingresar otro alumno?:('n' para salir)");
            if (leer.next().equals("n")) {
                break;
            }
        }
    }
    
    public double notaFinal() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del alumno que desea conocer la nota final:");
        String buscAlum = leer.next();
        Iterator<Alumno> it = this.alumnos.iterator();
        int sumNotas = 0;
        Alumno alumAux;
        while (it.hasNext()) { 
            alumAux = it.next();
            if (alumAux.getNombre().equals(buscAlum)) {
                for(int n : alumAux.getNotas()){
                    sumNotas += n; 
                }
            }
        }
        
        
        return (double)sumNotas/3;
    }
    
}
