package challengesCodeSignal;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SequenceDighit {

	int squareDigitsSequence(int a) {
		Set h = new TreeSet();
		while(h.add(a)){
			int s=0;
			while(a>0){
				s+=a%10*(a%10);
				a/=10;
			}
			a=s;
			System.out.println(h.toString());
		}
		return h.size()+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfSeq = new SequenceDighit().squareDigitsSequence(16);
	}

}
