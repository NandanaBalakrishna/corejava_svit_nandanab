package org.tnsif.sf.interfacedemo;

class EmailNotification implements NotificationService
{

	@Override
	public void notifyUser(String message) {
		System.out.println("sending email : + message");	
	}
	
}

class SMSNotification implements NotificationService
{

	@Override
	public void notifyUser(String message) {
		System.out.println("sending message :" + message);
	}
	
}


public class FunctionalInterfaceFemo {

	public static void main(String[] args) {
		NotificationService obj = new EmailNotification();
		NotificationService obj1 = new SMSNotification();
		
		obj.notifyUser("hello");
		obj1.notifyUser("hii nandu");

	}

}
