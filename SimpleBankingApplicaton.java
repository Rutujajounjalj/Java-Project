package simplebankingapplicationpriject;

import java.util.Scanner;

// PROJECT ON SIMPLE BANKING APPLICATION 
public class SimpleBankingApplicaton {
	  private static double balance=10000;    
	// initial balance
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome in simple banking application project");
		Scanner sc= new Scanner(System.in);
		int choice;
		do {
			
		
		// display menu 
		System.out.println("1.checkbalance \n2.Deposit\n 3.withdraw \n4.Exit ");
		System.out.println("Enter your choice");
		// get user choice
		choice =sc.nextInt();
		                            // take choice from user in input
		switch(choice) {
		case 1:checkbalance();
		break;
		case 2:
			deposit(sc);
		break;
		case 3:
			withdraw(sc);
		break;
		case 4:
		System.out.println("Exiting from application, thank you");
		break;
		default:
			System.out.println("Invalid choice");
		}
		}
		while(choice!=4);
		sc.close();
	}
		
	private static void checkbalance() {
		// TODO Auto-generated method stub
		 System.out.println("youe balance is Rs"+balance);
		
	}


	
	 static void deposit(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter deposit ammount Rs:");
		double ammount=sc.nextDouble();
		if(ammount>0) {
			balance += ammount;
			System.out.println(" deposit succesful.new balance Rs"+balance);
			
		}
		else {
			System.out.println("invalid deposit ammount please enter positive value");
		}
		
	
		
	}


static  void withdraw(Scanner sc) {
	// TODO Auto-generated method stub
	System.out.println("Enter withdraw ammount Rs:");
	double ammount=sc.nextDouble();
	 if(ammount>0&&ammount<=balance)
	 {
		 balance -= ammount;
		 System.out.println("withdraw succesful new balance"+balance);
	 }else
	 {
		 System.out.println("Invalid withdraw amount or insufficient balance");
		 
		 
	 }
	
	
}
}

