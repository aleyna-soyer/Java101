import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int value=scan.nextInt();
		int previous=0;
		int pre=1;
		int next;
		
		System.out.println(previous);
		System.out.println(pre);
		for(int i=1; i<value; i++) {
			next=previous+pre;
			System.out.println(next);
			previous=pre;
			pre=next;
		}
		
		
	}

}
