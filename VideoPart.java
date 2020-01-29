package challengesCodeSignal;

import java.util.Arrays;

public class VideoPart {

	int[] videoPart(String p, String t) {
	    int[] d = new int[2];
	    int tPS = totSec(p);
	    int tTS = totSec(t);
	    int cd = gcd(tPS, tTS);
	    System.out.println("Greatest common divisor is "+cd);
	    d[0] = tPS/cd;
	    d[1] = tTS/cd;
	    return d;
	}
	int totSec(String r) {
		int hh = Integer.parseInt(r.substring(0, 2));
	    int mm = Integer.parseInt(r.substring(3, 5));
	    int ss = Integer.parseInt(r.substring(6, 8));
	    int totSec = (hh*3600)+(mm*60)+ss;
	    return totSec;
	}
	static int gcd(int a, int b) 
	{ 
		if (a==0)
			return b;
	    return gcd(b % a, a); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String p = "02:20:00";
		String p = "00:02:20";
		//String t = "07:00:00";
		String t = "00:10:00";
		int[] n = new VideoPart().videoPart(p, t);
		System.out.println(Arrays.toString(n));
	}

}
