
public class Problem15 {
	public static void main(String[] args){
		int n = 20;
	    long grid[][] = new long[n+1][n+1];
	    
	    for (int i = 0; i <= n; i++) {
	        grid[i][0] = 1;
	        grid[0][i] = 1;
	    }
	    
	    for (int i = 1; i <= n; i++) {
	        for (int j = 1; j <= n; j++) {
	        	grid[i][j] = grid[i-1][j] + grid[i][j-1];
	        }
	    }
	    System.out.println(grid[n][n]);
	}
}
