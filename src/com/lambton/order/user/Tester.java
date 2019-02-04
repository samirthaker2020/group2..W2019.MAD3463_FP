package com.lambton.order.user;
import com.lambton.*;
import com.lambton.order.user.user.User;
import com.lambton.order.user.user.*;
import java.io.Console;
import java.util.Scanner;

public class Tester {


	private static void displayCustomerOptions(Customer c)
	{
		int ch;char ch1;
		do{
			System.out.println("Press the number");
			System.out.println("1 : Update Profile");
			System.out.println("2 : View products");
			System.out.println("3 : View Cart Details");
			System.out.println("4 : View Order Details");
			System.out.println("Enter your Choice :: ");
			Scanner scanner=new Scanner(System.in);
			ch = scanner.nextInt();
			switch (ch) {
				case 1:
					//call the method to update customer profile
					break;
				case 2:
					displayProducts();
					break;
				case 3:
					//call the method to display  cart details for the customer
					proceedToCheckout();
					break;
				case 4:
					//call the method to update order details
					proceedToCheckout();
					break;
				default: System.out.println("Invalid choice!! Please enter correct choice");
					break;
			}
			System.out.println("Do you want to continue??(Enter Y/N)");
			ch1 = scanner.next().charAt(0);;
		}
		while(ch1=='y' || ch1=='Y');
	}

	private static void displayProducts()
	{
		//call method  to display all the products into the catalog
		int ch;
		char ch1;
		System.out.println("Enter the product id to add the product to the cart");
		Scanner sc = new Scanner(System.in);
		ch=sc.nextInt();
		//call the method to add the item to cart
		System.out.println("Do you want to proceed to checkout??(Press y/n)");
		ch1=sc.next().charAt(0);
		proceedToCheckout();
		if(ch1=='y' || ch=='Y'){
			//call the method to add the product into the cart with product id
		}
	}

	public static void proceedToCheckout()
	{
		char ch1;
		System.out.println("Enter the shipping information:");
		//call method to add shipping details and to view shipping details...

		Scanner sc = new Scanner(System.in);
		// call method to view order details...
		System.out.println("Do you want to update the shipping details: (press y/n)");

		ch1=sc.next().charAt(0);
		if(ch1=='y' || ch1=='Y'){
			//call method to update shipping details...
		}
		System.out.println("Do you want to update the order details: (press y/n)");

		ch1=sc.next().charAt(0);
		if(ch1=='y' || ch1=='Y'){
			//call method to update order details...
		}
		System.out.println("Do you want to proceed to checkout (press y/n)");
		ch1=sc.next().charAt(0);
		if(ch1=='y' || ch1=='Y'){
			//call method to proceed to checkout
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u = null;
		Console console = System.console();
		Customer customer = new Customer();
		Scanner scanner = new Scanner(System.in);
		char ch1;
		System.out.println("#################################################");
		System.out.println("             Online Shopping System              ");
		System.out.println("#################################################");
		int choice = 0;
		do {
			System.out.println("1 : Login");
			System.out.println("2 : Register");
			System.out.println("3 : Exit");
			System.out.print("Enter your choice ....");
			choice = scanner.nextInt();

			switch (choice) {

				case 1:

					System.out.println("Enter UserId ::");
					String userId = scanner.next();
					System.out.println("Enter Password :: ");
					String pswd = scanner.next();
					boolean checkLogin = customer.verifyLogin(userId, pswd);
					if (checkLogin) {

						System.out.println("Login Successfully...");
						displayCustomerOptions(customer);

					} else {
						System.out.println("Login failed");
					}
					break;
				case 2:
					System.out.println("Enter id:: ");
					String id = scanner.next();
					System.out.println("Enter pass :: ");
					// char[] pswd1 = console.readPassword();
					String pswd1 = scanner.next();
					String status = "C";
					System.out.println("Enter Customer Name :: ");
					String cname = scanner.next();
					System.out.println("Enter Addreess :: ");
					String add = scanner.next();
					System.out.println("Enter Email :: ");
					String email = scanner.next();
					System.out.println("Enter Credit Card Info :: ");
					String card = scanner.next();
					System.out.println("Enter Shipping Info :: ");
					String shipInfo = scanner.next();
					//Customer c = new Customer(id, pswd1, status, cname, add, email, card, shipInfo);
					Customer c = new Customer(id, new String(pswd1), status,
							cname, add, email, card, shipInfo);
					boolean checkRegister = customer.register(c);
					if (checkRegister) {
						System.out.println("Customer Register Successfully...");

						//proceedToCheckout();
					}
					break;
				case 4:
					//call the method to update order details

					break;
				default: System.out.println("Invalid choice!! Please enter correct choice");
					break;
			}
			System.out.println("Do you want to continue??(Enter Y/N)");
			ch1 = scanner.next().charAt(0);;
		}while(ch1=='y' || ch1=='Y');
	}
}

