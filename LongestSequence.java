package codeSignalPacka;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSequence {

	int longestSequence(int[] a) {
		//Arrays.sort(a);
		System.out.println("The length of a is "+a.length);
		Integer[] i_a = new Integer[a.length];
		for(int i=0;i<a.length;i++) {
			i_a[i] = a[i];
		}
		Set<Integer> set_a = new HashSet(Arrays.asList(i_a));
		//Arrays.sort(a);
		System.out.println("The length of set_a is "+set_a);
		for(Integer int_set_a: set_a) {
			System.out.println(int_set_a);
		}
		return 4;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, -2, 7, 3, -7, 4, 9, 2, -8, -5, -5, -7, 6, 2, -8, -9, 2, 5, 4, -10};

		int sam = new LongestSequence().longestSequence(a);
	}

}
