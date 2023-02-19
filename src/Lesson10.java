import java.util.Scanner;

public class Lesson10 {

	public static void main(String[] args) {
		
		while (true) {
			Scanner scan = new Scanner(System.in);
			String s;
			System.out.println("Enter a character: ");
			s=scan.nextLine();
			
			if(s.equals("k")) {
				System.out.println("True");
				break;
			}
			
		}
		
		int i=0;
		while(i<10) {
			if(i==4||i==7) {
				i++;
				continue;
			}
			
			System.out.println("i: " + i);
			i++;
		}
	}
}
