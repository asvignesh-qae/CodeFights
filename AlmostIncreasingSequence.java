package codeSignalPacka;

import java.util.Arrays;

public class AlmostIncreasingSequence {
	//int[] b = new int[5];
	boolean almostIncreasingSequence(int[] sequence) {
	    //Arrays.sort(sequence);
			int[] removedArrOfElem = new int[sequence.length-1];
			boolean isArrayIncreasing = false;
			for(int a=0;a<sequence.length;a++ ){
				removedArrOfElem = removeItemOfAnArray(sequence,a);
				
				isArrayIncreasing = checkIsArrayIncreasing(removedArrOfElem);
				if(isArrayIncreasing) {
					break;
				}
			}
			for(int nooos:removedArrOfElem){
				System.out.println("Array after removing an element "+nooos);
			}
			return isArrayIncreasing;
	}
//-------------------------------------------------------------------------------------------------------------------
			boolean checkIsArrayIncreasing(int[] remseq) {
				boolean isAlmostInceSeq = false;
						if((remseq.length>=5)&&(remseq[0]<=remseq[1])&&(remseq[1]<=remseq[2])&&(remseq[2]<=remseq[3])&&(remseq[remseq.length-2]<=remseq[remseq.length-1])) {
							isAlmostInceSeq = true;
						}
						else if((remseq.length>3)&&(remseq.length<=4)&&(remseq[0]<=remseq[1])&&(remseq[1]<=remseq[2])&&(remseq[remseq.length-2]<=remseq[remseq.length-1])) {
							isAlmostInceSeq = true;	
						}
						else if((remseq.length>2)&&(remseq.length<=3)&&(remseq[0]<=remseq[1])&&(remseq[1]<=remseq[2])) {
							isAlmostInceSeq = true;
						}
						else if((remseq.length<=2)&&(remseq[0]<=remseq[1])) {
							isAlmostInceSeq = true;
						}						
		                else
		                    isAlmostInceSeq = false;
				return isAlmostInceSeq;
			}
					
		int[] removeItemOfAnArray(int[] array, int index){
			int[] removedArray = new int[array.length-1];
			for(int i=0,j=0;i<array.length;i++){
				if(i==index){
					continue;
				}
				removedArray[j++] = array[i];
			}
			return removedArray;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arrOfSeqNos = {3,4,4,6};
		//int[] arrOfSeqNos = {1,3,2};
		//int[] arrOfSeqNos = {3, 6, 5, 8, 10, 20, 15};
		//int[] arrOfSeqNos = {10, 1, 2, 3, 4, 5, 6, 1};
		//int[] arrOfSeqNos = {10,3,4,1};
		int[] arrOfSeqNos = {6, 2, 3, 8};
		boolean maxNOInArr = new AlmostIncreasingSequence().almostIncreasingSequence(arrOfSeqNos);
		System.out.println("th val is "+maxNOInArr);
	}

}
