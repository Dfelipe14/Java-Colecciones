/** Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
 * programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
 * después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
 * salir, se mostrará todos los perros guardados en el ArrayList.
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mascotaService {

    //ATRIBUTOS
    private ArrayList<String> mascotas = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //CONSTR

    public mascotaService() {
    }

    public ArrayList<String> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<String> mascotas) {
        this.mascotas = mascotas;
    }

    //METODOS
    public void IngresarRaza() {
        boolean bandera;
        bandera = true;
        int opcion;
        String respuesta = null, palabra;
        palabra = "s";
        System.out.println("Ingresar Mascotas a almacenar");
        System.out.println("Si desea cerrar la lista y mostrar las mascotas\nDeje un espacio en blanco y pulse enter");
        System.out.println("-----------------------------------------");
        /*do {
        opcion = leer.nextInt();
        switch(opcion){
        case 1:
        System.out.println("Ingresa la raza del perro");
        String Perro = leer.next();
        mascotas.add(Perro);
        System.out.println(mascotas);
        System.out.println("----------------------------");
        System.out.println("1=Volver a introducir una mascota");
        System.out.println("2=salir");
        break;
        case 2:
        System.out.println("Salir");
        System.out.println("Desea confirmar salir ?\n presione S");
        
        respuesta=leer.next();
        respuesta=respuesta.toLowerCase();
        
        if (respuesta.equals(palabra)) {
        bandera=false;
        System.out.println("");
        }
        break;
        }
        
        
        } while (bandera);*/

        while (true) {
            String mascota;
            mascota = leer.next();
            if (mascota.equals("")) {
                break;
            }
            mascotas.add(mascota);

        }

        /*        System.out.println("Las mascotas son: " + mascotas); 
        
*muestra los valores almacenado en la lista mediante un sout
         */
 /*Muestra la lista mediante un for each pero eliminar un valor se rompe

 for (String mascota : mascotas) {
            System.out.println(mascota);
        }
    }

         */
  System.out.println(mascotas);
        System.out.println("Si desea remover alguna mascota de la lista deje un espacio en blanco\npulse enter y luego escriba el nombre");
        for (int i = 0; i < mascotas.size(); i++) {
            String m = mascotas.get(i);
            if (m.equals(leer.next())) {
                mascotas.remove(m);
            }
        }
         System.out.println(mascotas);
    }
    
   
}
