package challengesCodeSignal;

import java.util.regex.Pattern;

public class PasswordCheck {
	boolean validPasswordCheck(String s) {
		Pattern p = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$");
		return (p.matcher(s).matches() && s.length()>5);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sr = "my.Password123";
		/*Pattern pt = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$");
		pt.matcher(sr).matches();*/
		boolean vPC = new PasswordCheck().validPasswordCheck(sr);
		System.out.println(vPC);
	}

}
