package codeSignalPacka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MetroCard {
	
	int[] metcrd(int n) {
		return (n%10==0)?new int[]{31}:new int[]{28,30,31};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 30;
		
		List<Integer> d = new ArrayList<Integer>();
		if(n%10==0) {
			d.add(31);
		}
		else if(n%10==1){
			d.add(28);
			d.add(30);
			d.add(31);
		}
		else
			d.add(31);
		
		int days[] = new int[d.size()];
		for(int i=0;i<d.size();i++) {
			days[i] = d.get(i).intValue();
		}
		Arrays.sort(days);
		
		//int[] da = (n%10==0)? new int {31}: new int {28,30,31};
	}

}
