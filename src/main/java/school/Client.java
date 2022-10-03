package school;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        //alumnos
        Alumno[] alumnosIngles = new Alumno[2];
        Alumno[] alumnosMatematica = new Alumno[2];
        Alumno juan = new Alumno();
        Alumno pepe = new Alumno();

        juan.setDni(42120395);
        juan.setNombre("juan");
        juan.setApellido("Rodriguez");
        pepe.setDni(1562355);
        pepe.setNombre("Pepe");
        pepe.setApellido("Perez");
        alumnosMatematica[0] = juan;
        alumnosMatematica[1] = pepe;

        alumnosIngles[0] = juan;
        alumnosIngles[1] = pepe;
        //notas
        List <Notas> notasListos = new ArrayList<>();
        Notas notasPepe = new Notas(7, 9, 10);
        Notas notasJuan = new Notas(4, 5, 6);
        notasListos.add(notasJuan);
        notasListos.add(notasPepe);
        juan.setNotas(notasJuan);
        pepe.setNotas(notasPepe);


        //cursos

        Curso B = new Curso('B', "Tiza");
        Curso A = new Curso('A', "Smart");

        List <Curso> cursos = new ArrayList<>();
        cursos.add(A);
        cursos.add(B);

        //docentes
        Docente docente1 = new Docente("Jorge", "Gutie", 1565151);
        Docente docente2 = new Docente("Augusto", "Fra", 1568621);

        //materias
        List<Materia> materias = new ArrayList<>();
        Materia matematica = new Materia(alumnosIngles);
        Materia ingles = new Materia(alumnosMatematica);

        ingles.setDocente(docente1);
        matematica.setDocente(docente2);

        //imprimir por pantalla

        System.out.println("***"+matematica.getNombre_materia()+"***");
        System.out.println("Curso: "+matematica.getCurso());
        for (Alumno alumno: alumnosIngles) {
            System.out.println(alumno);
        }
        System.out.println();


    }
}
