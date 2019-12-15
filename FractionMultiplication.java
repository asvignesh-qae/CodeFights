package codeSignalPacka;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FractionMultiplication {

	/*int[] fractionMultiplication(int[] a, int[] b) {
		 return ((a[0]/a[1])*(b[0]/b[1]));
		}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,3};
		int[] b = {3,5};
		int[] c = new int[a.length];
		Integer[] int_a = new Integer[a.length];
		for(int i=0;i<a.length;i++) {
			int_a[i]=a[i];
		}
		Integer[] int_b = new Integer[b.length];
		for(int j=0;j<b.length;j++) {
			int_b[j]=b[j];
		}
		Set<Integer> set_a = new HashSet(Arrays.asList(int_a));
		Set<Integer> set_b = new HashSet(Arrays.asList(int_b));
		for(Integer a1:set_a) {
			System.out.println(a1);
		}
		for(Integer b1:set_b) {
			System.out.println(b1);
		}
		for(int itr =0;itr<a.length;itr++) {
			if(!set_b.contains(a[itr])) {
				System.out.println("Does not contain "+a[itr]);
				c[itr] = a[itr];
		}
			if(!set_a.contains(b[itr])) {
				c[itr] = b[itr];
			}
	}
		System.out.println(c[0]);
		System.out.println(c[1]);
}
}
