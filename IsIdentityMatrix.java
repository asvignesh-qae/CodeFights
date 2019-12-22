package challengesCodeSignal;

public class IsIdentityMatrix {
	int i,j,s,d;
	boolean isIdentityMatrix(int[][] m) {
	    for(i=0;i<m.length;i++){
	    	d+=m[i][i];
	    	for(j=0;j<m.length;j++) {
	    		s+=m[i][j];
	    	} 
	    }
	    System.out.println("The sum is "+s);
	    System.out.println("The diagonal sum is "+d);
	    System.out.println("The length of the row in matrix is "+m[0].length);
	    System.out.println("The length of matrix is "+m.length);
	    return s==m[0].length && d==m[0].length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {{1,0,0},{0,1,0},{0,0,1}};
		boolean isIdentityMatrix = new IsIdentityMatrix().isIdentityMatrix(mat);
		System.out.println(isIdentityMatrix);
	}

}
