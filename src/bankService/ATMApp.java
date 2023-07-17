package bankService;

import java.util.Scanner;

import bankServiceIml.bankSol;
import bankServiceZExceptions.insufficientBalanceException;
import bankServiceZExceptions.invalidAmtException;

public class ATMApp {

	public static void main(String []args) {
		String d="";
		bankSol obj=new bankSol();
		Scanner sc=new Scanner(System.in);
		do {
			try {
		
			
			System.out.println("choose option from below");
			System.out.println("1.Cash withdrawl 2.Balance Check 3.cash Deposit");
			
			 int g= sc.nextInt();
			 
			 if(g==1) {
				 System.out.println("enter amount to withdraw");
				 int amt= sc.nextInt();
				 obj.cashWithdrawl(amt);
				 obj.checkBalance();
				 
			 }else if(g==2) {
				 obj.checkBalance();
			 }
				 
			 else if(g==3) {}
			 
			  { System.out.println("enter amount to deposit");
			  int deAmt=sc.nextInt();
			  obj.cashDeposit(deAmt);
			  obj.checkBalance();
			 }}
			catch( invalidAmtException e) {
				System.out.println(e);
			}
			catch( insufficientBalanceException e) {
				System.out.println(e);
			}
			
			
			catch(Exception e) {
				e.printStackTrace();
			}
			 	System.out.println("Do you want to continue");
			 	d=sc.next();
			 	
			
			
		}while(d.equalsIgnoreCase("yes"));
		sc.close();
	}
}
