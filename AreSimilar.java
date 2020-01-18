package codeSignalPacka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AreSimilar {
	boolean isSimi;
	boolean areSimilar(List a1, List b1) {
		/*if(Arrays.equals(a, b)) {
			isSimi=true;
		}
		else {
			List<Integer> la = Arrays.asList(a);
			List<Integer> lb;
			System.out.println("Array list is "+la.toString());
			for(int i=0;i<b.length;i++) {
				for(int j=i+1;j<b.length;j++) {
					lb = new ArrayList<Integer>(Arrays.asList(b));
					System.out.println("Array list lb is "+lb.toString());
					Collections.swap(lb, i, j);
					System.out.println("Swapped Array list is "+lb.toString());
					if(la.equals(lb)) {
						isSimi=true;
						break;
					}	
				}
			}
		}*/
		/*if(a1.equals(b1)) {
			isSimi = true;
		}
		else {
			//List newlist;
			for(int i=0;i<b1.size();i++) {
				for(int j=i+1;j<b1.size();j++) {
					List newlist = new ArrayList(b1);
					System.out.println("New Array list lb is "+newlist.toString());
					System.out.println("i is "+i);
					System.out.println("j is "+j);
					Collections.swap(newlist, i, j);
					System.out.println("Swapped Array list is "+newlist.toString());
					System.out.println("-----------------");
					if(newlist.equals(a1)) {
						isSimi=true;
						break;
					}	
				}
			}
		}*/
		if(a1.equals(b1)) {
			isSimi = true;
		}
		else {
			List<Integer> indexes = new ArrayList<Integer>();
			for(int i=0;i<a1.size();i++) {
				if(!a1.get(i).equals(b1.get(i))) {
					System.out.println("index are "+i);
					indexes.add(i);
				}
			}
			System.out.println("index are "+indexes.toString());
			System.out.println(a1.get(indexes.get(0)));
			System.out.println(b1.get(indexes.get(1)));
			if(indexes.size()==2 && a1.get(indexes.get(0)).equals(b1.get(indexes.get(1))) && a1.get(indexes.get(1)).equals(b1.get(indexes.get(0)))) {
				isSimi = true;
			}
		}
		
	    return isSimi;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Integer[] a = {4, 6, 3};
		Integer[] b = {3, 4, 6};*/
		/*Integer[] a = {1, 2, 3};
		Integer[] b = {1, 2, 3};*/
		/*Integer[] a = {832, 998, 148, 570, 533, 561, 894, 147, 455, 279};
		Integer[] b = {832, 998, 148, 570, 533, 561, 455, 147, 894, 279};*/
		/*Integer[] a = {1, 2, 3};
		Integer[] b = {2, 1, 3};*/
		Integer[] a = {1, 2, 3};
		Integer[] b = {1, 2, 3};
		List al = new ArrayList<>(Arrays.asList(a));
		List bl = new ArrayList<>(Arrays.asList(b));
		boolean areSimi = new AreSimilar().areSimilar(al, bl);
		System.out.println(areSimi);
	}

}
