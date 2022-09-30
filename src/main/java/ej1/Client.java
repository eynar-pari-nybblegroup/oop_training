package ej1;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        Notas notas1 = new Notas();
        notas1.setNota1P(4);
        notas1.setNotaPF(6);
        notas1.setNota2P(8);

        Docente docente1 = new Docente();
        docente1.setApellido("Lopez");
        docente1.setEdad(25);
        docente1.setNombre("agustin");
        docente1.setLegajo("1712344");
        docente1.setTurno("tarde");

        Curso curso1 = new Curso();
        curso1.setHasPizarron(true);
        curso1.setAsientos(20);
        curso1.setNombreAula("aula1");

        Alumno alumno1 = new Alumno();
        alumno1.setApellido("gomez");
        alumno1.setNombre("agustin");
        alumno1.setCarrera("administracion de empresas");
        alumno1.setEdad(21);
        alumno1.setNotas(notas1);
        alumno1.setLegajo("39754128");

        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno1);

        Materia matematicas = new Materia();
        matematicas.setAnoMateria(1);
        matematicas.setAlumnos(alumnos);
        matematicas.setCurso(curso1);
        matematicas.setDocente(docente1);






    }
}
