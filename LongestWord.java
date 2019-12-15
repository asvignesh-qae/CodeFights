package challengesCodeSignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class LongestWord {

	String longestWord(String t) {
		//t = t.replaceAll("[^A-Z a-z 0-9]", "");
		//t = t.replaceAll("[-+.^:,!@#$%^&*()]", "");"_|\\W"
		for(String sp:t.split("_|\\W")) {
			//for(String sp:t.split("[^A-Za-z]")) {
			System.out.println("The words are "+sp);
		}
		HashSet<String> hs_ar = new HashSet<String>(Arrays.asList(t.split("[^A-Za-z]")));
		String[] n = hs_ar.toArray(new String[hs_ar.size()]);
		String m = n[0];
		for(int i = 1;i<hs_ar.size();i++) {
			m = (m.length()<n[i].length())?n[i]:m;
		}
		return m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String f = "Ready[[[, steady, go!, steady";
		//String f = "To be or not to be";
		String f = "You are the best!!!!!!!!!!!! CodeFighter ever!";
		String remove = new LongestWord().longestWord(f);
		System.out.println("The longest words is "+remove);
	}

}
