
public class Lesson13 {
	public static int multiplication(int a) {
		return a*3;
	}
	public static int addition(int a) {
		return a+2;
	}
	public static int substraction(int a) {
		return a-4;
	}
	public static void main(String[] args) {
		System.out.println("Result: "+ substraction(addition(multiplication(10))));
	}

}
