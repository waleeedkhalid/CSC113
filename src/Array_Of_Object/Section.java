package Array_Of_Object;

public class Section {
	
	private Student Students[];
	private int nbStudents;
	
	public int getSectionSize() {
		return Students.length;
	}
	
	public Section(int size) {
		Students = new Student[size];
		nbStudents = 0;
	}
	
	public boolean addStudent(Student stu) {
		if(nbStudents >= Students.length) {
			System.out.println("Section is Full !");
			return false;
		}
		Students[nbStudents] = stu;
		nbStudents++;
		System.out.println("StudentId: " + stu.getStudentId() + " is Added !");
		return true;
	}
	
	public int SearchById(int id) {
		for(int i=0; i < nbStudents; i++) {
			if(Students[i].getStudentId() == id) 
				return i;
		}
		return -1;
	}
	
	public void printStudent(int id) {
		int StudentIndex = SearchById(id);
		System.out.println(
				"StudentId: " + Students[StudentIndex].getStudentId() +
				"\nStudentName: " + Students[StudentIndex].getStudentName() +
				"\nStudentAge: " + Students[StudentIndex].getStudentAge() +
				"\nStudentGender: " + Students[StudentIndex].getStudentGender()
				);
	}
	
	public void printStudents() {
		for(int i = 0; i < nbStudents; i++) {
		System.out.println("======================================");
			System.out.println(
					"StudentId: " + Students[i].getStudentId() +
					"\nStudentName: " + Students[i].getStudentName() +
					"\nStudentAge: " + Students[i].getStudentAge() +
					"\nStudentGender: " + Students[i].getStudentGender());
		}
	}
}
