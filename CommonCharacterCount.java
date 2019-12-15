package codeSignalPacka;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CommonCharacterCount {
int count;
	int commonCharacterCount(String s1, String s2) {
		 char[] charArr_s1 = s1.toCharArray();
		
		 ArrayList<Character> s2_ArrChar = new ArrayList<Character>();
		 for(char ch:s2.toCharArray()) {
			 s2_ArrChar.add(ch);
		 }
		 		 
		 for(int i=0;i<charArr_s1.length;i++) {
				 
				 Iterator it = s2_ArrChar.iterator();
				 while(it.hasNext()) {
					 char remChar = charArr_s1[i];
					 if(it.next().equals(remChar)) {
						 count+=1;
						 it.remove();
						 break;
					 }
				 }
				 System.out.println("After removing the similar elements "+s2_ArrChar.toString());
		 }
		 
		 return count;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int commonChar = new CommonCharacterCount().commonCharacterCount("aabcc", "adcaa");
		System.out.println(commonChar);
	}

}
