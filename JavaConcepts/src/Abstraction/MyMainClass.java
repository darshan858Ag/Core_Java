package Abstraction;

public class MyMainClass {
public static void main(String[] args) {
	
	ATMImpl atm=new ATMImpl();
	//atm.withdrawalMoney(30000);
	atm.depositMoney(20000);
	atm.checkBalance();
}
}
