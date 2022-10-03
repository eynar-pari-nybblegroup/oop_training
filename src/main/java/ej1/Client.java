package ej1;

public class Client {

    public static void main (String []args){
        Materia matematica = new Materia();
        matematica.setNameMateria("Matematica");
        matematica.setCapacidad(10);
        matematica.setCurso(new Curso("Torres",12));

        Docente docenteA= new Docente();
        docenteA.setIdDocente(12345);
        docenteA.setContractor(true);
        docenteA.setName("Jose");
        docenteA.setLastName("Jose");
        docenteA.setId("17777788");
        docenteA.setBirthDay("12/12/12");

        matematica.setDocente(docenteA);

        Estudiante e1= new Estudiante();
        e1.setName("juan");
        e1.setLastName("juan");
        e1.setId("1231231");
        e1.setBirthDay("10/12/15");
        e1.setNumMatricula("E1000");
        e1.setNivel(2);
        e1.setNota1(new Nota(50,"regular"));
        e1.setNota2(new Nota(60,"bueno"));
        e1.setNotaF(new Nota(100,"excelente"));


        Estudiante e2= new Estudiante();
        e2.setName("pedro");
        e2.setLastName("pedro");
        e2.setId("1231231");
        e2.setBirthDay("10/12/15");
        e2.setNumMatricula("E1001");
        e2.setNivel(2);
        e2.setNota1(new Nota(100,"excelente"));
        e2.setNota2(new Nota(100,"excelente"));
        e2.setNotaF(new Nota(100,"excelente"));

        matematica.addEstudiante(e1);
        matematica.addEstudiante(e2);
        matematica.showInfoMateria();
    }
}
