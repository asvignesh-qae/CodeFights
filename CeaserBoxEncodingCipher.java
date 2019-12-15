package challengesCodeSignal;

public class CeaserBoxEncodingCipher {

	String caesarBoxCipherEncoding(String s) {
		String nStr = "";
		double rnc = Math.sqrt(s.length());
		char[][] mat = new char[(int)rnc][(int)rnc];
		int k=0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j] = s.charAt(k);
				k++;
			}
		}
		for(int a=0;a<mat.length;a++) {
			for(int b=0;b<mat.length;b++) {
				nStr = nStr.concat(String.valueOf(mat[b][a]));
			}
		}
		return nStr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cip = new CeaserBoxEncodingCipher().caesarBoxCipherEncoding("a message");
		System.out.println("The ceaser encryption message is "+cip);
	}

}
