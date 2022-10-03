package ejercicio1;

public class Client {

    public static void main(String[] args) {

        // Creando Alumnos

        Alumno alumnoA = new Alumno("Juan", "Perez", "Male", 39123123, "Software Engineering");
        Nota firstGradeAlumnoA = new Nota(8);
        Nota secondGradeAlumnoA = new Nota(9);
        alumnoA.setFirstGrade(firstGradeAlumnoA);
        alumnoA.setSecondGrade(secondGradeAlumnoA);
        float notaFinalAlumnoA = alumnoA.calcularNotaFinal(firstGradeAlumnoA, secondGradeAlumnoA);

        Alumno alumnoB = new Alumno("Benito", "Martinez", "Male", 38123986, "Economy");
        Nota firstGradeAlumnoB = new Nota(7);
        Nota secondGradeAlumnoB = new Nota(6);
        alumnoB.setFirstGrade(firstGradeAlumnoB);
        alumnoB.setSecondGrade(secondGradeAlumnoB);
        float notaFinalAlumnoB = alumnoB.calcularNotaFinal(firstGradeAlumnoB, secondGradeAlumnoB);

        Alumno alumnoC = new Alumno("Maria", "Diaz", "Female", 37459884, "Medicine");
        Nota firstGradeAlumnoC = new Nota(9);
        Nota secondGradeAlumnoC = new Nota(10);
        alumnoC.setFirstGrade(firstGradeAlumnoC);
        alumnoC.setSecondGrade(secondGradeAlumnoC);
        float notaFinalAlumnoC = alumnoC.calcularNotaFinal(firstGradeAlumnoC, secondGradeAlumnoC);

        // Creando Docentes

        Docente docenteA = new Docente("Eliana", "Suarez", "Female", 25890123, "Av. Siempre Viva", "Engineer", "elianasuarez@gmail.com", 1136454598);
        Docente docenteB = new Docente("Gustavo", "Garcia", "Male", 18909303, "Cabildo", "Economist", "gustavogarcia@gmail.com", 1123904998);
        Docente docenteC = new Docente("Pedro", "Ocasio", "Male", 29564839, "Juan B. Justo", "Traumatologist", "pedroocasio@gmail.com", 1134543458);

        // Creando Cursos

        Curso cursoA = new Curso(15, 101);
        Curso cursoB = new Curso(23, 120);
        Curso cursoC = new Curso(17, 99);

        // Creando Materias

        Materia materiaA = new Materia("Math", "Software Engineering", 2, alumnoA);
        materiaA.setCurso(cursoA);
        materiaA.setDocente(docenteA);

        Materia materiaB = new Materia("Economy I", "Economy", 1, alumnoB);
        materiaB.setCurso(cursoB);
        materiaB.setDocente(docenteB);

        Materia materiaC = new Materia("Anatomy I", "Medicine", 1, alumnoC);
        materiaC.setCurso(cursoC);
        materiaC.setDocente(docenteC);

        System.out.println("------------------ INFORMACION DE LAS MATERIAS ------------------");

        System.out.println("*** Materia A ***\nNombre: "+materiaA.getName()+
                            "\nCarrera en la que se dicta: "+materiaA.getCareerDictated()+
                            "\nAnio que se dicta: "+materiaA.getYearDictated()+
                            "\nDocente a cargo: "+materiaA.getDocente().getName()+" "+materiaA.getDocente().getSurname()+" - "+materiaA.getDocente().getProfession()+
                            "\nCurso: "+materiaA.getCurso().getNumberClassroom()+
                            "\nAlgun alumno: "+materiaA.getAlumno().getName()+" "+materiaA.getAlumno().getSurname()+"\n");

        System.out.println("*** Materia B ***\nNombre: "+materiaB.getName()+
                "\nCarrera en la que se dicta: "+materiaB.getCareerDictated()+
                "\nAnio que se dicta: "+materiaB.getYearDictated()+
                "\nDocente a cargo: "+materiaB.getDocente().getName()+" "+materiaB.getDocente().getSurname()+" - "+materiaB.getDocente().getProfession()+
                "\nCurso: "+materiaB.getCurso().getNumberClassroom()+
                "\nAlgun alumno: "+materiaB.getAlumno().getName()+" "+materiaB.getAlumno().getSurname()+"\n");

        System.out.println("*** Materia C ***\nNombre: "+materiaC.getName()+
                "\nCarrera en la que se dicta: "+materiaC.getCareerDictated()+
                "\nAnio que se dicta: "+materiaC.getYearDictated()+
                "\nDocente a cargo: "+materiaC.getDocente().getName()+" "+materiaC.getDocente().getSurname()+" - "+materiaC.getDocente().getProfession()+
                "\nCurso: "+materiaC.getCurso().getNumberClassroom()+
                "\nAlgun alumno: "+materiaC.getAlumno().getName()+" "+materiaC.getAlumno().getSurname()+"\n");

        System.out.println("------------------ INFORMACION DE LOS ALUMNOS ------------------");

        System.out.println("*** Alumno A ***\nNombre: "+alumnoA.getName()+
                "\nApellido: "+alumnoA.getSurname()+
                "\nGenero: "+alumnoA.getGender()+
                "\nDNI: "+alumnoA.getDni()+
                "\nCarrera: "+alumnoA.getCareer()+
                "\nNota 1er Parcial: "+alumnoA.getFirstGrade().getNumber()+ //Si no pongo el .getNumber() me trae la ubicacion de memoria.
                "\nNota 2do Parcial: "+alumnoA.getSecondGrade().getNumber()+
                "\nNOTA FINAL: "+notaFinalAlumnoA+"\n");

        System.out.println("*** Alumno B ***\nNombre: "+alumnoB.getName()+
                "\nApellido: "+alumnoB.getSurname()+
                "\nGenero: "+alumnoB.getGender()+
                "\nDNI: "+alumnoB.getDni()+
                "\nCarrera: "+alumnoB.getCareer()+
                "\nNota 1er Parcial: "+alumnoB.getFirstGrade().getNumber()+
                "\nNota 2do Parcial: "+alumnoB.getSecondGrade().getNumber()+
                "\nNOTA FINAL: "+notaFinalAlumnoB+"\n");

        System.out.println("*** Alumno C ***\nNombre: "+alumnoC.getName()+
                "\nApellido: "+alumnoC.getSurname()+
                "\nGenero: "+alumnoC.getGender()+
                "\nDNI: "+alumnoC.getDni()+
                "\nCarrera: "+alumnoC.getCareer()+
                "\nNota 1er Parcial: "+alumnoC.getFirstGrade().getNumber()+
                "\nNota 2do Parcial: "+alumnoC.getSecondGrade().getNumber()+
                "\nNOTA FINAL: "+notaFinalAlumnoC+"\n");














    }

}
