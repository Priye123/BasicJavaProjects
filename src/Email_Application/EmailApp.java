package Email_Application;

public class EmailApp {

	public static void main(String[] args) {
		Email e=new Email("Priye","Ranjan");
		e.setPassword("Priye@123");
		e.setalternatemail("priyerock@gmail.com");
		e.setmailboxCapacity(100);
		
		System.out.println(e.showInfo());
	}

}
