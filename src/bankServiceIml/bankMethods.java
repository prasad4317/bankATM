package bankServiceIml;
import bankServiceZExceptions.*;

public interface bankMethods {
	
	void cashWithdrawl(int amt) throws insufficientBalanceException;
	void checkBalance();
	void cashDeposit(int deAmt) throws invalidAmtException;

}
