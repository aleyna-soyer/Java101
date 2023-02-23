import java.util.ArrayList;

public class Lesson18 {
	public static void main(String[] args) {
		ArrayList<String> groups = new ArrayList<String>();
		
		groups.add("Monday");
		groups.add("Tuesday");
		groups.add("Wednesday");
		groups.add("Thursday");
		groups.add("Friday");
		
		//groups.remove("Thursday");
		groups.remove(4);
		 System.out.println(groups.indexOf("Wednesday"));
		
		for(int i=0; i<groups.size(); i++) {
			System.out.println(groups.get(i)); 
		}
		
	}
	

}
