import java.util.Scanner;

public class Lesson8 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number: "); 
		int number = scan.nextInt();
		int sum=0;
		do {
			sum += number%10;
			number=number/10;
		}
		
		while(number>0) ;
			
			System.out.println("Sum= " + sum);
		
	}

}
