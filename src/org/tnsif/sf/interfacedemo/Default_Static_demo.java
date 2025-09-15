package org.tnsif.sf.interfacedemo;

public class Default_Static_demo {

	public static void main(String[] args) {
		Vehicle6 car=new Car6("KIA");
		Vehicle6 bike=new Bike6("Royal Enfield"); 
		
		car.start();
		car.stop();
		
		bike.start();
		bike.stop();
		
		car.repair();
		bike.repair();
		
		Vehicle6.checkMaintaince();
		
		
		System.out.println("maximun speed of vehicles" +"     " +  Vehicle6.Max_speed );
		
	}
}
