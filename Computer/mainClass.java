package Computer;
import java.util.*;
import Storage.*;

public class mainClass {
	
	static Scanner s = new Scanner(System.in);
	
	static ArrayList<User> users = new ArrayList<>();
	
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
		
		Computer c;
		
		if(choice == 1) {	
			String data_usb;
			c = new Laptop();
			System.out.println("Enter the RAM");
			c.ram = s.next();
			System.out.println("Enter the Mother Board");
			c.MotherBoard = s.next();
			u.device_list.add("Laptop");
			users.add(u);
			System.out.println("Enter the data for internal storage");
			c.i.d.data= s.next();
			System.out.println("Is the USB connected?(y/n");
			ch = s.next();
			if(c.ch == 'y') {
				System.out.println("Enter the data for the USB");
				data_usb = s.next();
				c.r.d.data = data_usb;
			}else {
				
			}
		}
		
		 if(choice == 2) {
			c = new Tab();
			String data_usb;
			
			System.out.println("Enter the RAM");
			c.ram = s.next();
			System.out.println("Enter the Mother Board");
			c.MotherBoard = s.next();
			u.device_list.add("Tablet");
			users.add(u);
			System.out.println("Enter the data for internal storage");
			c.i.d.data = s.next();
			System.out.println("Is your device charging?");
			t.isCharging = s.nextBoolean();
			System.out.println("Is the USB connected?(y/n");
			ch = s.next();
			if(c.ch == 'y') {
				System.out.println("Enter the data for the USB");
				data_usb = s.next();
				c.r.d.data = data_usb;
			}else {
				
			}
		}
		
		else if(choice == 3) {
			c = new Mobile();
			String data_usb;
			
			System.out.println("Enter the RAM");
			c.ram = s.next();
			System.out.println("Enter the Mother Board");
			c.MotherBoard = s.next();
			//u.device_list.add("Mobile");
			System.out.println("Enter the data for internal storage");
			c.i.d.data = s.next();
			System.out.println("Is your device charging?");
			m.isCharging = s.nextBoolean();
			System.out.println("Is the USB connected?(y/n)");
			ch = s.next();
			if(c.ch == 'y') {
				System.out.println("Enter the data for the USB");
				data_usb = s.next();
				c.r.d.data = data_usb;
			}else {
				
			}
		}
		
		 if(choice == 4) {
			c = new Desktop();
			String data_usb;
			
			System.out.println("Enter the RAM");
			c.ram = s.next();
			System.out.println("Enter the Mother Board");
			c.MotherBoard = s.next();
			u.device_list.add("Desktop");
			users.add(u);
			System.out.println("Enter the data for internal storage");
			c.i.d.data = s.next();
			System.out.println("Is the USB connected?(y/n");
			ch = s.next();
			if(c.ch == 'y') {
				System.out.println("Enter the data for the USB");
				data_usb = s.next();
				c.r.d.data = data_usb;
			}else {
				
			}
		}
	}
	
	public static void decide2(int choice) {	
		
		Storage s;
				
		if(choice == 1) {
			s = new Removal();
			System.out.println("Enter the data for the USB");
			s.d.data = s.nextLine();
			u.d.data = s.d.data;
			u.device_list.add("USB");
			users.add(u);
			
		}
		 if(choice == 2) {
			 s = new External();
			System.out.println("Enter the data for the External HDD");
			s.d.data = s.nextLine();
			u.d.data = s.d.data;
			u.device_list.add("External HDD");
			users.add(u);
			
		}
		 if(choice == 3) {
			s = new Internal();			
			System.out.println("Enter the data for the Memory Card");
			s.d.data = s.nextLine();
			u.d.data = s.d.data;
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
					if(c instanceof Laptop) {
						System.out.println(c.i.data);
						if(c.ch == 'y') {
							System.out.println(c.i.data);
						}
					}
				}else if(choice == 2) {
					if (c instanceof Tablet) {
						System.out.println(c.i.data);
						if(c.ch == 'y') {
							System.out.println(c.i.data);
						}
					}
					
				}else if(choice == 3) {
					if (c instanceof Mobile) {
						System.out.println(c.i.data);
						if(c.ch == 'y') {
							System.out.println(c.i.data);
						}
					}
					
				}else if(choice == 4) {
					if(c instanceof Desktop) {
						System.out.println(c.i.data);
						if(c.ch == 'y') {
							System.out.println(c.i.data);
						}
					}
				}
			}
		}
	}
}
