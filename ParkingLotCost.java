package challengesCodeSignal;

public class ParkingLotCost {
	int cost;
	int parkingCost(String timeIn, String timeOut) {
		System.out.println("The default cost is "+cost);
		String[] intym = timeIn.split(":");
		String[] outtym = timeOut.split(":");
		int inTymMins = (Integer.parseInt(intym[0])*60)+Integer.parseInt(intym[1]);
		System.out.println("In time mins is "+inTymMins);
		int outTymMins = (Integer.parseInt(outtym[0])*60)+Integer.parseInt(outtym[1]);
		System.out.println("Out time mins is "+outTymMins);
		int totmins = ((Integer.parseInt(outtym[0])*60)+Integer.parseInt(outtym[1]))-((Integer.parseInt(intym[0])*60)+Integer.parseInt(intym[1]));
		System.out.println("Total parked mins is "+totmins);
		cost = totmins>120?9+((totmins-120)/10)*2+((totmins-120)%10>0?2:0):(totmins>30)?(totmins-30)/10+((totmins-30)%10>0?1:0):0;
		return cost;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int cost = new ParkingLotCost().parkingCost("14:32", "14:57");
		//int cost = new ParkingLotCost().parkingCost("12:20", "14:54");
		//int cost = new ParkingLotCost().parkingCost("12:20", "14:11");
		//int cost = new ParkingLotCost().parkingCost("00:01", "4:45");
		int cost = new ParkingLotCost().parkingCost("23:44", "23:59");
		System.out.println("The total cost is "+cost);
	}

}
