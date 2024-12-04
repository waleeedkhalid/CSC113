package com.csc113.project;

import java.io.Serializable;

public abstract class Pet implements Serializable {
	protected String name;
    protected int age;
    protected String gender;

    public Pet(String name, int age, String gender) throws PetException {
        if (name == null) 
            throw new PetException("Please enter the name of the pet.");
        else if (age <= 0)
        	throw new PetException("Please enter the age of the pet.");
        if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")){
        this.name = name;
        this.age = age;
        this.gender = gender;
        }else 
        	throw new PetException("Please enter the gender of the pet.");
    }

    public Pet(Pet p) {
        this.name = p.name;
        this.age = p.age;
        this.gender = p.gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public abstract void displayInfo();
    
    public abstract String toString();
}

