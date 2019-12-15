package codeSignalPacka;

import java.util.Arrays;

public class AlmostIncreasingSequenceFin {
	
	/*boolean almostIncreasingSequence(int[] sequence) {
		boolean isAlmostInceSeq = true;	
		int[] removedArray = new int[sequence.length-1];
		for(int a=0;a<sequence.length;a++){
			for(int x=0,y=0;x<sequence.length;x++){
				if(x==a){
					continue;
				}
				removedArray[y++] = sequence[x];
			}
			
				for(int i=0;i<=removedArray.length;i++) {
					for(int j=i+1;j<removedArray.length;j++) {
						if(removedArray[i]>removedArray[j]) {
							isAlmostInceSeq = false;
						}
						else {
							isAlmostInceSeq = true;
						}
						//isAlmostInceSeq = (isAlmostInceSeq)?true:false;
						i=j;
					}
				}
				if(!isAlmostInceSeq){
	                continue;
	                }
				else {
					break;
				}
			}
	return isAlmostInceSeq;
			//boolean sorted = true;
			for(int a=0;a<sequence.length;a++ ){
				if((sequence.length == 2)&&(sequence[0]>sequence[1])) {
					//isAlmostInceSeq = false;
					break;
				}
				int[] removedArray = new int[sequence.length-1];
				for(int i=0,j=0;i<sequence.length;i++){
					if(i==a){
						continue;
					}
					removedArray[j++] = sequence[i];
				}
								
				if((removedArray.length>=5)&&(removedArray[0]<removedArray[1])&&(removedArray[1]<removedArray[2])&&
						(removedArray[2]<removedArray[3])&&(removedArray[3]<removedArray[4])
						&&(removedArray[4]<removedArray[5])&&(removedArray[removedArray.length-2]<removedArray[removedArray.length-1])) {
					isAlmostInceSeq = true;
				}
				else if((removedArray.length>3)&&(removedArray.length<=4)&&(removedArray[0]<removedArray[1])&&(removedArray[1]<removedArray[2])&&(removedArray[removedArray.length-2]<removedArray[removedArray.length-1])) {
					isAlmostInceSeq = true;	
				}
				else if((removedArray.length>2)&&(removedArray.length<=3)&&(removedArray[0]<removedArray[1])&&(removedArray[1]<removedArray[2])) {
					isAlmostInceSeq = true;
				}
				else if((removedArray.length==2)&&(removedArray[0]<removedArray[1])) {
					isAlmostInceSeq = true;
				}		
				else if(removedArray.length==1) {
					isAlmostInceSeq = true;
				}
				
				
			    for (int i = 0; i < removedArray.length - 1; ++i) {
			        if (removedArray[i] > removedArray[i + 1]) {
			        	isAlmostInceSeq = false;
			        	break;
			        }else if(removedArray[i] > removedArray[i + 1]) {
			        	isAlmostInceSeq = true;
			        	break;
			        }
			    }
				if(isAlmostInceSeq) {
					break;
				}
			}
			
			
			
	}*/
	
	int d,i;
	boolean almostIncreasingSequence(int[] s) {
		while(i < s.length-1) {
			if (s[i] < s[i+1]) {
				i++;
			} 
			else {
				d++;
				if (i > 0 && s[i+1] <= s[i-1] && i+2 < s.length && s[i+2] <= s[i]) {
					d++;
				} 
				else {
					i++;
				}
				if (d > 1) {
					return false;
				}
			}
		}
		return true;
	}
//-------------------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arrOfSeqNos = {1, 2, 3, 4, 5, 3, 5, 6};
		int[] arrOfSeqNos = {3,4,4,6};
		//int[] arrOfSeqNos = {1,3,2};
		//int[] arrOfSeqNos = {3, 6, 5, 8, 10, 20, 15};
		//int[] arrOfSeqNos = {10, 1, 2, 3, 4, 5, 6, 1};
		//int[] arrOfSeqNos = {10,3,4,1};
		//int[] arrOfSeqNos = {6, 2, 3, 8};
		//int[] arrOfSeqNos = {1, 2, 1, 2};
		//int[] arrOfSeqNos = {1, 1};
		
		boolean maxNOInArr = new AlmostIncreasingSequenceFin().almostIncreasingSequence(arrOfSeqNos);
		System.out.println("th val is "+maxNOInArr);
	}

}
