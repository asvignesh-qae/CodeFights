package codeSignalPacka;

public class ReverseInParenthesis {
int count,count_op;
	String revInParen(String st) {
		/*String t = st.replace("(", ",");
		String t1 = st.replace(")", ".");
		String[] t_arr = t.split(",");
		//st.replace("a", "j");
		System.out.println(t);
		for(String d:t_arr) {
			System.out.println("d is "+d);
		}*/
		/*char[] c_st = st.toCharArray();
		for(char c:c_st) {
			if(c =='(') {
				count+=1;
			}
		}
		System.out.println("count is "+count);
		for(int i=0;i<c_st.length;i++) {
			if(c_st[i]=='(') {
				count_op+=1;
			}
			if(count_op==count && c_st[i]=='(') {
				if(c_st[i]!=')') {
					
				}
				System.out.println("Index of Innermost parenthesis is "+i);
				 c_st[i]= '>';
			}
		}
		
		for(char g:c_st) {
			System.out.println("g is "+g);
		}
		String mod_st = new String(c_st);
		System.out.println(mod_st);*/
		String rev = "";
		String[] sar = st.split("\\(");
		for(String t:sar) {
			System.out.println("The splitted string is "+t);
			if(t.contains(")")) {
				for(int i=0;i<t.length();i++) {
					if(t.charAt(i)!=')') {
						rev = rev.concat(String.valueOf(t.charAt(i)));
					}
					else
						//t.replace(")", "");
						break;
				}
				
				System.out.println("Rev is "+new StringBuilder(rev).reverse().toString());
				/*String[] l = t.split("\\)");
				String n = "".concat(new StringBuilder(l[0]).reverse().toString());
				System.out.println("The string is "+n);
				l[0]=n;
				String f = "";
				for(int i=0;i<l.length;i++) {
					f = f.concat(new StringBuilder(l[i]).toString()).concat("");
				}
				System.out.println("The mod string is "+f);*/
			}
		}
		return st;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String revInPar = new  ReverseInParenthesis().revInParen("foo(bar(baz))blim");
		System.out.println(revInPar);
	}

}
