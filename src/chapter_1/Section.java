package chapter_1;

public class Section {
	
	public Student Students[];
	private int nbStudents;

	public int getNbStudents() {
		return nbStudents;
	}

	public int getSectionSize() {
		return Students.length;
	}


	public Section(int size) {
		Students = new Student[size];
		nbStudents = 0;
	}
	
	public boolean addStudentAggregation(Student stu) {
		// check the size
		if(nbStudents >= Students.length) {
			System.out.println("Section is Full !");
			return false;
		}
		// check if already exists
		if(nbStudents > 0) {
			for(int i = 0; i < nbStudents; i++) {
				if(stu.getStudentId() == Students[i].getStudentId()) {
					System.out.println("Student already in Section !");
					return false;
				}
			}
		}
		Students[nbStudents] = stu; // Aggregation
		
		nbStudents++;
		System.out.println("StudentId: " + stu.getStudentId() + " is Added !");
		return true;
	}
	
	public boolean addStudentComposition(Student stu) {
		if(nbStudents >= Students.length) {
			System.out.println("Section is Full !");
			return false;
		}
		if(nbStudents > 0) {
			for(int i = 0; i < nbStudents; i++) {
				if(stu.getStudentId() == Students[i].getStudentId()) {
					System.out.println("Student already in Section !");
					return false;
				}
			}
		}
		Students[nbStudents] = new Student(stu); // Composition
		
		nbStudents++;
		System.out.println("StudentId: " + stu.getStudentId() + " is Added !");
		return true;
	}

	public boolean removeStudent(int StudentId) {
		int StudentIndex = SearchById(StudentId);
		if(StudentIndex == -1) return false;
		System.out.println(Students[StudentIndex].getStudentName() + " removed");
		Students[StudentIndex] = Students[nbStudents-1];
		nbStudents--;
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
