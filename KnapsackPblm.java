package codeSignalPacka;

public class KnapsackPblm {

	int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
		/*if(weight1<maxW && weight2<maxW && value2>value1){
		    return value2;
		}    
		else if(weight1>maxW&&weight2>maxW){
		    return 0;
		}
		else
		    return ((weight1+weight2)<=maxW)?value1+value2:value1;*/
		/*int maxValue=0;
		int maxWeight = 0;
		maxWeight = (weight1>weight2)?weight1:weight2;
		if((weight1+weight2)<=maxW){
			maxValue = value1+value2;
			System.out.println(maxValue);
		}
		else if(((value1>value2)||(value2>value1)) && maxWeight<=maxW) {
			maxValue = value1;
			System.out.println(maxValue);
		}
		else if(((value1>value2)||(value2>value1)) && maxWeight<=maxW) {
			maxValue = value2;
			System.out.println(maxValue);
		}
		return maxValue;*/
		int maxVal =0;
		maxVal = (((weight1>weight2))&& (weight1<=maxW)&& (weight2<=maxW)&& (value1>value2))?value1:value2; 
		if((weight1+weight2)<=maxW){
			maxVal = value1+value2;
		}
		else if((weight1<=maxW)&&(weight2>maxW)) {
			maxVal = value1;
		}
		return maxVal;
		}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = new KnapsackPblm().knapsackLight(2,5,3,4,5);
		//int val = new KnapsackPblm().knapsackLight(10,5,6,4,8);
		//int val = new KnapsackPblm().knapsackLight(10,5,6,4,9);
		//int val = new KnapsackPblm().knapsackLight(15,2,20,3,2);
		System.out.println(val);
	}

}
