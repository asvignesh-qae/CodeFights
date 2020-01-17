package codeSignalPack;

public class SecondMostRightBitZero {

	int secondRightmostZeroBit(int n) {
		  return ~(n|(n+1)) & ((n|(n+1))+1);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int powOfSecRightMostZero = new SecondMostRightBitZero().secondRightmostZeroBit(37);
		System.out.println("2 power of position of second rightmost zero bit is "+powOfSecRightMostZero);
	}

}
