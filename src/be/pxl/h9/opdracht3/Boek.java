package be.pxl.h9.opdracht3;

public class Boek {
	private String isbn;
	private String titel;
	private int bladzijden;
	private Auteur auteur;
	
	public Boek() {
		this("","",0, new Auteur());
	}
	
	public Boek(String isbn, String titel, int bladzijden, Auteur auteur) {
		setIsbn(isbn);
		setTitel(titel);
		setBladzijden(bladzijden);
		setAuteur(auteur);
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public int getBladzijden() {
		return bladzijden;
	}

	public void setBladzijden(int bladzijden) {
		this.bladzijden = bladzijden;
	}

	public Auteur getAuteur() {
		return auteur;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}
	
	public String toonBoekGegevens() {
		StringBuilder retvalue = new StringBuilder("Boekgegevens:\n");
		retvalue.append("isbn Nummer: "+getIsbn()+"\n");
		retvalue.append("Titel: "+getTitel()+"\n");
		retvalue.append("Bladzijden: "+getBladzijden()+"\n");
		retvalue.append("Auteur: "+getAuteur().toString());
		return retvalue.toString();
	}
}
