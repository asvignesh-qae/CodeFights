package codeSignalPacka;

import java.util.Arrays;

public class MaxNMinNoOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double[] f = {22.3,4.33,56.11,22.34,5,7.66};
		double[] f = {30*0.3,30*0.5,30*0.7,30*1,30*1.3};
		double max = f[0];
		double min = f[0];
		int max_Index = 0;
		int min_Index = 0;
		for(int i=1;i<f.length;i++) {
			if(f[i]<=20) {
				max = (max<f[i])?f[i]:max;
				//min = (min>f[i])?f[i]:min;
				System.out.println("The index is "+i);
			}
			}
		for(int j=1;j<f.length;j++) {
			max_Index = (max<f[j])?j:j-1;
			min_Index = (min>f[j])?j:j-1;
		}
		System.out.println("The maximum number in a given array is "+max);
		System.out.println("The minimum number in a given array is "+min);
		System.out.println("The index of maximum number in a given array is "+max_Index);
		System.out.println("The index of minimum number in a given array is "+min_Index);
	}

}
