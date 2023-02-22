import java.util.Scanner;

public class Lesson15 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arry[]= new int[5];
		System.out.println("Enter values: ");
		for(int i=0; i<arry.length; i++) {
			arry[i]=scan.nextInt();
		}    
		System.out.println(mean(arry));
		
		
		
	}
	public static double mean(int[]arr) {
		int total=0;
		for(int i=0; i<arr.length; i++) {
			total+=arr[i];
		}
		return total/arr.length;

	}
	

}
