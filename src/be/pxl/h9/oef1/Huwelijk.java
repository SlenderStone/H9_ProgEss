package be.pxl.h9.oef1;

public class Huwelijk {
	private Persoon p1 = new Persoon();
	private Persoon p2 = new Persoon();
	private Datum d1 = new Datum();
	
	public Huwelijk(Persoon p, Persoon p3, int d, int m, int j) {
		p1 = p;
		p3.setAdres(p.getAdres());
		p2 = p3;
		d1.setDag(d);
		d1.setMaand(m);
		d1.setJaar(j);
		System.out.println(p1.toString()+" en "+p2.toString()+" zijn gehuwd op "+d1.toString());
	}
	
	public Persoon getP1() {
		return p1;
	}
	public Persoon getP2() {
		return p2;
	}
	public Datum getDatum() {
		return d1;
	}
	
	public void adresWijziging(String naam, String nr, int pc, String Naam) {
		p1.getAdres().setStraat(naam);
		p1.getAdres().setHuisnr(nr);
		p1.getAdres().getGemeente().setGemNaam(Naam);
		p1.getAdres().getGemeente().setPostcode(pc);
		p2.getAdres().setStraat(naam);
		p2.getAdres().setHuisnr(nr);
		p2.getAdres().getGemeente().setGemNaam(Naam);
		p2.getAdres().getGemeente().setPostcode(pc);
	}
	
	public String print() {
		String retvalue = p1.toString()+"\n\n"+p2.toString()+"\n\nhet huwelijk vond plaats op "+this.getDatum().toString();
		return retvalue;
	}

}
