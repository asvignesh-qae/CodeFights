package challengesCodeSignal;

public class MaxDigit {

	int maxDigit(int n) {
		int m = n%10;
	    while(n>0) {
	    	m = m>(n/10)%10?m:(n/10)%10;
	    	n/=10;
	    }
	    return m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxDig = new MaxDigit().maxDigit(119112);
		System.out.println("The max digit is "+maxDig);
	}

}
