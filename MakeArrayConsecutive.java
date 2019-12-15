package codeSignalPacka;

public class MakeArrayConsecutive {

	int makeArrayConsecutive2(int[] statues) {
		int max = statues[0];
		int min = statues[0];
		int count =0;
		/*for(int i=0;i<=statues.length-1;i++){
		    max = (max>statues[i])?max:statues[i];
		    min = (min<statues[i])?min:statues[i];
		    for(int j = min;j<=max;j++) {
				System.out.println("i is "+j);
				System.out.println("i + 1 is "+(j+1));
				if(statues[i]!=j) {
					count = count+1;
					System.out.println("count is "+count);
				}
			}
		}
		System.out.println(max);
		System.out.println(min);*/
		for(int i=0;i<statues.length;i++) {
			for (int j=i+1;j<statues.length;j++) {
				if(statues[i]>statues[j]) {
					int temp = statues[i];
					System.out.println("temp is"+temp);
					statues[i] = statues[j];
					System.out.println("1st elem is"+statues[i]);
					statues[j] = temp;
					System.out.println("2nd elem is"+statues[i+1]);
				}
			}	
		}
		/*for (int co = 0; co <= statues.length-1; co++) 
        {
            System.out.print(statues[co] + ", ");
        }*/
		System.out.println("The length is "+statues.length);
		for(int no:statues) {
			System.out.println(no);
		}
		//int count = 0;
		/*for(int j = min;j<=max;j++) {
			System.out.println("i is "+j);
			System.out.println("i + 1 is "+(j+1));
			if(j!=(j+1)) {
				count = count+1;
				System.out.println("count is "+count);
			}
		}*/
		for(int a = 1;a<statues.length;a++) {
			if((statues[a]-statues[a-1])>1) {
				count = count+((statues[a]-statues[a-1])-1);
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrOfNos = {10,3,4,5,2,4,8,9,1};
		//int[] arrOfNos = {10,3,4,1};
		//int[] arrOfNos = {6, 2, 3, 8};
		int maxNOInArr = new MakeArrayConsecutive().makeArrayConsecutive2(arrOfNos);
		System.out.println("the no is "+maxNOInArr);
	}

}
