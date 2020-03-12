package lab01.exercise02;

public class Difference {
	public static int calculateDifference(int n) {
		int diff = 0,SumSqr = 0,SqrSum = 0,i,sum;
		for(i=1;i<=n;i++) {
			SumSqr +=i;
			SqrSum	+= i*i;
		}
		sum = SumSqr * SumSqr;
		diff = sum - SqrSum;
		return diff;
		
	}

	public static void main(String[] args) {
		int number = 3;
		int diff = calculateDifference(number);
		System.out.println("Difference of Numbers : " +diff);

	}

}
