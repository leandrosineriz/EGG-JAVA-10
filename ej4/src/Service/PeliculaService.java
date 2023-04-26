/*
 * En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
 * todos sus datos y guardándolos en el objeto Pelicula.
 * Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
 * crear otra Pelicula o no.
 * Después de ese bucle realizaremos las siguientes acciones:
 *
 * 22
 *
 * • Mostrar en pantalla todas las películas.
 * • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
 * • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
 * pantalla.
 * • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
 * pantalla.
 * • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
 * • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Service;

import Class.Pelicula;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author itsmi
 */
public class PeliculaService {
    final List<Pelicula> peliculas = new ArrayList<>();

    public PeliculaService() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String titulo;
        String director;
        float duracion;
        while (true) {            
            System.out.println("Ingrese el titulo de la pelicula:");
            titulo = leer.next();
            System.out.println("Ingrese el director:");
            director = leer.next();
            System.out.println("Ingrese la duracion:");
            duracion = leer.nextFloat();
            this.peliculas.add(new Pelicula(titulo, director, duracion));
            System.out.println("Quiere ingresar otra pelicula?('n' para salir)");
            if (leer.next().equals("n")) {
                break;
            }
        }
        
    }
    
    public void mostrarTodasPeliculas(){
        System.out.println("TODAS LAS PELICULAS");
        System.out.println(peliculas);
    }
    
    public void mostrarPeliculasMas1Hora(){
        Iterator<Pelicula> it = this.peliculas.iterator();
        Pelicula aux;
        System.out.println("PELICULAS DE MAS DE 1 HORA:");
        while (it.hasNext()) {            
            aux = it.next();
            if (aux.getDuracion() > 1) {
                System.out.println(aux);
            }
        }
    }
    
    public void ordenarDuracionMayorAMenor(){
        System.out.println("PELICULAS ORDENADAS DE MAYOR A MENOR POR DURACION");
        this.peliculas.sort(Pelicula.compararDuracionMayorAMenor);
        System.out.println(peliculas);
    }
    
    public void ordenarDuracionMenorAMayor(){
        System.out.println("PELICULAS ORDENADAS DE MENOR A MAYOR POR DURACION");
        this.peliculas.sort(Pelicula.compararDuracionMenorAMayor);
        System.out.println(peliculas);
    }
    
    public void ordenarPorTitulo(){
        System.out.println("PELICULAS ORDENADAS POR TITULO");
        this.peliculas.sort(Pelicula.compararTitulo);
        System.out.println(peliculas);
    }
    
    public void ordenarPorDirector(){
        System.out.println("PELICULAS ORDENADAS POR DIRECTOR");
        this.peliculas.sort(Pelicula.compararDirector);
        System.out.println(peliculas);
    }
}
