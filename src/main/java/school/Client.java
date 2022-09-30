package school;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        //alumnos
        List <Alumno> alumnos = new ArrayList<>();
        Alumno juan = new Alumno();
        Alumno pepe = new Alumno();
        alumnos.add(juan);
        alumnos.add(pepe);
        juan.setDni(42120395);
        juan.setNombre("juan");
        juan.setApellido("Rodriguez");
        pepe.setDni(1562355);
        pepe.setNombre("Pepe");
        pepe.setApellido("Perez");

        //notas
        List <Notas> notasListos = new ArrayList<>();
        Notas notasPepe = new Notas(7, 9, 10);
        Notas notasJuan = new Notas(4, 5, 6);
        notasListos.add(notasJuan);
        notasListos.add(notasPepe);
        juan.setNotas(notasJuan);
        pepe.setNotas(notasPepe);

        //materias
        List<Materia> materias = new ArrayList<>();
        Materia matematica = new Materia();
        Materia ingles = new Materia();
        //cursos

        Curso B = new Curso('B', "Tiza");
        Curso A = new Curso('A', "Smart");

        List <Curso> cursos = new ArrayList<>();
        cursos.add(A);
        cursos.add(B);

    }
}
