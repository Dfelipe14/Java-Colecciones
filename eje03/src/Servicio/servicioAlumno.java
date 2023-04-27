package Servicio;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class servicioAlumno {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Alumno> ListaAlumno = new ArrayList();

//String nombre;
//Integer documento;
//Integer nota1;
//Integer nota2;
//Integer nota3;
    public void crearAlumno() {
        Alumno P1 = new Alumno();//Temporal 

        System.out.println("Introducir nombre del alumno");
        P1.setNombre(leer.next());
        System.out.println("Documento");
        P1.setDocumento(leer.nextInt());

        for (int i = 0; i < 3; i++) {
            System.out.println("Nota " + (i + 1));
            P1.getNotas().add(leer.nextInt());
        }
        ListaAlumno.add(P1);

    }

    public void notaFinal() {
        float notaFinal;
        for (Alumno alumno : ListaAlumno) {
            notaFinal = 0;
            for (Integer nota : alumno.getNotas()) {
                notaFinal = notaFinal + nota;
            }
            System.out.println("El alumno " + alumno.getNombre() + " tiene un promedio de: " + (notaFinal / 3));
        }

    }
}
