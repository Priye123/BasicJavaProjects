package com.priye;

import java.util.ArrayList;
import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<>();
		ArrayList<Integer> al1=new ArrayList<>();
		al.add(10);
		al.add(21);
		al.add(11);
		al.add(32);
		al.add(1);
		System.out.println(al);
		
		for(int i=al.size()-1;i>=0;i--) {
			if(al.get(i)%2==0) {
				al.remove(i);
			}
		}
		System.out.println(al);
	}
}
