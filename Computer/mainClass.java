package Computer;
import java.util.*;
import Storage.*;

public class mainClass {
	
	static Scanner s = new Scanner(System.in);
	
	static ArrayList<User> users = new ArrayList<>();
	
	static Laptop l;
	static Desktop d;
	static Tab t;
	static Mobile m;
	static User u;
	
	static External e;
	static Internal i;
	static Removal r;
	
	public static void main(String[] args) {
		
		
		//Variable Declarations
		int no_dev;
		int choice1, choice2;
		int storage;
		
		//Object Declarations
		u = new User();
		
		System.out.println("=== Welcome to the Program\n\n ===");
		System.out.println("New User Registration");
		System.out.println("Enter the name of the user");
		u.name = s.next();
		System.out.println("Enter the user ID");
		u.id = s.nextInt();
		System.out.println("Enter the number of devices");
		no_dev = s.nextInt();
		
		for(int i=0; i<no_dev; i++) {
			System.out.println("Enter the Device");
			System.out.println("1. Laptop");
			System.out.println("2. Tablet");
			System.out.println("3. Mobile");
			System.out.println("4. Desktop");
			System.out.println("Choose your option");
			choice1 = s.nextInt();
			decide1(choice1);
		}
		
		System.out.println("How many external storage devices?");
		storage = s.nextInt();
		for(int i=0; i<storage; i++) {
			System.out.println("1. USB");
			System.out.println("2. External HDD");
			System.out.println("3. Memory Card");
			System.out.println("Enter your choice");
			choice2 = s.nextInt();
			decide2(choice2);
		}
	}
	
	public static void decide1(int choice) {
		
		
		l = new Laptop();
		d = new Desktop();
		t = new Tab();
		m = new Mobile();
		
		if(choice == 1) {
			System.out.println("Enter the RAM");
			l.ram = s.next();
			System.out.println("Enter the Mother Board");
			l.MotherBoard = s.next();
			u.device_list.add("Laptop");
			users.add(u);
			System.out.println("Enter the data for internal storage");
			l.d.data = s.next();
//			System.out.println("Is your device charging?");
//			l.isCharging = s.nextBoolean();
		}
		
		else if(choice == 2) {
			System.out.println("Enter the RAM");
			t.ram = s.next();
			System.out.println("Enter the Mother Board");
			t.MotherBoard = s.next();
			u.device_list.add("Tablet");
			users.add(u);
			System.out.println("Enter the data for internal storage");
			t.d.data= s.next();
//			System.out.println("Is your device charging?");
//			t.isCharging = s.nextBoolean();
		}
		
		else if(choice == 3) {
			System.out.println("Enter the RAM");
			m.ram = s.next();
			System.out.println("Enter the Mother Board");
			m.MotherBoard = s.next();
			u.device_list.add("Mobile");
			System.out.println("Enter the data for internal storage");
			m.d.data = s.next();
//			System.out.println("Is your device charging?");
//			m.isCharging = s.nextBoolean();
		}
		
		else if(choice == 4) {
			System.out.println("Enter the RAM");
			d.ram = s.next();
			System.out.println("Enter the Mother Board");
			d.MotherBoard = s.next();
			u.device_list.add("Desktop");
			users.add(u);
			System.out.println("Enter the data for internal storage");
			d.d.data = s.next();
		}
	}
	
	public static void decide2(int choice) {	
		
		e = new External();
		i = new Internal();
		r = new Removal();
		
		
		if(choice == 1) {
			System.out.println("Enter the data for the USB");
			r.d.data = s.nextLine();
			u.d.data = r.d.data;
			u.device_list.add("USB");
			users.add(u);
			
		}
		else if(choice == 2) {
			System.out.println("Enter the data for the External HDD");
			e.d.data = s.nextLine();
			u.d.data = e.d.data;
			u.device_list.add("External HDD");
			users.add(u);
			
		}
		else if(choice == 3) {
			System.out.println("Enter the data for the Memory Card");
			i.d.data = s.nextLine();
			u.d.data = i.d.data;
			u.device_list.add("Memory Card");
			users.add(u);
			
		}
	}
	
	public void display() {
		//Printing of data should be done using instanceOf and Downcasting. 
		int id,j,choice;
		System.out.println("Enter the user ID");
		id = s.nextInt();
		
		//Traverse in the users list for the matching id.
		for(int i=0; i<users.size(); i++) {
			if(users.get(i).id == id) {
				System.out.println("You have the following devices in your account: ");
				for(j=1; j<=u.device_list.size(); j++) {
					System.out.println(j + ". " + u.device_list.get(j));
				}
				System.out.println("Enter the choice to view data");
				choice = s.nextInt();
				
				if(choice == 1) {
					//View the data in Laptop
				}else if(choice == 2) {
					//View the data in Tablet
				}else if(choice == 3) {
					//View the data in Mobile
				}else if(choice == 4) {
					//View the data in Desktop
				}
			}
		}
	}
}
