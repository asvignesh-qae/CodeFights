package codeSignalPacka;

public class FindDuplicates {

	boolean containsDuplicates(int[] a) {
	    boolean dupPresent = false;
	    
	    itr1:
	for(int i=0;i<a.length;i++){
	    for(int j=i+1;j<a.length;j++){
	    	if(a[i]==a[j]) {
	    		dupPresent = true;
	    		break itr1;
	    	}
	    }
	}
	return dupPresent;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arrayOfInts = {1, 2, 3, 4};
		int[] arrayOfInts = {1, 2, 3, 1};
		boolean isDupPresent = new FindDuplicates().containsDuplicates(arrayOfInts);
		System.out.println(isDupPresent);
	}

}
