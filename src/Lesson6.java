import java.util.Scanner;

public class Lesson6 {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("1: Balance viewing");
		System.out.println("2: Deposit money");
		System.out.println("3: Withdraw money");
		System.out.println("4: Exit");
	    
	    int balance=1000;
	    int cse=scan.nextInt();
	    
	    switch(cse) {
	    case 1:
	    	System.out.println("Balance:" + balance + "$");
	    	break;
	    case 2:
	    	System.out.println("How much money will you deposit?");
	    	int amount=scan.nextInt();
	    	
	    	balance+=amount;
	    	System.out.println("Balance: " + balance + "$");
	    	break;
	    case 3:
	    	System.out.println("How much money will you withdraw?");
	        amount=scan.nextInt();
	    	
	        if(amount>balance) {
	        	System.out.println("Insufficient balance");
	        	System.out.println("Balance: " + balance + "$");
	        }
	        else {
	        	
	        	balance-=amount;
	        	System.out.println("Balance: " + balance + "$");
	        }
	        break;
	    case 4:
	    	System.out.println("Exiting the system...");
	    	break;
	    default:
	    	System.out.println("Invalid case!!!");
	        break;
	    
	    }
	    

		
		}
}
