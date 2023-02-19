import java.util.Scanner;

public class Lesson5 {
public static void main(String[] args) {
	
	String UsrName="mansur";
	String pswd="12345";
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Username: ");
	
	String UserName=scan.nextLine();
	System.out.println("Password: ");
	

	String password = scan.nextLine();
	
	if(!(UsrName.equals(UserName))&&!(pswd.equals(password))) {
		
		System.out.println("Wrong username and password!");
	}
	else if((UsrName.equals(UserName))&&!(pswd.equals(password))) {
		
		System.out.println("Wrong password!");
	}
	else if(!(UsrName.equals(UserName))&&(pswd.equals(password))) {
		
		System.out.println("Wrong username!");
	}
	else {
		System.out.println("Successful login...");
	}
	
}
	
}
