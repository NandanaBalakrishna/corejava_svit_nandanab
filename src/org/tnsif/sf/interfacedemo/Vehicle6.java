package org.tnsif.sf.interfacedemo;

public interface Vehicle6 {
	void start();
	void stop();

	int Max_speed=120;
	
	default void repair()
	{
		System.out.println("Vehicle is being repaired");
	}
	static void checkMaintaince()
	{
		System.out.println("vehicle maintaince taken care here");
	}
}
class Car6 implements Vehicle6 
{
   private String model;
   
	public Car6(String model) {
		this.model = model;
	}

	@Override
	public void start() {
		
		System.out.println("car" + model +" is starting ");
	}

	@Override
	public void stop() {
		
		System.out.println("car" + model +" is stoping ");
	}
	
}
class Bike6 implements Vehicle6
{
   private String type;
   
   
   
	public Bike6(String type) {
		this.type = type;
	}

	@Override
	public void start() {
		
		System.out.println("car" +type+" is staring ");
	}

	@Override
	public void stop() {
		
		System.out.println("car" + type+" is stoping ");
	}
	
}

