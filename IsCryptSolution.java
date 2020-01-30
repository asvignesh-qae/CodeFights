package challengesCodeSignal;

public class IsCryptSolution {
	long o,t,e;
	boolean isCryptSolution(String[] c, char[][] s) {
		String co = c[0]+" "+c[1]+" "+c[2];
		for(int i=0;i<s.length;i++) {
			co = co.replace(s[i][0], s[i][1]);
		}
		String[] in = co.split(" ");
        if((in[0].matches("0[0-9]+"))||(in[1].matches("0[0-9]+"))||(in[2].matches("0[0-9]+"))) return false;
        //if(co.matches("0[0-9].*$")) return false;
        o=Long.parseLong(in[0]);
        t=Long.parseLong(in[1]);
        e=Long.parseLong(in[2]);
		return o+t==e;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] crypt = {"SEND","MORE","MONEY"};
		String[] crypt = {"TEN","TWO","ONE"};
		//char[][] solution = {{'O','0'}, {'M','1'},{'Y','2'},{'E','5'},{'N','6'},{'D','7'},{'R','8'},{'S','9'}};
		char[][] solution = {{'O','1'}, {'T','0'},{'W','9'},{'E','5'},{'N','4'}};
		boolean isCrypt = new IsCryptSolution().isCryptSolution(crypt, solution);
		System.out.println(isCrypt);
	}

}
