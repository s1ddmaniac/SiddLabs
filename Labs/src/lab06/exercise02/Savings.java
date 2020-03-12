package lab06.exercise02;

public class Savings extends Account{
	
	private final double  minBalance=500;
	
	@Override
	public void withdraw(double value) {
		if(super.getBalance() > minBalance){
			super.setAccBalance((super.getAccBalance())-value);			
		}
	}

}
