package Inheritance;
public class Human {
    protected double weight, height;
    protected String name, bloodGroup;

    public Human(double weight, double height, String name, String bloodGroup) {
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.bloodGroup = bloodGroup;
    }
    
    public void display() {
    	System.out.println("height=" + height);
    	System.out.println("weight=" + weight);
    	System.out.println("name=" + name);
    	System.out.println("bloodGroup=" + bloodGroup);
    	
    }
}
