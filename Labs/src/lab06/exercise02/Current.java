package lab06.exercise02;

public class Current extends Account{

private  double overDraft=-500;
	
	@Override
	public void withdraw(double value) {
		if((super.getBalance()-value) >= overDraft)
			System.out.println("You have not reached the Overdraft limit you can withdraw the amount you want to withdraw");
		else
			System.out.println("This value can't be withdrawal because it is crossing the overdraft limit");
		
		
	}
}
