package com.csc113.project;

public class Cat extends Pet{
	private String color;
	private String trait;

    public Cat(String name, int age, String gender, String color, String trait) throws PetException {
        super(name, age, gender);
        this.color = color;
        this.trait = trait;
    }

    public Cat(Cat p) throws PetException {
    	this(p.name, p.age, p.gender, p.color, p.trait);
    }

    public String toString() {
    	return "Cat: " + name + ", Age: " + age + ", Gender: " + gender + ", Color: " + color + ", Trait: " + trait;
    }

    public void displayInfo() {
    	System.out.println(toString());
    }

}
