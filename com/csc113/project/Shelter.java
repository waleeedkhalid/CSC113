package com.csc113.project;

public class Shelter {
	private String name;
	private Pet pets[];
	private int petscount;


	public Shelter(String name) {
	    this.name = name;
	    this.pets = new Pet[10];
	    this.petscount = 0;
	}

	public boolean addPet(Pet p) throws PetException {
		if (petscount >= pets.length) return false;

        if(searchPet(p.getName()) != -1) return false;

        if (p instanceof Parrot) {
            pets[petscount++] = new Parrot((Parrot) p);
        } else if (p instanceof Dog) {
            pets[petscount++] = new Dog((Dog) p);
        } else if (p instanceof Cat) {
            pets[petscount++] = new Cat((Cat) p);
        } else {
        	throw new PetException("Please Select the Type of the pet.");
        }
        
        return true;
    }

	public int searchPet(String name) {
        for (int i = 0; i < petscount; i++) {
            if(pets[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }
	public boolean adoptPet(Pet p) {
	    int index = searchPet(p.getName());
	    if (index == -1) 
	    	return false;
	    pets[index] = pets[petscount - 1]; 
	    petscount--;
	    return true;
	}

	public Pet[] getAllPets() {
		Pet[] AllPets = new Pet[petscount];
	    for (int i = 0; i < petscount; i++) {
	    	AllPets[i] = pets[i];
	    }
	    return AllPets;
	}
	
	public Pet getPet(int index) {
		return pets[index];
	}


    public void displayPets() {
    	for (int i = 0; i < petscount; i++) {
            pets[i].toString();
        }
    }

	public void setName(String shelterName) {
		this.name = shelterName; 
	}
	
	public String getName() {
		return this.name;
	}

	public int getPetscount() {
		return petscount;
	}
	
    public void displayInfo() {
        System.out.println(name+" ("+petscount+"): ");
        for (int i = 0; i < petscount; i++) {
            System.out.print("-");
            pets[i].displayInfo();
        }
    }
    
    public String toString() {
        String c = name+" ("+petscount+"): ";
        for (int i = 0; i < petscount; i++) {
            System.out.print("-");
            c += pets[i].toString();
        }
        return c;
    }
}