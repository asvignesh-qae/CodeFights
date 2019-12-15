package challengesCodeSignal;

import java.util.ArrayList;

public class SmallestMultiple {
	int c,sM;
	int smallestMultiple(int l, int r) {
		ArrayList<Integer> z = new ArrayList<Integer>();
		while(l<=r) {
			z.add(l);
			l++;
		} 
		for(int i=r;;i++) {
			for(int j = 0;j<z.size();j++) {
				if(i%z.get(j).intValue()==0) {
					c =0; 
				}
				else {
					c+=1;
					break;
				}
			}
			if(c == 0) {
				sM = i;
				break;
			}
		}
	    return sM;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int smaMul = new SmallestMultiple().smallestMultiple(1, 1);
		int smaMul = new SmallestMultiple().smallestMultiple(2, 4);
		System.out.println("The sma mul is "+smaMul);
	}

}
