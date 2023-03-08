package Email_Application;

import java.util.Scanner;

public class Email {
	private String fname;
	private String lname;
	private String department;
	private String password;
	private String companydomain="Xoriant.com";
	private int mailboxCapacity;
	private String alternatemail;
	
	Email(String f, String l) {
		fname=f;
		lname=l;
		department=dept();
		System.out.println("Employee name::"+fname+" "+l);
		System.out.println("DEPARTMENT:"+department);
		password=randomPassword(8);
		System.out.println("The random paasword generated is:"+password);
		System.out.println("The mail id is::"+f.toLowerCase()+"."+l.toLowerCase()+"@"+department.toLowerCase()+"."+companydomain.toLowerCase());
	}

	private String dept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select Department:\n1 sales\n2 development\n3 accounting\n0 none");
		int i=sc.nextInt();
//		switch(i) {
//		case 1:
//			return "sales";	
//		case 2:
//			return "dev";
//		case 3:
//			return "accounting";
//		case 0:
//			return "";
//		}
		if(i==1) return "sales";
		else if(i==2) return "dev";
		else if(i==3) return "accounting";
		else return "";
	}
	
	private String randomPassword(int length) {
		String s="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz012345678@#$%^&*";
		String s1="";
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random()*s.length());
			s1=s1+s.charAt(rand);
		}
		return s1;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
	
	public void setmailboxCapacity(int capacity) {
		mailboxCapacity=capacity;
	}
	
	public void setalternatemail(String mail) {
		alternatemail=mail;
	}
	
//	public String getPassword() { return password;}
//	public int getmailboxCapacity() { return mailboxCapacity;}
//	public String getalternatemail() { return alternatemail;}
	
	public String showInfo() {
		return "The changed password is::"+password+"\n"+
			   "The Capacity of mail is::"+mailboxCapacity+"\n"+
			   "The alternate email is::"+alternatemail;
	}
	
}
