package codeSignalPack;

public class NearestPalindrome {

	public int findNearestPalindrome(int no){
		int leastPlainNo = findLeastPalindrome(no);
		int farthestPlainNo =findFarthestPalindrome(no);
		System.out.println("The nearest palindrome to "+no+" is "+leastPlainNo);
		System.out.println("The Farthest palindrome to "+no+" is "+farthestPlainNo);
		if((no-leastPlainNo)<(farthestPlainNo-no)){
			return leastPlainNo;
		}
		else
		return farthestPlainNo;
	}
	
	public static int findpalindrome(int arr)
	 {
	     int rem=0,count=0;
	    while(arr>0)
	    {
	        rem=arr%10;
	        count=(count*10)+rem;
	        arr=arr/10;
	    }
	     return count;
	 }
	
	public int findLeastPalindrome(int num){
		int lpalin = 0;
		for(int i = num;i>0;i--){
			lpalin = findpalindrome(i);
			if(i == lpalin){
				break;
			}
		}
		return lpalin;
	}
	
	public int findFarthestPalindrome(int num){
		int fpalin = 0;
		for(int j = num+1;j>num;j++){
			fpalin = findpalindrome(j);
			if(j == fpalin){
				break;
			}
		}
		return fpalin;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nearestPalindromeNoIs = new NearestPalindrome().findNearestPalindrome(20);
		System.out.println("The nearest palindrome number is "+nearestPalindromeNoIs);
	}

}
