package challengesCodeSignal;

public class MaxSubArray {

	/*int maxSubarray(int[] a) {
		int m = a[0], m2 = a[0];
		for(int i=0;i<a.length;i++) {
			m = (m<a[i])?a[i]:m;
		}
		for(int j=0;j<a.length;j++) {
			m2 = (m2<a[j] && a[j]!=m)?a[j]:m2;
		}
		System.out.println("The second max is "+m2);
		return (m>0 && m2>0)?m+m2:0;
	}*/
	
	int maxSubArraySum(int a[]) 
    { 
        int mf = Integer.MIN_VALUE, me = 0; 
  
        for (int i = 0; i < a.length; i++) 
        { 
            me = me + a[i]; 
            if (mf < me) 
            	mf = me; 
            if (me < 0) 
            	me = 0; 
        } 
        return (mf>0)?mf:0; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = {-1, 7, -2, 3, 4, 0, 1, -1};
		//int[] inputArray = {-1, -2, -5, 0};
		//int[] inputArray = {-1, -2, -5, -1};
		//int[] inputArray = {1, -1, 2, 3, -1};
		int maxSumOfArray = new MaxSubArray().maxSubArraySum(inputArray);
		System.out.println("The sum of max nos is "+maxSumOfArray);
	}

}
