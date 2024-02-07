package Inheritance;

public class UniversityStudent extends SchoolStudent {
    private String UniName;
    private int Id;
    private double gpa;


    public UniversityStudent(double weight, double height, String name, String bloodGroup, String schName, int schId, String uninamae, int Id, double gpa) {
        super(weight, height, name, bloodGroup, schName, schId);
        this.UniName = uninamae;
        this.Id = Id;
        this.gpa = gpa;
    }
}
