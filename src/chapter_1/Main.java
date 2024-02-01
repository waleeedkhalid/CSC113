package chapter_1;

public class Main {
    public static void main(String[] args) {
    	// Creating Section object
    	Section sec = new Section(3);
    	
    	Student sAgg = new Student(1, "Abod", 21, "Male");
    	Student sComp = new Student(2, "Ali", 22, "Male");

    	
    	// Aggregation Add will be enter the reference and not creating new object just do the code =>
    	// array[counter] = stu;
    	sec.addStudentAggregation(sAgg);
    	sAgg.setStudentAge(50);
    	System.out.println(sAgg.getStudentAge());
    	System.out.println(sec.Students[0].getStudentAge());
    	
    	// Composition will Create a new copy Student Object such if the section deleted the objects inside also will be destoryed
    	// array[counter] = new Student(stu);
    	sec.addStudentComposition(sComp);
    	sComp.setStudentAge(50);
    	System.out.println(sComp.getStudentAge()); // 50
    	System.out.println(sec.Students[1].getStudentAge()); // 21 (won't changed because has another ref value)
    }
}