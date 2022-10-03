package school;

public class Grade
{
    private int grade;
    private String description;

    //Constructor
    public Grade(int grade, String description)
    {
        this.grade = grade;
        this.description = description;
    }

    //Getters & Setters


    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void showInfo()
    {
        System.out.println("Grade: " + grade);
        System.out.println("description:" + description);
    }
}
