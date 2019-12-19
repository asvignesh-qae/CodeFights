package challengesCodeSignal;

public class MySubString {
	String s="";
	String mySubstring(String i, int l, int r) {
	    char[] u = i.toCharArray();
	    /*while(l<=r){
	    	s+=Character.toString(u[l]);
	    	l++;
	    }*/
	    System.out.println("The substring is "+i.substring(l, r+1));
	    System.out.println("The subsequence is "+i.subSequence(1, 4));
	    
	    return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String subString = new MySubString().mySubstring("abcde", 2, 3); 
		System.out.println(subString);
	}

}
