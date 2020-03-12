package lab04.exercise02;

public class Current extends Account{
	private static final double overDraftLimit = - 500;
	
	@Override
	public void withdraw(double value) {
		if((super.getBalance()-value)<overDraftLimit) {
			System.out.println(" Insufficient Balance");
		}else {
			super.withdraw(value);
		}
	}
}
