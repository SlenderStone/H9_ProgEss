package be.pxl.h9.opdracht1_aggregatie;

import be.pxl.h9.opdracht1_aggregatie.Pet;

public class Owner {
	private String name;
	private Pet pet;
	
	public Owner() {
		
	}
	public Owner(String n, Pet p) {
		setName(n);
		setPet(p);
	}
	
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String print() {
		String retvalue = getName()+" heeft een dier met naam "+pet.getName();
		return retvalue;
	}
}
