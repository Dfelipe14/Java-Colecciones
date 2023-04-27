package eje03;

import Entidades.Alumno;
import Servicio.servicioAlumno;
import java.util.Scanner;

public class Eje03 {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        String respuesta = "";
        Scanner leer = new Scanner(System.in);

        servicioAlumno servAlum = new servicioAlumno();

//        servAlum.crearAlumno();
        do {
            servAlum.crearAlumno();
            System.out.println("Quiere Ingresar otro Alumno?");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("si"));
servAlum.notaFinal();
    }

}
