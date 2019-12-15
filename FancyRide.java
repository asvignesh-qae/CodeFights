package codeSignalPacka;

public class FancyRide {

	String fancyRide(int l, double[] fares) {
		 String[] op = new String[]{"UberX","UberXL","UberPlus","UberBlack","UberSUV"};
		    int srt = 0;
		    double[] totFare = new double[fares.length];
		    for(int i=0;i<fares.length;i++){
		        totFare[i] = fares[i]*l;
		    }
		    for(int k = 0;k<fares.length;k++) {
		    	for(int m = k+1;m<fares.length;m++) {
		    		if(totFare[k]<=20 && totFare[m]<=20) {
		    			
		    		}
		    	}
		    }
		    /*while(srt < fares.length){
		        if(totFare[srt]<=totFare[srt+1] && totFare[srt+1]<=20){
		            srt = srt+1;
		            break;
		        }
		        srt++;
		    }*/
		    
		    return op[srt];
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l = 15;
		double[] fares = {1, 2, 3, 4, 5};
		String carType = new FancyRide().fancyRide(l, fares);
		System.out.println(carType);
	}

}
