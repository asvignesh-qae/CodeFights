package challengesCodeSignal;

import java.util.ArrayList;
import java.util.List;

public class NosGrouping {
	int c;
	int numbersGrouping(int[] a) {
	    List<Integer> nG = new ArrayList();
	    for(int i=0;i<100000;i++) {
	    	nG.add(0);
	    }
	    for(int i=0;i<a.length;i++) {
	        Integer index = (a[i]-1)/10000;
	        if(nG.get(index)==0)
	        	nG.set(index, nG.get(index)+2);
	        else
	        	nG.set(index, nG.get(index)+1);
	    }
	    for(int j=0;j<100000;j++) {
	        c+=nG.get(j);
	    }
	     
	    return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] ay = {20000, 239, 10001, 999999, 10000, 20566, 29999};
		int[] ay = {102382103, 21039898, 39823, 433, 30928398, 40283209, 23234, 342534, 98473483, 498398424, 9384984, 9839239};
		int to = new NosGrouping().numbersGrouping(ay);
		System.out.println("tot is "+to);
	}

}
