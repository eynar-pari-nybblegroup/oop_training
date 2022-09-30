package school;

public class Grade
{
    private float firstGrade;
    private float secondGrade;
    private float finalNote;

    public Grade()
    {
        System.out.println("Constructor Grade");
    }

    //Getters & Setters


    public float getFirstGrade() {
        return firstGrade;
    }

    public void setFirstGrade(float firstGrade) {
        this.firstGrade = firstGrade;
    }

    public float getSecondGrade() {
        return secondGrade;
    }

    public void setSecondGrade(float secondGrade) {
        this.secondGrade = secondGrade;
    }

    public float getFinalNote() {
        return finalNote;
    }

    public void setFinalNote(float finalNote) {
        this.finalNote = finalNote;
    }
}
