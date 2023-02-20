import java.util.Scanner;

public class Lesson11 {

	public static void factorial() {
		System.out.println("Value: ");
		Scanner scan = new Scanner(System.in);
		int value=scan.nextInt();
		int factorial=1;
		
		while(value>0) {
			factorial*=value;
			value--;
		}
		System.out.println(factorial);
	}
	
	public static void main(String[] args) {
		factorial();	
	}
}
