package codeSignalPacka;

import java.util.Arrays;

public class AlternatingSums {
	int[] alternatingSums(int[] a) {
	    int[] b = new int[2];
	    b[0] = a[0];
	    b[1] = 0;
	   for(int i=1;i<a.length;i++){
	       if((i)%2==0){
	           b[0]+=a[i];
	       }
	       else{
	           b[1]+=a[i];
	       } 
	   }
	    return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {50, 60, 60, 45, 70};
		int[] ba = new AlternatingSums().alternatingSums(a);
		System.out.println(Arrays.toString(ba));
	}

}
