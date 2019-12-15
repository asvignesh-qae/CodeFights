package challengesCodeSignal;

public class CheckIncreasingSeq {
	
	boolean b = true;
	boolean checkIncreasingSequence(int[] s) {
		for(int j=0;j+1<s.length;j++) {
			if(s[j]>=s[j+1]) {
				b = false;
				break;
			}
		}
		return b;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = {1, 3, 8,4};
		boolean increasing = new CheckIncreasingSeq().checkIncreasingSequence(s);
		System.out.println(increasing);
	}

}
