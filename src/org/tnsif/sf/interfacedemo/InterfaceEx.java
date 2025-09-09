package org.tnsif.sf.interfacedemo;

class car implements Vehicle{
	public void start()
	{
		System.out.println("car has started: ");
	}
	public void stop()
	{
		System.out.println("car has stoped: ");
	}
	public void accelerate()
	{
		String speed = null;
		System.out.println("car is accelerating to " + speed + "km: ");
	}
	public void brake()
	{
		System.out.println("car has braking: ");
	}
	@Override
	public void accelerate(int speed) {
		// TODO Auto-generated method stub
		
	}

	
}


public class InterfaceEx {

	public static void main(String[] args) {
		Vehicle Car1=new car();
		Car1.start();
		Car1.stop();
		Car1.accelerate(30);
		Car1.brake();

	}

}
