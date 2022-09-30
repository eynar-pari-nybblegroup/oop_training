package schoolProject;

import java.util.HashMap;
import java.util.Map;

public class Estudiante {
    private String nombre;
    private Curso cursoAsignado;
    private int [] valoresNotas = new int[3];
    public Map<String, int [] > notas = new HashMap<>(); //{Alumno:[Notas]}


    public Estudiante(String nombre,Curso curso){
        this.nombre = nombre;
        this.cursoAsignado = curso;
    }
    public void agregarNotas(int nota1, int nota2, int nota3){
        this.valoresNotas[0] = nota1;
        this.valoresNotas[1] = nota2;
        this.valoresNotas[2] = nota3;
        notas.put(this.nombre,this.valoresNotas);

    }
}
