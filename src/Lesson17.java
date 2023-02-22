
public class Lesson17 {
	public static void main(String[] args) {
		String[] arabalar = {"BMW", "Mercedes", "Ford", "Ferrari"};
		for (String i : arabalar) {
		  System.out.println(i);}
		  
		  
		  int[][]matrix= {
				  {1,2,3},
				  {4,5,6},
				  {7,8,9},
				  {10,11,12}
				  
		  };
		  for(int[]u:matrix) {
			  for (int elem : u) {
	                System.out.print(elem +" ");
	            }
			  System.out.println();
		  }
		}
	}


