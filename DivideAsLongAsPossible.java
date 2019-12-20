package challengesCodeSignal;

public class DivideAsLongAsPossible {

	int divideAsLongAsPossible(int n, int d) {
	       return n%d<1?divideAsLongAsPossible(n/d, d):n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dALAP = new DivideAsLongAsPossible().divideAsLongAsPossible(36, 3);
		System.out.println("After dividing the number n is "+dALAP);
	}

}
