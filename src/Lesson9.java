import java.util.Scanner;

public class Lesson9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a value: ");
		
		// Harmonic number= 1 + 1/2 + 1/3 +...+ 1/n
		
		int value = scan.nextInt();
		float sum=0;
		for(float i=1; i<=value; i++) {
			
			sum+=1/i;
		}
		System.out.println(sum);
	}
}
