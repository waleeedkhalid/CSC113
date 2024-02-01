package chapter_1;

public class Student {
	private String studentName;
	private int studentId;
	private int studentAge;
	private String studentGender;
	
	
	public Student(int id, String name, int age, String gender) {
		this.studentId = id;
		this.studentName = name;
		this.studentAge = age;
		this.studentGender = gender;
	}
	
	public Student(Student stu) {
		this.studentId = stu.studentId;
		this.studentName = stu.studentName;
		this.studentAge = stu.studentAge;
		this.studentGender = stu.studentGender;
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
