package challengesCodeSignal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateStrings {

	Object[] removeDuplicateStrings(String[] inputArray) {
	    Set<String> h = new TreeSet<String>(Arrays.asList(inputArray)); 
	   /* for(int i=0;i<inputArray.length;i++){
	        h.add(inputArray[i]);
	        System.out.println(h.);
	    }*/
	    System.out.println("The set is "+h.toString());
	    String[] re = h.toArray(new String[h.size()]);
	    for(int i=0;i<re.length;i++){
	    	for(int j=i+1;j<re.length;j++){
		    	//if((re[i].compareTo(re[j]))<0){
	    		if(re[i].length()>re[j].length()){
		    		String temp = re[i];
		    		re[i] = re[j];
		    		re[j] = temp;
		    	}
		    }
	    }
	   /* for(int i=0;i<re.length;i++){
	    	re[i+1].contains(re[i])
	    }*/
	    
	    //System.out.println(re[0]);
	    //Arrays.sort(re);
	    return re;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] ip = {"123", "12345", "12324345"};
		String[] ip = {"a", "a", "ab", "ab", "abc"};
		Object[] removedString = new RemoveDuplicateStrings().removeDuplicateStrings(ip);
		System.out.println(Arrays.toString(removedString));
	}

}
