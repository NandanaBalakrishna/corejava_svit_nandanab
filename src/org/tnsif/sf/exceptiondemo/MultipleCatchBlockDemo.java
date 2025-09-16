package org.tnsif.sf.exceptiondemo;

public class MultipleCatchBlockDemo {

	public static void main(String[] args) {
		
		int numbers[]=new int[4];
		try {
				numbers[9]=50/0; // 2 exception
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException "+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException "+e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Exception "+e.getMessage());
		}
		
	}
}
