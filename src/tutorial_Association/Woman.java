package tutorial_Association;

public class Woman {
	private String name;
	private int age;
	private Man husband;
	
	public Woman(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Man getHusband() {
		return husband;
	}

	public void setHusband(Man husband) {
		this.husband = husband;
	}
	
	
	public void displayWomanInfo() {
		System.out.println("Name: " + name +"\nAge: " + age + "\nHusband: " + husband.getName());
	}
	
}
