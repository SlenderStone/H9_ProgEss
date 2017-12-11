package be.pxl.h9.opdracht3;

public class BoekApp {

	public static void main(String[] args) {
		Boek boek = new Boek();
		Auteur auteur = new Auteur();
		auteur.setNaam("Huilbrechts");
		auteur.setVoornaam("Seppe");
		
		boek.setBladzijden(69);
		boek.setIsbn("987-654-321");
		boek.setTitel("Seppelin");
		boek.setAuteur(auteur);
		
		System.out.println(boek.getAuteur().toString());
		System.out.println(boek.toonBoekGegevens());
		
	}

}
