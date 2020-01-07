package challengesCodeSignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayConversion {
	int c;
	int arrayConversion(int[] iA) {
		List<Integer> s = new ArrayList();
		List<Integer> d = new ArrayList();
		
		for(int de=0;de<iA.length;de++) {
			s.add(iA[de]);
		}
		System.out.println("Source array list is "+s.toString());
		while(s.size()>1){
			c++;
			for(int i=0;i<s.size();i=i+2) {
				if(c%2!=0) {
					d.add(s.get(i)+s.get(i+1));
				}
				else {
					d.add(s.get(i)*s.get(i+1));
				}
			}
			System.out.println("dest array list is "+d.toString());
			s=new ArrayList<Integer>(d);
			d.clear();
		}
			
		return s.get(0);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b = {1, 2, 3, 4, 5, 6, 7, 8};
		List<Integer> a = new ArrayList(Arrays.asList(b));
		int fi = new ArrayConversion().arrayConversion(b);
		System.out.println(fi);
	}

}
