package challengesCodeSignal;

public class VisitsOnCircularRoad {
	int t,j;
	int visitsOnCircularRoad(int n, int[] vO) {
		for(int i = 0;i<vO.length;i++) {
			j=i+1;
			if(j<vO.length) {
				t = t+Math.abs(vO[i]-vO[j]);
			}
		}
		return t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] visitsOrder = {1, 3, 2, 3, 1};
		int totVisits = new VisitsOnCircularRoad().visitsOnCircularRoad(4, visitsOrder);
		System.out.println(totVisits);
	}

}
