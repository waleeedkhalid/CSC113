package Inheritance;

public class SchoolStudent  extends Human {
    private String schName;
    private int schId;

    public SchoolStudent(double weight, double height, String name, String bloodGroup, String schName, int schId) {
        super(weight, height, name, bloodGroup);
        this.schName = schName;
        this.schId = schId;
    }
}
