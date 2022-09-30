package ej1;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        Notas notas1 = new Notas();
        notas1.setNota1P(4);
        notas1.setNotaPF(6);
        notas1.setNota2P(8);

        Docente docente = new Docente();
        docente.setApellido("Lopez");
        docente.setEdad(25);
        docente.setNombre("agustin");
        docente.setLegajo("1712344");
        docente.setTurno("tarde");

        Curso curso = new Curso();
        curso.setHasPizarron(true);
        curso.setAsientos(20);
        curso.setNombreAula("aula1");

        Alumno alumno = new Alumno();
        alumno.setApellido("gomez");
        alumno.setNombre("agustin");
        alumno.setCarrera("administracion de empresas");
        alumno.setEdad(21);
        alumno.setNotas(notas1);
        alumno.setLegajo("39754128");

        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno);

        Materia matematicas = new Materia();
        matematicas.setAñoMateria(1);
        matematicas.setAlumnos(alumnos);
        matematicas.setCurso(curso);
        matematicas.setDocente(docente);






    }
}
