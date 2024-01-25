import chapter_1.Section;
import chapter_1.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Section CSC113 = new Section(20);
		try {
		File StudentNames = new File("names.txt");
	    Scanner StudentName = new Scanner(StudentNames);
        for(int i = 1; i < CSC113.getSectionSize(); i++) {
            CSC113.addStudent(new Student(i, StudentName.nextLine(), 18+i*2-i, "Male"));
        }
		} catch(FileNotFoundException e) {
			System.out.println(e);
		}

        System.out.println("===========================================");
        System.out.println();
        System.out.println();

        System.out.println("================= CSC113 =======================");
        CSC113.printStudents();

        System.out.println("===========================================");
        System.out.println();
        System.out.println();

        System.out.println("================= CSC113 =======================");
        CSC113.printStudents();
    }
}