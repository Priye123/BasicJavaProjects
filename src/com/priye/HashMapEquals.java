package com.priye;

import java.util.HashMap;

public class HashMapEquals {
	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("C", "Dennis Ritchie");
		hm.put("C++", "Bjarne Stroustrup");
		hm.put("Java", "James Gosling");
		hm.put("Python", "Guido van Rossum");

		HashMap<String, String> hm1 = new HashMap<String, String>();

		hm1.put("C", "Dennis Ritchie");
		hm1.put("C++", "Bjarne Stroustrup");
		hm1.put("Java", "James Gosling");
		hm1.put("Python", "Guido van Rossum");

		boolean a = hm.equals(hm1);
		System.out.println(a);

		HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
		hm2.put("Aamir", 1000);
		hm2.put("Kumar", 1001);
		hm2.put("John", 1002);

		boolean b = hm.equals(hm2);
		System.out.println(b);
	}
}
