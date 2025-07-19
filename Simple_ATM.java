/*Author:Vijilee George Kurian
  Description: A Simple Project Based on a Simple ATM Stimulator*/

import java.util.Scanner;
public class Simple_ATM {
	public static void main(String[] args) {
		Scanner amount=new Scanner(System.in);
		float balance_amount=10000;
		int choice=1;
		while(choice!=0) {
			System.out.println("1.Balance Enquiry \n2.Deposit \n3.Withdrawal");
			System.out.println("Choose an Option:");
			int value=amount.nextInt();
			if(value==1) {
				System.out.println("The balance Amount is:"+balance_amount);
			}
			else if(value==2) {
				System.out.println("Enter the Amount to be Deposited: ");
				float deposit_amount=amount.nextFloat();
				balance_amount=balance_amount+deposit_amount;
				System.out.println("The Balance Amount After Deposit:"+balance_amount);
			}
			else if(value==3) {
				System.out.println("Enter the Amount for Withdrawal:");
				float withdraw_amount=amount.nextFloat();
				if(withdraw_amount>balance_amount) {
					System.out.println("Sorry Insufficent Balance");
				}
				else {
					balance_amount=balance_amount-withdraw_amount;
					System.out.println("The Balance amount after withdrawal:"+balance_amount);
				}
			}
			else {
				System.out.println("Choose the Correct Option");
			}
			System.out.println("click 0 to exit and 1 to countinue:");
			choice=amount.nextInt();
			
		}
		System.out.println("Thankyou...Have a nice day");
	}

}
