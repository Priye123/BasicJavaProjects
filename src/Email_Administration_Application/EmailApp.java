//--------------------------------------------------PROJECT-2-------------------------------------------------------------

package Email_Administration_Application;

import java.util.Scanner;

//Step-1:- take firstname and lastname from employee.
//Step-2:- Determine the department(Sales,development and accounting) if none,leave blank
//Step-3:- It should generate a new email based on the employee’s first name, last name and company domain
//Step-4:- Generate a random string for their password.
//Step-5:- Have set methods to change the password,set the mail_capacity and alternate email address.
//Step-6:- Have get methods to display name, email, and mailbox capacity.

public class EmailApp {

	// features
	String firstname;
	String lastname;
	String department;
	String companyname = "google";
	String password;
	String password1;
	int mail_capacity;
	String alternate_email;

	EmailApp(String fname, String lname) {
		firstname = fname;
		lastname = lname;

		department = dept();

//		System.out.println("--------------------------------------------------------------------------");
//		System.out.println("The name of the employee is::" + firstname + " " + lastname);// Neha Khan

//		// neha.khan@automation.google.com
//		System.out.println("The email generated for "+firstname+" is::" + firstname.toLowerCase() + "." + lastname.toLowerCase()
//				+ "@" + department.toLowerCase() + "." + companyname + ".com");
//		

		password = generatePassword(8); // fssuy*766%

		// System.out.println("The Random password is::"+password);
		// reset password
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the reset password::");
		String newPassword = sc.next();// Priye@123
		resetPassword(newPassword);

		// mailbox capacity:- MAXIMUM mail kitna aa sakta h
		System.out.print("Enter the mail box capacity::");
		int length = sc.nextInt();// 1000
		setCapacity(length); // 1000

		// alternate email
		System.out.println("Enter the alternate mail::");
		String mail = sc.next();// manbir@gmail.com
		setAlternateMail(mail);
		showInfo();

	}

	public String dept() {
		System.out.println("1.Automation\n2.development\n3.accounting\n4.none");
		System.out.print("Enter your Department::");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n == 1) {
			return "Automation";
		} else if (n == 2) {
			return "development";
		} else if (n == 3) {
			return "accounting";
		} else {
			return "";
		}

	}

	public String generatePassword(int length) {
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%^&*";
		String s1 = "";

		for (int i = 0; i < length; i++) {
			int a = (int) (Math.random() * s.length()); // 0-69
			s1 = s1 + s.charAt(a);
		}
		return s1;
	}

	public void resetPassword(String newPassword) {
		password1 = newPassword;// password=Priye@123
	}

	public void setCapacity(int length) {
		mail_capacity = length;
	}

	public void setAlternateMail(String mail) {
		alternate_email = mail;
	}

	public void showInfo() {
		System.out.println("-------------------------------------------------------");
		System.out.println("The name of the employee is::" + firstname + " " + lastname);// Neha Khan
		System.out.println("The Department of Employee is::" + department);
		System.out.println("The email generated for " + firstname + " is::" + firstname.toLowerCase() + "."
				+ lastname.toLowerCase() + "@" + department.toLowerCase() + "." + companyname + ".com");
		System.out.println("The Random password generated is::" + password);
		System.out.println("The Password reset by employee is::" + password1);
		System.out.println("The mailbox capacity is::" + mail_capacity);
		System.out.println("The alternate email is::" + alternate_email);
		System.out.println("--------------------------------------------------------");
	}

	public static void main(String[] args) {

		// employee detail
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the firstname::");

		String fname = sc.next();
		System.out.print("Enter the lastname::");

		String lname = sc.next();
		EmailApp e = new EmailApp(fname, lname);
	}

}
