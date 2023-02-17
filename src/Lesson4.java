import java.util.Scanner;

public class Lesson4 {

	public static void  main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Please enter your note: ");
		
		int note=scn.nextInt();
		
		if(note>90) {
			System.out.println("You passed the lesson.. Note:AA");
		}
		
		else if(note>85) {
			System.out.println("You passed the lesson.. Note:BA");
			
		}
		
		else if(note>80) {
			System.out.println("You passed the lesson.. Note:BB");
			
		}
		
		else {
			System.out.println("You failed the lesson!!!");
		}
	}
}
