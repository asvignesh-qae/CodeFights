package codeSignalPacka;

public class ReverseInParentheses {

	String reverseInParentheses(String inputString) {
		System.out.println(inputString);
	    String[] ar_iS = inputString.split("(");
	    String[] fina = ar_iS[1].split(")");
	    
	    return ".".concat(new StringBuilder(fina[0]).reverse().toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String revinParen = new ReverseInParentheses().reverseInParentheses("(rab)");
	}

}
