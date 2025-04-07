package atm;

import java.util.Scanner;

public class UserInterface {
	private static int status;
	public static void main(String[] args) {
		Atmimpl impl= new Atmimpl();
		Scanner scan = new Scanner(System.in);
		int atmnumber = 123456;
		int atmpin = 1289;
		System.out.println("WELCOME TO ATM MACHINE");
		System.out.println("Enter the ATM number");
		int atmnum2=scan.nextInt();
		System.out.println("Enter the PIN number");
		int atmpin2=scan.nextInt();
		if(atmnumber==atmnum2 && atmpin == atmpin2) {
			while(true) {
				System.out.println(" 1.View Available Balance\n 2.Withdraw Amount\n 3.Deposit amount\n 4.View MiniStatement\n 5.Exit");
				System.out.println("Enter Choice : ");
				int ch = scan.nextInt();
				if(ch == 1) {
					impl.viewBalance();
					
				} 
				else if(ch==2){
					System.out.println("Enter the amount to withdraw");
					double withdrawamount=scan.nextDouble();
					impl.withdrawAmount(withdrawamount);
					
					
				}
				else if (ch==3) {
					System.out.println("Enter the Amount to Deposit");
					double depositamount=scan.nextDouble();
					impl.depositAmount(depositamount);
					
				}
				else if(ch==4) {
					impl.viewMiniStatement();
				}
				else if (ch ==5) {
					System.out.println("Collect your ATM card \n    Thank you");
					System.exit(status);
				}
			}
		}
		else {
			System.out.println("INCORRECT ATM NUMBER OR PIN");
		}
		
	}

}
