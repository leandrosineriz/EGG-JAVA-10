/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author itsmi
 */
public class Libro {
    String titulo;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "{" + "titulo=" + titulo + '}';
    }
    
    
}
