package codeSignalPacka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MakeArrayConsecutive1 {

	List makeArrayConsecutive(int[] s) { 
		Arrays.sort(s);
		int min = s[0];
		int max = s[s.length-1];
		System.out.println("min is "+min);
		System.out.println("max is "+max);
		List al = new ArrayList();
		for(int j=0;j<s.length;j++) {
			al.add(s[j]);
		}
		System.out.println(al);
		List al2 = new ArrayList();
		for(int i=min;i<=max;i++) {
			if(!al.contains(i)) {
				al2.add(i);
			}
		}
		System.out.println(al2.toString());
		return al2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a1 = {6, 2, 3, 8};
		int[] a1 = {-1,-3};
		List missingNos = new MakeArrayConsecutive1().makeArrayConsecutive(a1);
		System.out.println(missingNos);
	}

}
