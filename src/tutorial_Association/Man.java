package tutorial_Association;

public class Man {
	private String name;
	private int age;
	private Woman wives[];
	private int nbwives;
	
	public Man(String name, int age) {
		this.name = name;
		this.age = age;
		this.wives = new Woman[4];
		this.nbwives = 0;
	}
	
	//+addWife(wife:Woman):Boolean
	public boolean addWife(Woman wife) {
		if(nbwives >= wives.length) return false;
		wives[nbwives++] = wife;
		wife.setHusband(this);
		return true;
	}
	
	//+displayWivesInfo():void 
	public void displayWivesInfo() {
		if(nbwives == 0) { 
			System.out.println("Ohh..He is unmarried");
			return;
		}
		String Info = "- " + name + "'s Wives:";
		for(int i = 0; i < nbwives; i++) {
			Info += "\nWife ("+(i+1)+"/"+nbwives+") => " +
			"\nName: " + wives[i].getName() + 
			"\nAge: " + wives[i].getAge() + 
			"\nHusband: " + wives[i].getHusband().getName();
		}
		
		System.out.println(Info);
	}
	
	
	//+divorce(w: Woman)
	public void divorce(Woman wife) {
		for(int i = 0; i < nbwives; i++) {
			if(wives[i].equals(wife)) {
				System.out.println("Wife " + wives[i].getName() + " has been divorced.");
				wives[i] = wives[nbwives-1];
				nbwives--;
				return;
			}
		}
		System.out.println("Wife not found.");
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

	public Woman[] getWives(int ageless) {		
		Woman[] wivesAgeLess = new Woman[nbwives];		
		int j = 0;
		for(int i = 0; i < nbwives; i++) {
			if(wives[i].getAge() < ageless) {
				wivesAgeLess[j++] = wives[i];
			System.out.println(wives[i].getName());
			}
		}
		
		return wivesAgeLess;
	}

	
	//+getYoungestWife():Woman
	public Woman getYoungestWife() {
		if(nbwives == 0) return null;
		Woman YoungestWife = wives[0];
		for(int i = 1; i < nbwives; i++) {
			if(wives[i].getAge() < YoungestWife.getAge())
				YoungestWife = wives[i];
		}
		
		return YoungestWife;
	}
	
}
