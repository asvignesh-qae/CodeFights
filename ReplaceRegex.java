package codeSignalPacka;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String regex = "[a-zA-z0-9]*";
		//String regex = "[+-]?[0-9][0-9]*";
		String regex = ".*[^0-9].*";
	    String stringName="There are 12 points";
	    char[] char_StringName = stringName.toCharArray();
	    //pattern compiled   
	    Pattern pattern = Pattern.compile(regex);
	    //pattern.matcher(input)

	    /*StringBuffer s = new StringBuffer();
	    s.append(stringName);*/
	    for(char c:char_StringName) {
	    	String matcher = pattern.quote(stringName);
	    	System.out.println(matcher);
	    }

	    Matcher matcher = pattern.matcher(stringName);
	    //matcher.find();
	    System.out.println(matcher.find());

	    System.out.println(matcher.matches());
	}

}
