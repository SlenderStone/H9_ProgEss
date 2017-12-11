package be.pxl.h9.oef1;

public class HuwelijkApp {

	public static void main(String[] args) {
		Persoon p1 = new Persoon();
		Persoon p2 = new Persoon();
		Huwelijk h = new Huwelijk(p1,p2, 6,12,1998);
		System.out.println(h.print());
	}

}
