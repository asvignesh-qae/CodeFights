package codeSignalPacka;

public class FirstDuplicateNArr {

	public int findDuplicate(int[] ar) {
		int dup = ar[0];
		System.out.println("The length is "+ar.length);
		for(int i=0;i<ar.length;i++) {
			System.out.println("i is "+i+" and its value is "+ar[i]);
			for(int j=i+1;i<ar.length-1;j++) {
				
				System.out.println("j is "+j+" and its value is "+ar[j]);
				System.out.println("----------");
				if(ar[i]==ar[j]) {
					dup=ar[i];
					break;
				}
				else
					dup=-1;
			}
		}
		return dup;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstDuplicateNArr ob = new FirstDuplicateNArr();
		int[] arr1 = {2, 1, 3, 5, 3, 2};
		int dupli = ob.findDuplicate(arr1);
		System.out.println("The Duplicate is "+dupli);
	}

}
