package com.csc113.project;

public class Parrot extends Pet {
	private boolean TalkingAbility;
	private String Species;

    public Parrot(String name, int age, String gender, boolean TalkingAbility, String species) throws PetException {
        super(name, age, gender);
        this.TalkingAbility = TalkingAbility;
        this.Species = species;
    }

    public Parrot(Parrot p) throws PetException {
    	this(p.name, p.age, p.gender, p.TalkingAbility, p.Species);
    }

    
    public String toString() {
    	return "Parrot: " + name + ", Age: " + age + ", Gender: " + gender + ", Talking Ability : " + TalkingAbility + ", Species: " + Species;
    }

    public void displayInfo() {
    	System.out.println(toString());
    }
}

