package Abstraction;

public class ATMImpl extends ATM{

	float amount, balance =10000;
	
	void WithdrawaMoney(float amount)
	{
		if(amount<=balance)
		{
			balance=balance-amount;
			System.out.println("Withdrawal Successful...!");
		}
		else
		{
			System.out.println("Insufficient balance!!!!...");
		}
	}
		void depositMoney(float amount)
		{
			balance=balance+amount;
			System.out.println("Deposit Successful. New Balance is : "+balance);
			
		}
		
		void checkBalance()
		{
			System.out.println("Balance is : "+balance);
	     }
		@Override
		void withdrawalMoney(float amount) {
			// TODO Auto-generated method stub
			
		}
}

	
	

