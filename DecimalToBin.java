package codeSignalPacka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecimalToBin {

	/*int dToB(int n) {
		if(n==1) {
			return 0;
		}
		return ((n%10)*10+dToB(n/2));
	}*/
	int dToB(int n) {
		//int no = 1, rem = 0, mul =1;
		int i;
		List<Integer> b = new ArrayList<Integer>();
		while(n>=1) {
			i =0;
			b.add(i++, n%2);
			/*no = (rem==0)?rem+(mul*10):rem;
			//mul = mul *10;
			System.out.println("final no is "+no);*/
			n/=2;
		}
		String s1=b.toString();
		s1.replace('0', '1');
		System.out.println(s1);
		System.out.println("The string value of binary no is "+s1);
		for(int j=0;j<b.size();j++) {
			System.out.println("The elements are "+b.get(j).intValue());
		}
		//return Arrays.asList(b);
		return 5;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dec = new DecimalToBin().dToB(16);
		System.out.println(dec);
	}

}
