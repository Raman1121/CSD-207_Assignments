package Lab_1;
import java.util.Scanner;

public class assignment_1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		int choice;		//Choice to enter the Manager or Client mode.
		int tamount = 0; 	//Total amount entered by the manager.
		int notes_2k = 0;
		int notes_500 = 0;
		int notes_100 = 0;
			
		String branch;		//Branch name.
		String password;		//Password for authentication. 
		
		
		
		
				
		System.out.println("WELCOME TO ATM123");
		System.out.println("Please choose one of the following options:");
		System.out.println("1. Manager Mode");
		System.out.println("2. Client Mode");
		choice = s.nextInt();
		
		if(choice == 1) {
			
			//Enter the Manager Mode
			//The manager can initialize the total amount in the ATM.
			//Set up some kind of authentication for the manager mode.
			
			System.out.println("<=== Welcome to the Manager Mode ===>");
			System.out.println("Please enter your branch name");
			branch = s.next();
			System.out.println("Please enter the password provided to you");
			password = s.next();
			
			if(password.equals("ABCbank")) {
				System.out.println("!!AUTHENTICATED!!");
				System.out.println("Please enter the total amount you want to deposit in the ATM");
				tamount = s.nextInt();
				
				notes_2k = (int) (0.25 * tamount)/(2000);
				notes_500 = (int) (0.35 * tamount)/(500);
				notes_100 = (int) (0.40 * tamount)/(100);
				
				System.out.printf("The number of 2000 rupee notes are %d\n", notes_2k);
				System.out.printf("The number of 500 rupee notes are %d\n", notes_500);
				System.out.printf("The number of 100 rupee notes are %d\n", notes_100);
				
				System.out.println("Thank you for using ATM123 :) \n\n");
				
				client(notes_2k, notes_500, notes_100);
			}else {
				System.out.println("Wrong password entered.");
				System.out.println("Authentication Failed :( ");
			}
		}else if(choice == 2) {
			
			//Enter the client mode
			client(notes_2k, notes_500, notes_100);
		}	
	}
	
	public static void client(int num_2k, int num_500, int num_100) {
		
		Scanner s = new Scanner(System.in);
		int amount;		//Amount entered by the client.
		float threshold; 	//Threshold value to be decided by the client.
		int notes_2k = num_2k;
		int notes_500 = num_500;
		int notes_100 = num_100;
		
			
		System.out.println("<=== Welcome to the client mode ===>");
		System.out.println("Enter the amount that you want to withdraw");
		amount = s.nextInt();
		
		if(amount%100 != 0) {
			System.out.println("Please enter the amount in multiples of 100 only.");
			amount = s.nextInt();
		}
		
		if(amount > 25000) {
			System.out.println("You can't withdraw more than 25000.");
		}else {
			System.out.println("Enter the threshold value");
			threshold = s.nextFloat();
			
			//First check if the number of notes present are greater than the threshold.
			//No. of notes to be dispensed = (Amount entered)/(denomination)
			//Update amount = (amount)%(denomination)
			//Update the number of notes
			
			boolean notes_2k_status = (notes_2k > threshold*notes_2k);
			boolean notes_500_status = (notes_500 > threshold*notes_500);
			boolean notes_100_status = (notes_100 > threshold*notes_100);
			
			int disp_2k = 0;
			int disp_500 = 0;
			int disp_100 = 0;
			
			if( !notes_2k_status) {
				disp_2k = 0;
				
				if( notes_500_status) {	//500 available
					if( notes_100_status) {						
						//Both 500 and 100 available
						disp_500 = (amount)/500;
						notes_500 = notes_500 - disp_500;
						amount = amount%500;
						disp_100 = (amount)/100;
						notes_100 = notes_100 - disp_100;
					}else {
						//Only 500
						disp_500 = (amount)/500;
						notes_500 = notes_500 - disp_500;
						amount = amount%500;
					}
				}else {	//100 available 
					
					disp_500 = 0;
					disp_100 = (amount)/100;
					notes_100 = notes_100 - disp_100;
				} 
				System.out.printf("Number of 2000 rupee notes dispensed: %d", disp_2k);
				System.out.printf("Number of 500 rupee notes dispensed: %d", disp_500);
				System.out.printf("Number of 100 rupee notes dispensed: %d", disp_100);
			}
			
			else if( !notes_500_status) {
				disp_500 = 0;
				if(notes_2k_status) {	//2000 available
					if(notes_100_status) {
						//both 100 and 2000 available
						disp_2k = (amount)/2000;
						notes_2k = notes_2k - disp_2k;
						amount = amount%2000;
						disp_100 = (amount)/100;
						notes_100 = notes_100 - disp_100;
					}else {
						//only 2000 available
						disp_2k = (amount)/2000;
						notes_2k = notes_2k - disp_2k;
						amount = amount%2000;
					}
				}else {
					//only 100 available 
					disp_2k = 0;
					disp_100 = (amount)/100;
					notes_100 = notes_100 - disp_100;
				}
				System.out.printf("Number of 2000 rupee notes dispensed: %d", disp_2k);
				System.out.printf("Number of 500 rupee notes dispensed: %d", disp_500);
				System.out.printf("Number of 100 rupee notes dispensed: %d", disp_100);
			}
			
			else if( !notes_100_status) {
				disp_100 = 0;
				
				if(notes_2k_status) {	//2000 Available
					if(notes_500_status) {
						//Both 2000 and 500 available
						disp_2k = (amount)/2000;
						notes_2k = notes_2k - disp_2k;
						amount = amount%2000;
						disp_500 = amount/500;
						notes_500 = notes_500 - disp_500;
					}else {
						//Only 2000 available
						disp_2k = (amount)/2000;
						notes_2k = notes_2k - disp_2k;
						amount = amount%2000;
					}
				}else {
					//Only 500 available
					disp_2k = 0;
					disp_500 = (amount)/500;
					notes_500 = notes_500 - disp_500;
				}
				System.out.printf("Number of 2000 rupee notes dispensed: %d", disp_2k);
				System.out.printf("Number of 500 rupee notes dispensed: %d", disp_500);
				System.out.printf("Number of 100 rupee notes dispensed: %d", disp_100);
			}
		}
	}

}
