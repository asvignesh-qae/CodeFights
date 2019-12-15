package codeSignalPacka;

public class GivenStringPalindrome {

	//Classical Way
	boolean checkPalindrome(String inputString) {
	    StringBuilder sb = new StringBuilder();
	    char[] char_inputString = inputString.toCharArray();
	    for(int i=char_inputString.length-1;i>=0;i--){
	        sb.append(char_inputString[i]);
	    }
	    if(inputString.equalsIgnoreCase(sb.toString())){
	        return true;
	    }
	    else
	    return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "Madam";
		String we = "Hi Welcome to Amazon";
		String[] arr_we = we.split(" ");
		String expected = "";
		//System.out.println(inputString.equalsIgnoreCase(new StringBuilder(inputString).reverse().toString()));
		System.out.println(new StringBuilder(inputString).reverse().toString());
		for(String str:arr_we) {
			expected = expected.concat(new StringBuilder(str).reverse().toString()).concat(" ");
		}
		System.out.println(expected);
	}

}
