package codeSignalPacka;

import java.util.ArrayList;

public class ThreeAndFour {

	int[] threeAndFour(int n) {
		
		ArrayList<Integer> arli= new ArrayList<Integer>();
		
		int i=0;
		while(i<=n){
		    if((i%3==0)&&(i%4==0)) {
		    	arli.add(i);
		    }
		}
		int f[] = new int[arli.size()];
		for(int j=0;j<arli.size();j++) {
			f[j] = arli.get(j).intValue();
		}
		return f;
		/*int si = arrThreeNFour.size();
		int[] nr = (int[])arrThreeNFour.toArray(int[si]);
		return nr;*/
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] thrNFour = new ThreeAndFour().threeAndFour(3);
		System.out.println("the op is "+(10/10));
	}

}
