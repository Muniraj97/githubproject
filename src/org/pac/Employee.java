package org.pac;

public class Employee {
	public int a=10;
	private void empName() {
		a=50;
		
	}
public static void main(String[] args) {
	Employee w=new Employee();
	System.out.println(w.a);
	w.empName();
	System.out.println(w.a);
	System.out.println("muni is work completed");
	System.out.println("raj is not completed");
	w.empName();
	}
}
