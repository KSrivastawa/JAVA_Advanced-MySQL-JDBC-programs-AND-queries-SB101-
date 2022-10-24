package com.Q3_User_Defined_checked_Exception;

import java.util.Scanner;

public class AccountDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Enter Your Account Number:");
			String accountNumber = sc.next();
			
			
			while(true) {
				
				Account account = new Account(accountNumber, 500);  // 500 minimum amount should be available initially.
				
			System.out.println("Enter the choice: \n"+"1.Deposit \n"+ "2.Withdraw \n"+"3.Clear");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("Enter Deposit Amount:");
				double depositAmount = sc.nextDouble();

				System.out.println("Deposit Successfully!");
				
				account.deposit(depositAmount);
				
			}
			
			else if(choice == 2) {
				System.out.println("Enter withdrawal Amount:");
				double withdrawAmount = sc.nextDouble();
	
				double y = account.withdraw(withdrawAmount);
				
				System.out.println("Withdrawal Successfully!");
				System.out.println("Balanced Amount is: "+ y);
			}
			else if(choice == 3) {
				System.out.println("Thanks!");
				break;
			}
		
		  }	
			
		} catch (InsufficientFundsException e1) {
			
			System.out.println(e1.getMessage());
		}
		
		System.out.println("Happy to use online!");

	}

}
