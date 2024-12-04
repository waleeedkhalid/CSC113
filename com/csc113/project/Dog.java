package com.csc113.project;

public class Dog extends Pet {
	private String size;
	private String breed;

    public Dog(String name, int age, String gender, String size, String breed) throws PetException {
        super(name, age, gender);
        this.size = size;
        this.breed = breed;
    }

    public Dog(Dog p) throws PetException {
    	this(p.name, p.age, p.gender,p.breed, p.size);
    }

    public String toString() {
    	return "Dog: " + name + ", Age: " + age + ", Gender: " + gender + ", Size: " + size + ", Breed: " + size;
    }
    
    public void displayInfo() {
    	System.out.println(toString());
    }
}

