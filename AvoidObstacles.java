package codeSignalPacka;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AvoidObstacles {
	
	int avoidObstacles(int[] inputArray) {
	    /*for(int i=0, k= 2;i<inputArray.size();i++){
	        
	    }*/
		
		return 5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 3, 6, 7, 9};
		/*Arrays.sort(arr);
		Arrays.asList(arr);
		for(int a = 3;a<=8;a++) {
			System.out.println("a is "+a);
			for(int b:arr) {
				
				System.out.println("b is "+b);
				if(b%a!=0) {
					System.out.println("The len is "+a);
				}
				
			}
		}*/
		Set<Integer> l = new HashSet<Integer>();
		for(int i = 0;i<arr.length;i++) {
			l.add(arr[i]);
		}
		for(int tab = 2;tab<=8;tab++) {
			System.out.println("tab is "+tab);
			for(int no:l) {
				System.out.println("no is "+no);
				if(!l.contains(tab)&& (no%tab !=0)) {
					System.out.println("The length is "+tab);
				}

			}
		}
		
		
		int len = new AvoidObstacles().avoidObstacles(arr);
	}

}
