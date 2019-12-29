package codeSignalPacka;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseToSort {

	boolean isSorted,dup = true;
	boolean reverseToSort(int[] inAr) {
		int[] arTemp = inAr.clone();
		int[] ar2 = new int[inAr.length];
		Arrays.sort(arTemp);
		System.out.println("array temp after sort is "+Arrays.toString(arTemp));
		Set h = new HashSet();
		for(int el:inAr) {
			if(h.add(el)==false) {
				dup = false;
			}
		}
		for(int i=0;i<inAr.length;i++) {
				int srt = i;
				int end = inAr.length-i;
				if(srt==end) {
					break;
				}
				else {
					int k =end;
					for(int j=srt;j<end;j++) {
						System.out.println("k is "+k);
						System.out.println("j is "+j);
						ar2[k-1]=inAr[j];
						k=k-1;
					}				
					System.out.println("Arrays 2 is "+Arrays.toString(ar2));
					if(Arrays.equals(ar2, arTemp)) {
						isSorted = true;
						break;
					}
					else {
						ar2=inAr.clone();
						System.out.println("Arrays 2 in else part is "+Arrays.toString(ar2));
					}
					if(ar2.length==3) {
						ar2[1]=inAr[2];
						ar2[2]=inAr[1];
						if(Arrays.equals(ar2, arTemp)) {
							isSorted = true;
							break;
						}
						else {
							ar2[0]=inAr[1];
							ar2[1]=inAr[0];
							if(Arrays.equals(ar2, arTemp)) {
								isSorted = true;
								break;
							}
						}
					}
				}
		}		
		return isSorted&&dup;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] inputArray = {-1, 5, 4, 3, 2, 8};
		//int[] inputArray = {1, 3, 2, 5, 4, 6};
		//int[] inputArray = {-46, 26, -9, 63};
		//int[] inputArray = {2, 3, 2, 4};
		//int[] inputArray = {19, 32, 23};
		//int[] inputArray = {19, 32, 23};
		int[] inputArray = {19, 21};
		boolean isSortedwhenReversed = new ReverseToSort().reverseToSort(inputArray);
		System.out.println(isSortedwhenReversed);
	}

}
