package atividadeJava12072022;

public class Atividade03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1[][] = {{1,2,3,4,5,6}, {1,2,3,4,5,6}, {1,2,3,4,5,6}, {1,2,3,4,5,6}};
	    int n2[][] = {{6,5,4,3,2,1}, {6,5,4,3,2,1}, {6,5,4,3,2,1}, {6,5,4,3,2,1}};
	    int m1[][] = new int[4][6];
	    int m2[][] = new int[4][6];

	    for (int l = 0; l < n1.length; l++) {
	      for (int c = 0; c < n1[0].length; c++) {
	        m1[l][c] = n1[l][c] + n2[l][c];
	        m2[l][c] = n1[l][c] - n2[l][c];
	      }
	      System.out.println("\nSoma:");
	      for (int c = 0; c < n1[0].length; c++) {
	        System.out.print(m1[l][c] + " | ");
	      }
	      System.out.println("\nDiferenca:");
	      for (int c = 0; c < n1[0].length; c++) {
	        System.out.print(m2[l][c] + " | ");
	      }
	    }

	  }

	

}
