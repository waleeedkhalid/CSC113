package chapter_1;

public class Student {
	private String studentName;
	private int studentId;
	private int studentAge;
	private String studentGender;
	
	
	public Student(int id, String name, int age, String g) {
		this.studentId = 111000000+id;
		this.studentName = name;
		this.studentAge = age;
		this.studentGender = g;
	}

	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public int getStudentAge() {
		return studentAge;
	}


	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}


	public String getStudentGender() {
		return studentGender;
	}


	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
}
