package aa.test.classes;

import Inheritance.Human;
import Inheritance.SchoolStudent;

public class TestInheritance {
	public static void main(String[] args) {
		Human h = new Human(7.6, 7.6, "Suliman", "O-");
//		h.display();
		
//		System.out.println("=======");
		SchoolStudent ss = new SchoolStudent(7.6, 6.5, "Abod", "O+", "ABC", 101);
//		ss.display();
		
		h = ss; // Parent = Child like double = int no problem;
		//ss = (SchoolStudent) h; // Child = (Cast Child Class)Parent;
		
		h.display(); // runs display of SchoolStudent Class
		
	}
}
