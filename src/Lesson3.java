import java.util.Locale;
import java.util.Scanner;

public class Lesson3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Please enter a number: ");
		int a = scan.nextInt();
		System.out.println("The value of a is " + a);
		
		System.out.println("Please enter a number: ");
		double b= scan.nextDouble();
		System.out.println("The value of b is " + b);
		
		/*System.out.println("Please enter a text: ");
		String c= scan.nextLine();
		System.out.println("The value of c is " + c);*/
		
		
	}
}
 