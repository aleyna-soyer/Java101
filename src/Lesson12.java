import java.util.Scanner;

public class Lesson12 {
	public static void parameters(String name, int age) {
		System.out.println(name+ " "+age);
	}
	public static void main(String[] args) {
		parameters("aleyna",22);
		Scanner scan = new Scanner(System.in);
		System.out.println("Name: ");
		System.out.println("Age: ");
		parameters(scan.nextLine(), scan.nextInt());
		
		
	}

	
}
