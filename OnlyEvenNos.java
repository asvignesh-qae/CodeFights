package challengesCodeSignal;

import java.util.ArrayList;
import java.util.Arrays;

public class OnlyEvenNos {
	
	int[] onlyEvenNumbers(int left, int right) {
		ArrayList<Integer> a = new ArrayList();
		for(;left<=right;left++) {
			if(left%2==0) {
				a.add(left);
			}
		}
		System.out.println("The arraylist is "+a.toString());
		int[] arr = new int[a.size()];
		for(int i=0;i<arr.length;i++) {
			arr[i] = a.get(i).intValue();
		}
		
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] onlyEvenNos1 = new OnlyEvenNos().onlyEvenNumbers(5, 10);
		System.out.println(Arrays.toString(onlyEvenNos1));
	}

}
