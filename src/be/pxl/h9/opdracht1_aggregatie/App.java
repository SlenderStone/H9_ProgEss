package be.pxl.h9.opdracht1_aggregatie;

public class App {

	public static void main(String[] args) {
		Pet p = new Pet("Seppe");
		Owner o = new Owner("Willem",p);
		Owner o2 = new Owner("Yarne",p);
		
		
		System.out.println(o.print());
		o.setPet(null);
		p.setName("Sebastiaan");
		System.out.println(o2.print());
	}

}
