/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra4;

import Service.PaisService;
import java.util.Scanner;

/**
 *
 * @author noeli
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PaisService cs = new PaisService();
        Scanner leer = new Scanner(System.in);
        while (true) {            
            System.out.println("\n\n1. Mostrar ciudades\n"
                    + "2. Agregar ciudad\n"
                    + "3. Buscar ciudad\n"
                    + "4. Eliminar ciudad\n");
            System.out.println("Ingrese la opcion:");
            int opc = leer.nextInt();
            
            switch (opc) {
                case 1:
                    cs.MostrarPaises();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del pais");
                    String nombre = leer.next();
                    System.out.println("Ingrese el codigo postal");
                    String codigoPostal = leer.next();
                    if(cs.AgregarCiudad(codigoPostal, nombre)){
                        System.out.println("Se agrego la ciudad");
                    } else {
                        System.out.println("No se pudo agregar la ciudad");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el codigo postal a buscar:");
                    codigoPostal = leer.next();
                    cs.BuscarCiudad(codigoPostal);
                    break;
                case 4:
                    System.out.println("Ingrese el codigo postal de la ciudad a eliminar:");
                    codigoPostal = leer.next();
                    if(cs.EliminarCiudad(codigoPostal)){
                        System.out.println("Se elimino la ciudad");
                    } else {
                        System.out.println("No se encontro la ciudad");
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
    
}
