package lab01.excercise01;

public class SumofNum {

	public static int calculateSum(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++){
		if(i % 3 == 0 || i % 5 == 0) {
			sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int number = 50;
		int sum = calculateSum(number);
		System.out.println("Sum of Numbers : " + sum);
	}

}
