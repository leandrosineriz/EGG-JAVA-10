/*
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
 * tendremos una clase Pelicula con el título, director y duración de la película (en horas).
 * Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
 * que se pide a continuación:
 */
package Class;

import java.util.Comparator;

/**
 *
 * @author itsmi
 */
public class Pelicula {
    private String titulo;
    private String director;
    private float duracion;

    public Pelicula(String titulo, String director, float duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "{" + titulo + " - " + director + " - " + duracion + '}';
    }
    
    public static Comparator<Pelicula> compararDuracionMayorAMenor = (Pelicula p1, Pelicula p2) -> {
        if (p1.getDuracion() == p2.getDuracion()) {
            return 0;
        } else if(p1.getDuracion() > p2.getDuracion()) {
            return -1;
        } else {
            return 1;
        }
    };
    
    public static Comparator<Pelicula> compararDuracionMenorAMayor = (Pelicula p1, Pelicula p2) -> {
        if (p1.getDuracion() == p2.getDuracion()) {
            return 0;
        } else if(p1.getDuracion() > p2.getDuracion()) {
            return 1;
        } else {
            return -1;
        }
    };
    
    public static Comparator<Pelicula> compararTitulo = (Pelicula p1, Pelicula p2) -> 
            p1.getTitulo().compareTo(p2.getTitulo());
    
    public static Comparator<Pelicula> compararDirector = (Pelicula p1, Pelicula p2) -> 
            p1.getDirector().compareTo(p2.getDirector());
}
