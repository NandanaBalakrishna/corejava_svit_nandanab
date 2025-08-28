package org.tnsif.sf.c2tc.constructor;

import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name:");
		
		char c = scanner.next().charAt(0);
		System.out.println(c);
		
		scanner.close();
	}

}
