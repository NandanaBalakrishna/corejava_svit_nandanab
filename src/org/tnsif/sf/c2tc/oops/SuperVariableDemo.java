package org.tnsif.sf.c2tc.oops;

class Notification
{
	String message="default Notification";
}

class PushNotification extends Notification
{
	String message="push notification from whatsapp";
	
	void showNotification()
	{
		System.out.println("child message : "+message);
		System.out.println("parent message : "+message);
	}
}
public class SuperVariableDemo {

	public static void main(String[] args) {
		PushNotification pn = new PushNotification();
		pn.showNotification();

	}

}
