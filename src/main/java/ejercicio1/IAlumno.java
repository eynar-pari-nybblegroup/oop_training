package ejercicio1;

public interface IAlumno {

    default float calcularNotaFinal( Nota nota1, Nota nota2 ){
        float notaFinal = (nota1.getNumber() + nota2.getNumber())/2;
        return notaFinal;
    }

}
