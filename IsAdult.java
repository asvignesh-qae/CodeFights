package challengesCodeSignal;

public class IsAdult {

	boolean isAdult(int age, int adulthood) {
	    return age>=adulthood;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isAdult = new IsAdult().isAdult(18, 21);
		System.out.println("Is Adult? "+isAdult);
	}

}
