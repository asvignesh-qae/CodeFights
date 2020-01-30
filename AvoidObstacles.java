package codeSignalPacka;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AvoidObstacles {
	
	int avoidObstacles(int[] a) {
	    int j =2;
	    Arrays.sort(a);
	    System.out.println(Arrays.toString(a));
	    for(int i=0;i<a.length;i++){
	        if(a[i]%j==0){
	            j+=1;
	            i=-1;
	        }
	    }
	    return j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 3, 6, 7, 9};		
		int len = new AvoidObstacles().avoidObstacles(arr);
		System.out.println("Avoid obstacles by jumping "+len);
	}

}
