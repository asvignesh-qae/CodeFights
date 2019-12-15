package codeSignalPacka;

public class PhoneCall {
	
	int phoneCall(int min1, int min2_10, int min11, int s) {
		/*int totMinsafter10 = 0;
		int totMins;*/
		   /* for(int i=1;i<=s;i++){
		    	totMinsafter10 = min1+(9*min2_10)+(i*min11);
		        if(totMinsafter10>=s) {
		        	totMinsafter10 = i;
		        	break;
		        } 
		    }*/
		if(min1>=s) {
			return s/min1;
		}
		else
			//return ((min1+(min2_10*9))<s)? min1+(9*min2_10)+(s-(min1+(9*min2_10)))/min11: min1+((s-min1)/min2_10);
			return ((min1+(min2_10*9))<s)? 1+9+(s-(min1+(9*min2_10)))/min11: 1+((s-min1)/min2_10);
		//totMinsafter10 = (s-(min1+(9*min2_10)))/min11;
		//return min1+();
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int totMins =new PhoneCall().phoneCall(2, 2, 1, 2);
		//int totMins =new PhoneCall().phoneCall(3, 1, 2, 20);
		//int totMins =new PhoneCall().phoneCall(10, 1, 2, 22);
		int totMins =new PhoneCall().phoneCall(2, 2, 1, 24);
		System.out.println(totMins);
	}

}
