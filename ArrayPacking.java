package codeSignalPacka;

import java.util.Arrays;

public class ArrayPacking {
	String concatString = "";
	int arrayPacking(int[] a) {
		//Arrays.sort(a);
		for(int j=a.length-1;j>=0;j--) {
			String decToBin = Integer.toBinaryString(a[j]);
			System.out.println(decToBin);
			for(int i=decToBin.length();i<8;i++) {
				decToBin="0"+decToBin;
			}
			concatString = concatString+decToBin;
			System.out.println("The 8 bit is "+decToBin);
			System.out.println("Concat string is "+concatString);
			System.out.println("length of concat string is "+concatString.length());
		}
		return Integer.parseInt(concatString, 2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] ar1 = {0,85,24};
		//int[] ar1 = {39, 45, 23};
		int[] ar1 = {1,2,4,8};
		int arrPacking = new ArrayPacking().arrayPacking(ar1);
		System.out.println("Array packing is "+arrPacking);
	}

}
