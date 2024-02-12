package question_7;

public class VendingTest {
	public static void main(String[] args) {
		Sweet Choc = new Sweet("Chocolate", 15);
		Sweet Bel = new Sweet("Belgeki", 15);
		Sweet Swes = new Sweet("Swesryi", 15);
		Sweet Strawberry = new Sweet("Strawberry", 15);
		Sweet Blueberry = new Sweet("Blueberry", 15);
		
		VendingMachine RUH_123 = new VendingMachine(5);
		
		Sweet[] PCKG_ONE = new Sweet[5];
		PCKG_ONE[0] = Choc;
		PCKG_ONE[1] = Bel;
		PCKG_ONE[2] = Swes;
		PCKG_ONE[3] = Strawberry;
		PCKG_ONE[4] = Blueberry;
		
		
		
		System.out.println(RUH_123.depositSweet(PCKG_ONE));
		System.out.println(RUH_123.toString());
	}
}
