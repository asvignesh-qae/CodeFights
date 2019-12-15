package challengesCodeSignal;

public class MaxPower {
	boolean isP = false;
	boolean isPower(int n) {
		for(double i=2, k=1;i<21;i++) {
			k=2;
			double isMaxPow = Math.pow(i, k);
			System.out.println(isMaxPow);
			if((int)isMaxPow==n) {
				isP = true;
			}
			else if((int)isMaxPow<n) {
				k++;
			}
			else {
				break;
			}
			double sq = Math.sqrt((double)n);

		}
		return isP;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean mp = new MaxPower().isPower(125);
	}

}
