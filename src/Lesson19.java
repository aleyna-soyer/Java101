
public class Lesson19 {
	public static void main(String[] args) {
		String s1="Airplane";
	
		String s2= new String("Airplane");
		
		System.out.println(s2.length());
		
		System.out.println("index 0= " + s2.charAt(0));
		System.out.println("index 6= " + s2.charAt(6));
		System.out.println("index 6= " + s2.charAt(s2.length()-2) );
		
		System.out.println(s2.startsWith("Ai"));
		System.out.println(s2.endsWith("le"));
	}

}
