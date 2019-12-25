package interviewPracticesArrays;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateNArr {
	/*int index =-1, fDup;
	public int findDuplicate(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					index = i;
					fDup = j-i;
					System.out.println("duplicate length is "+fDup);
					index = fDup<=j-i?i:-1;
					System.out.println("The index is "+index);
					System.out.println("The first duplicate element is "+ar[i]);
					if(fDup==1) {
						break;
					}
				}
			}
			if(fDup==1) {
				break;
			}
		}
		return index<0?-1:ar[index];*/
int index=-1;
public int findDuplicate(int[] ar) {
	Set h = new HashSet();
	for(int i=0;i<ar.length;i++) {
		if(h.contains(ar[i])) {
			index = i;
			break;
		}
		else {
			h.add(ar[i]);
		}
	}
	return index<0?-1:ar[index];
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstDuplicateNArr ob = new FirstDuplicateNArr();
		int[] arr1 = {8, 4, 6, 2, 6, 4, 7, 9, 5, 8};
		//int[] arr1 = {1, 1, 2, 2, 1};
		//int[] arr1 = {2, 1, 3, 5, 3, 2};
		//int[] arr1 = {2, 2};
		//int[] arr1 = {2, 4, 3, 5, 1};
		//int[] arr1 = {1};
		int dupli = ob.findDuplicate(arr1);
		System.out.println("The first nearest Duplicate is "+dupli);
	}

}
