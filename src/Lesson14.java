
public class Lesson14 {
	
public static void score(String name, int score) {
	System.out.println("Name: "+name+ " Score: "+score);
}
public static void score(int score) {
	System.out.println("Noname "+ "Score: " +score);
}
public static void score(String name) {
	System.out.println(name+" Score:0");
}

public static void main(String[] args) {
	score("susu",50);
	score(100);
	score("raskolnikov");
}



}
