package bankServiceIml;

import bankServiceZExceptions.insufficientBalanceException;
import bankServiceZExceptions.invalidAmtException;

public class bankSol implements bankMethods {
 int balance=0;
	@Override
	public void cashWithdrawl(int amt) throws insufficientBalanceException {
     
		if(amt>balance) {
			throw new insufficientBalanceException("Insufficient Balance");
		}
		else {
			balance=balance-amt;
			System.out.println(amt+" withdrawal successfully");
			
		}
	}

	@Override
	public void checkBalance() {
		
		System.out.println("Your current balance is " +balance);
	}

	@Override
	public void cashDeposit(int deAmt) throws invalidAmtException {
		if(deAmt<=0) {
			throw new invalidAmtException("Invalid Amount");
		}
		else {
			balance=balance+deAmt;
			System.out.println(deAmt+" deposited successfully");
			

		
		
	}

	

	}}
