package challengesCodeSignal;

public class HalvingSum {

	int halvingSum(int n) {
		return n==1?1:n+halvingSum(n/2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = new HalvingSum().halvingSum(25);
		System.out.println("sum is "+sum);
	}

}
