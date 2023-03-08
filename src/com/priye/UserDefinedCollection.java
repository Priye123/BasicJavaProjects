package com.priye;

import java.util.ArrayList;

public class UserDefinedCollection {

	public static void main(String[] args) {
//		ArrayList<Custom> a=new ArrayList<>();
//		a.add(new Custom("Priye", 123, 321.55));
//		a.add(new Custom("Ranjan", 211, 154.33));
//		a.add(new Custom("Manbir", 132, 144.33));
//		
//		for(Custom c:a) {
//			System.out.println(c.name+" "+c.roll+" "+c.salary);
//		}
		
		

	}
}

class Custom{
	String name;
	int roll;
	double salary;
	
//	@Override
//	public String toString() {
//		return "Custom [name=" + name + ", roll=" + roll + ", salary=" + salary + ", getClass()=" + getClass()
//				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
//	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Custom(String name, int roll, double salary) {
		this.name = name;
		this.roll = roll;
		this.salary = salary;
	}
	
	
}
