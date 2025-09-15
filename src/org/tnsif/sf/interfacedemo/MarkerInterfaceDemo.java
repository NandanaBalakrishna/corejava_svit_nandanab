package org.tnsif.sf.interfacedemo;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Registerable s = (Registerable) new Student(102, "neha",12000.3, "java");
		s.getId();
		s.setId(100);
		s.getName();
		s.setName("Ravi");
		s.getFees();
		s.setFees(100000.00);
		s.getCourse();
		s.setCourse("Ai");

	}

}
