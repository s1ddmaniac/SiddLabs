package lab04.exercise02;

public class Savings extends Account{
	private final static double minBalance = 500;
	
	@Override
	public void withdraw(double value) {
		if((super.getBalance()-value)<500) {
			System.out.println("Insufficient Balance");
		}else {
			super.withdraw(value);
		}
	}
}
