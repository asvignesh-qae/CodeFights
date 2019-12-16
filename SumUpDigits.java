package challengesCodeSignal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumUpDigits {
	int c,d;
	int sumUpDigits(String inputString) {
		/*String s = inputString.replaceAll("[^0-9]", "");
		int d = Integer.parseInt(s);
		while(d>0){
			c+=d%10;
			d/=10;
		}*/
		char[] g = inputString.toCharArray();
		for(char f:g){
			if(Character.isDigit(f)){
				c+=Character.getNumericValue(f);
			}
		}
		/*for(int i=0;i<inputString.length();i++){
			if(Character.isDigit(inputString.charAt(i))){
				c+=Character.getNumericValue(inputString.charAt(i));
			}
		}*/
		
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumOfDigits = new SumUpDigits().sumUpDigits("2 apples, 12 oranges");
		System.out.println("The sum of Digits "+sumOfDigits);
	}

}
