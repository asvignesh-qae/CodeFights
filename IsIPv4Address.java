package codeSignalPacka;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsIPv4Address {
	boolean isIPv4Address(String s) {
		
	    return s.matches("([0-9][.]|[1-9][0-9][.]|1[0-9][0-9][.]|2[0-4][0-9][.]|25[0-5][.]){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String addr = "255.";
		String addr = "172.16.254.1";
		//String addr = ".254.255.0";
		//String addr = "172.316.254.";
		//String addr = "172.16.254.";
		boolean isIPv4 = new IsIPv4Address().isIPv4Address(addr);
		System.out.println(isIPv4);
	}

}
