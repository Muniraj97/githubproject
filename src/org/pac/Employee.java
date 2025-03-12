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
	System.out.println("hii");
	System.out.println("my name is muni");
	w.empName();
	}
}
