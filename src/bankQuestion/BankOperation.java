package bankQuestion;

public class BankOperation {
	int pinNumber =1111;
	int minBalance =50;
	double accountBalance =500;
	String cardNumber ="4111111111111111";
	boolean cardVarification= true;
	
	boolean getcardvarification() {
		return cardVarification;
	}
	double depositMoney(double depositmoney, String cardNo, int pin) {
		
		
		 boolean cardvarification  = getcardvarification();
		 
		if(cardNo.equals(cardNumber)&& (pin == pinNumber)) {
				
					accountBalance = accountBalance+depositmoney;
				     return depositmoney;	
				
			}
			
		return 0;
}
}