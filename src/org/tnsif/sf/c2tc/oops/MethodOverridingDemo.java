package org.tnsif.sf.c2tc.oops;

class Payment{
	void makePayment() {
		System.out.println("processing payment using generic method");
	}
}
//sub class

class UpiPayment extends Payment{
	void makePayment() {
		System.out.println("payment made using UPI");
	}
}

class CardPayment extends Payment{
	void makePayment() {
		System.out.println("payment made using credit/debit card");
	}
}

class Walletpayment extends Payment{
	void makePayment() {
		System.out.println("payment made using digital wallet");
	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		Payment payment;
		payment=new UpiPayment();
		payment.makePayment();
		
		payment = new CardPayment();
		payment.makePayment();
		
		payment=new Walletpayment();
		payment.makePayment();

	}

}







