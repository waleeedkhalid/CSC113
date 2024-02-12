package Inheritance;

public class SchoolStudent  extends Human {
    private String schName;
    private int schId;

    public SchoolStudent(double weight, double height, String name, String bloodGroup, String schName, int schId) {
        super(weight, height, name, bloodGroup);
        this.schName = schName;
        this.schId = schId;
    }
    
    public void display() {
    	super.display();
    	System.out.println(
    	    	"SchoolName: " + schName +
    	    	"\nSchoolId: " + schId);
    }
    
    public String toString() {
    	return 
    	"Name: " + name +
    	"\nBloodGroup: " + bloodGroup +
    	"\nHeight: " + height +
    	"\nWeight: " + weight +
    	"\nSchoolName: " + schName +
    	"\nSchoolId: " + schId;
    }
}
