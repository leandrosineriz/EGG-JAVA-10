/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Class.Ciudad;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author noeli
 */
public class PaisService {
    HashMap<String, Ciudad> ciudades;

    public PaisService() {
        this.ciudades = new HashMap<>();
        String nombre;
        String codigoPostal;
        Scanner leer = new Scanner(System.in);
        while (true) {            
            System.out.println("Ingrese el nombre de la ciudad('n' para salir):");
            nombre = leer.next();
            if (nombre.equalsIgnoreCase("n")) {
                break;
            }
            System.out.println("Ingrese el codigo postal:");
            codigoPostal = leer.next();
            ciudades.put(codigoPostal, new Ciudad(nombre));
        }
    }

    public PaisService(HashMap<String, Ciudad> paises) {
        this.ciudades = paises;
    }
    
    public void MostrarPaises(){
        System.out.println(this.ciudades);
    }
    
    public boolean BuscarCiudad(String codigoPostal){
        if (this.ciudades.containsKey(codigoPostal)) {
            System.out.println(this.ciudades.get(codigoPostal));
            return true;
        } else {
            System.out.println("No se encontro la ciudad");
        }
        
        return false;
    }
    
    public boolean AgregarCiudad(String codigoPostal, String nombre){
        return this.ciudades.put(codigoPostal, new Ciudad(nombre)) == null;
    }
    
    public boolean EliminarCiudad(String codigoPostal){
        return this.ciudades.remove(codigoPostal) != null;
    }
}
