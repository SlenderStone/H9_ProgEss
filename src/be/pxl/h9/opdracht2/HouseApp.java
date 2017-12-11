package be.pxl.h9.opdracht2;

public class HouseApp {

	public static void main(String[] args) {
		House house = new House();
		
		System.out.println(house.getKitchen().getName()+" "+house.getBathroom().getName()+" "+house.getLivingRoom().getName()+" "+house.getSleepingRoom().getName());
	}

}
