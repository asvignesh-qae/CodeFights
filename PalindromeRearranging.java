package codeSignalPacka;

import java.util.HashMap;
import java.util.Map;

public class PalindromeRearranging {
	boolean pal = true;
	int countOf1;
	boolean palindromeRearranging(String s) {
		Map<Character,Integer> chs = new HashMap<Character,Integer>();
		char[] carr_s = s.toCharArray();
		for(char c:carr_s) {
			if(chs.containsKey(c)) {
				chs.put(c, chs.get(c)+1);
			}else
				chs.put(c, 1);
		}
		System.out.println(chs.toString());
		System.out.println("The length of string is "+s.length());
		if(s.length()%2==0) {
			for(Map.Entry<Character, Integer> mapItr:chs.entrySet()) {
				System.out.println("Map values are "+mapItr.getValue());
				if(mapItr.getValue()%2==1) {
					pal = false;
					System.out.println("pal is "+pal);
					break;
				}
			}
		}else {
			for(Map.Entry<Character, Integer> mapItr:chs.entrySet()) {
				System.out.println("Map values are "+mapItr.getValue());
				if(mapItr.getValue()==1) {
					countOf1+=1;
				}
			}
			System.out.println("The count of 1 is "+countOf1);
			for(Map.Entry<Character, Integer> mapItr2:chs.entrySet()) {
				System.out.println("Map values are "+mapItr2.getValue());
				if(countOf1>1 && mapItr2.getValue()%2!=0) {
					pal = false;
					System.out.println("pal is "+pal);
					break;
				}
			}
		}
		return pal;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String sg = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc";
		//String sg = "abcad";
		String sg = "zaa";
		boolean isPalin = new PalindromeRearranging().palindromeRearranging(sg);
		System.out.println(isPalin);
	}

}
