package ejercicio1;

public class Curso {

    private int numberOfMembers;
    private int numberClassroom;

    public Curso(int numberOfMembers, int numberClassroom) {
        this.numberOfMembers = numberOfMembers;
        this.numberClassroom = numberClassroom;
    }

    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    public void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }

    public int getNumberClassroom() {
        return numberClassroom;
    }

    public void setNumberClassroom(int numberClassroom) {
        this.numberClassroom = numberClassroom;
    }
}
