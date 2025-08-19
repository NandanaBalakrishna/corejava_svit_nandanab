package org.tnsif.sf.c2tc.oops;

class Payment1
{
	void process()
	{
		System.out.println("processing payment using standard gateway");
	}
}

class Gpay extends Payment1
{
	void process()
	{
		System.out.println("processing payment via google pay");
	}
	void completeTransaction() 
	{
		super.process();
		process();
	}
}


public class SuperMethod {

	public static void main(String[] args) {
		Gpay obj = new Gpay();
		obj.completeTransaction();
	}
}
