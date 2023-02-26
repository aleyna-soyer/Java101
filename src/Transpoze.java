
public class Transpoze {
	public static void main(String[] args) {
		
		int matrix[][]={
				{1,2,3},
				{4,5,6},
			
		};
		int transpoze[][]=new int[3][2];
		for(int i=0; i<matrix.length+1; i++) {
			for(int j=0; j<transpoze[i].length; j++) {
				
				
				transpoze[i][j]=matrix[j][i];
				System.out.print(transpoze[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
