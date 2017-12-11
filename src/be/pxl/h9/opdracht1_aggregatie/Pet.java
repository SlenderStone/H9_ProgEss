package be.pxl.h9.opdracht1_aggregatie;

public class Pet {
	private String name;
	
	public Pet() {
		
	}
	public Pet(String n) {
		setName(n);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
