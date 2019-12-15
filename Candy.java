package codeSignalPacka;

public class Candy {
	int i=0;
	int candy = 0;
	public int candies(int n, int m) {
		/*for(i=1;i<m;i++) {
			int mul=n*i;
			if(mul>m) {
				System.out.println("The output is "+n*(i-1));
				candy = n*(i-1);
				break;
			}
			else
				candy = m/n;
		}*/
		
		return (m/n)*n;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candy obj = new Candy();
		int noOfCandies = obj.candies(3, 6);
		System.out.println("The no of candies is "+noOfCandies);
	}

}
