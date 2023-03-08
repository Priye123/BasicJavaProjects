package Email_Administration_Application;

import java.util.Scanner;

//Random Password Generator
public class Aaaa {

	public static void main(String[] args) {
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%^&*";
		String s1="";
		// Random number generator

		// s.charAt(36)=i
		// s.charAt(69)=*
		// s.charAt(5)=F
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter ur password length::");
		int length=sc.nextInt();
		
		for (int i = 0; i < length; i++) {
			int a = (int) (Math.random() * s.length()); // 0-69
			System.out.print(s.charAt(a));
			//s1=s1+s.charAt(a);
		}
	}

}
