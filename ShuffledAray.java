package challengesCodeSignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShuffledAray {
	int c;
	Integer r;
	List shuffledArray(Integer[] shuffled) {
		List<Integer> li_sh = new ArrayList(Arrays.asList(shuffled));
		System.out.println(li_sh.toString());
		for(int i=0;i<li_sh.size();i++) {
			c=c+li_sh.get(i);
		}
		r=c/2;
		System.out.println("count is "+c);
		System.out.println("r is "+r);
		//li_sh.remove(r);
		li_sh.remove((Integer)(c/2));
		li_sh.sort(null);
		return li_sh;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer[] arr11 = {1, 12, 3, 6, 2};
		Integer[] arr11 = {1, -3, -5, 7, 2};
		List sa = new ShuffledAray().shuffledArray(arr11);
		System.out.println(sa.toString());
		
	}

}
