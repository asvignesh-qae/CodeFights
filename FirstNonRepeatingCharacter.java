package challengesCodeSignal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatingCharacter {
	char c;
	char firstNotRepeatingCharacter(String s) {
		int j = s.length();
		HashMap<Character, Integer> m = new HashMap();
	    for(int i=0;i<s.length();i++){
            c = s.charAt(i);
	    	if(m.containsKey(c))
	    		m.put(c, m.get(c)+1);
	    	else
	    		m.put(c, 1);
	    }
	    for(Map.Entry<Character, Integer> me:m.entrySet()){
	    	if(me.getValue()==1){
	    		j = s.indexOf(me.getKey())<j?s.indexOf(me.getKey()):j;
	    	}
	    }
	    return m.containsValue(1)?s.charAt(j):'_';
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String stu = "abacabaabacaba";
		String stu = "eee";
		//String stu = "z";
		char ch = new FirstNonRepeatingCharacter().firstNotRepeatingCharacter(stu);
		System.out.println(ch);
	}

}
