package codeSignalPacka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SortByHeight {
	
	int[] sortByHeight(int[] a) {
	    /*Arrays.sort(a);
	    ArrayList<Integer> int_a = new ArrayList<Integer>();*/
	    /*for(int i=0;i<a.length;i++) {
	    	int_a.add(a[i]);
	    }
	    for(int in:int_a) {
	    	if(in!=-1) {
	    		System.out.println(in);
	    	}
	    	
	    }
	    Iterator it = int_a.iterator();
	    while(it.hasNext()) {
	    	if(!it.next().equals(-1)) {
	    		System.out.println("it is "+it.next());
	    	}
	    }*/
		//int[] a = {23, 54, -1, 43, 1, -1, -1, 77, -1, -1, -1, 3};
	    for(int i=0;i<a.length;i++) {
	    	if(a[i]==-1) {
    			i+=1;
    		}
	    	for(int j=i+1;j<a.length;j++) {
	    		if(a[j]==-1) {
	    			j+=1;
	    		}
	    		if(j<a.length) {
	    				if(a[i]>a[j] && a[j] != -1) {
	    					int temp = a[i];
			    			a[i]=a[j];
			    			a[j] = temp;
	    				}
		    		}
	    	}
	    }
	    for(int k=0;k<a.length;k++) {
	    	System.out.println("K is "+a[k]);
	    }
	    //System.out.println(Arrays.asList(a).toString());
	    return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {23, 54, -1, 43, 1, -1, -1, 77, -1, -1, -1, 3};
		//int[] a = {-1, -1, -1, -1, -1};
		int[] aty = new SortByHeight().sortByHeight(a);
	}

}
