package challengesCodeSignal;

import java.util.HashSet;
import java.util.Set;

public class UniqueDigitProducts {
	
	
	int productOfDigits(int a[]) {
		Set<Integer> ha_i = new HashSet<Integer>();
		//for(int i=0;i<a.length;i++) { 
		for(int k:a) {
			int prdt = 1;
			while(k>0) {
				prdt*=k%10;
				k/=10;
			}
			System.out.println("The prodt is "+prdt);
			ha_i.add(prdt);
		}
		System.out.println(ha_i.toString());
		return ha_i.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr4 = {2, 8, 121, 42, 222, 23};
		int[] arr4 = {100, 101, 111};
		int prdtOfDigits = new UniqueDigitProducts().productOfDigits(arr4);
		//System.out.println("The product of digits is "+prdtOfDigits);
		System.out.println("The product of products in arrays size is "+prdtOfDigits);
	}

}
