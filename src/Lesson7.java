import java.util.Scanner;

public class Lesson7 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a value: ");
		int value = scan.nextInt() ;
		int factorial=1;
		
			while(value>=1) {
				
				factorial=factorial*value;
				value--;
				
			}
			System.out.println(factorial);
		
	}

}