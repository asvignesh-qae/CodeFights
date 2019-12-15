package codeSignalPacka;

public class AllLongestStrings {
	String[] aLS;
	int j;
	String[] allLongestStrings(String[] inputArray) {
		String max = inputArray[0];
	    for(int i=1;i<inputArray.length;i++){
	    	max = (max.length()<inputArray[i].length())?inputArray[i]:max;
	    }
	    for(int k=0;k<inputArray.length;k++) {
	    	if(inputArray[k].length()==max.length()) {
	    		aLS[j++] = inputArray[k];
	    	}
	    }
	    return aLS;
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
