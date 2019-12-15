package codeSignalPacka;

public class RecursionOFAddition {

	int addno(int n) {
		if(n==1) {
			return 1;
		}
		else if(n==0) {
			return 0;
		}
		else 
			return ((n%10)+addno(n/10));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumOfNos = new RecursionOFAddition().addno(2005);
		System.out.println(sumOfNos);
	}

}
