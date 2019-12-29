package codeSignalPacka;

public class ReverseStringWithInParenthesis {
	int srtPara,endPara;
	String revInParen(String st) {
		if(st.isEmpty()||!st.contains("(")) {
			return st;
		}
		else {
			for(int i=0;i<st.length();i++) {
				if(st.charAt(i)=='(') {
					srtPara = i;
				}
				else if(st.charAt(i)==')') {
					endPara = i;
					break;
				}
			}
			System.out.println("srtParameter is "+srtPara);
			System.out.println("endParameter is "+endPara);
			String in = st.substring(srtPara+1, endPara);
			System.out.println("The substring is "+in);
			String rev = new StringBuilder(in).reverse().toString();
			System.out.println("The reversed substring is "+rev);
			String rep = st.replace(st.substring(srtPara, endPara+1), rev);
			System.out.println("The new string is "+rep);
			return rep.contains("(")?revInParen(rep):rep;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String ne = "(bar)";
		//String ne = "foo(bar(baz))blim";
		//String ne = "foo(bar)baz";
		//String ne = "foo(bar)baz(blim)";
		//String ne = "()";
		//String ne = "";
		String ne = "(+$sdf^asd(fft)asd)";
		String revInPar = new  ReverseStringWithInParenthesis().revInParen(ne);
		System.out.println(revInPar);
		
	}

}
