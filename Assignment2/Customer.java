package Assignment2;

import java.util.*;

public class Customer {
	/*
	 * Class members-
	 * CustId
	 * CustName
	 * CustAddr
	 * CustPhone
	 * 
	 * Methods:-
	 * enter name, id, phone, addr.  getDetails()
	 */
	Scanner s = new Scanner(System.in);
	
	int CustId;
	String CustAddr;
	int CustPhone;
	String CustName;
	ArrayList<Customer> custList = new ArrayList();
	
	public void getDetails() {
		Customer c = new Customer();
		
		System.out.println("Please enter your name");
		c.CustName = s.next();
		System.out.println("Please enter your id");
		c.CustId = s.nextInt();
		System.out.println("Please enter your phone number");
		c.CustPhone = s.nextInt();
		System.out.println("Please enter your address");
		c.CustAddr = s.nextLine();
		
		custList.add(c);
	}
	
}
