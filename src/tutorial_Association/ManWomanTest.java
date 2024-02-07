package tutorial_Association;

public class ManWomanTest {
	public static void main(String[] args) {
		Man A = new Man("Waleed", 25);
		Woman A1 = new Woman("Aomaymh", 26);
		Woman A2 = new Woman("Reem", 22);
		Woman A3 = new Woman("Raghad", 27);
		Woman A4 = new Woman("Afnan", 29);
		
		
		A.addWife(A1);
		A.addWife(A2);
		A.addWife(A3);
		A.addWife(A4);
		
//		A.displayWivesInfo();
		
//		A.getWives(29)[2].displayWomanInfo();
		A.displayWivesInfo();
		
		A.divorce(A1);
		
		A.displayWivesInfo();
	}
}
