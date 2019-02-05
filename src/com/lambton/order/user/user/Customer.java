package com.lambton.order.user.user;
import com.lambton.order.user.cart.ShoppingCart;
import com.lambton.order.user.order.Orders;

import java.util.ArrayList;

public class Customer extends User {

	private String customerName;

	private String address;

	private String email;

	private String creditCardInfo;

	private String shippingInfo;

	ArrayList<Orders> orderList = new ArrayList<Orders>();;

	ArrayList<ShoppingCart> cartList = new ArrayList<ShoppingCart>();

	ArrayList<Customer> customerList = new ArrayList<Customer>();

	public Customer() {

	}
	
	public Customer(String userId, String password,String loginStatus,String customerName, String address, String email, String creditCardInfo, String shippingInfo) {
		super(userId, password, loginStatus);
		
		this.customerName = customerName;
		this.address = address;
		this.email = email;
		this.creditCardInfo = creditCardInfo;
		this.shippingInfo = shippingInfo;
	}

	public Customer(String userId, String password, String loginStatus) {
		super(userId, password, loginStatus);
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerName, String address, String email, String creditCardInfo, String shippingInfo,
			ArrayList<Orders> orderList, ArrayList<ShoppingCart> cartList) {
		super();
		this.customerName = customerName;
		this.address = address;
		this.email = email;
		this.creditCardInfo = creditCardInfo;
		this.shippingInfo = shippingInfo;
		this.orderList = orderList;
		this.cartList = cartList;

	}

	public Customer(String customerName, String address, String email, String creditCardInfo, String shippingInfo) {

		this.customerName = customerName;
		this.address = address;
		this.email = email;
		this.creditCardInfo = creditCardInfo;
		this.shippingInfo = shippingInfo;
	}

	public Customer(int orderId, String dateCreated, String dateShipped, String customerName, String customerId,
			String status, String shippingId) {

		Orders o = new Orders();
		o.setOrderId(orderId);
		o.setDateCreated(dateCreated);
		o.setDateShipped(dateShipped);
		o.setCustomerName(customerName);
		o.setCustomerId(customerId);
		orderList.add(o);
	}

	public Customer(int cartId, int productId, int quanity, String dateAdded) {

		ShoppingCart cart = new ShoppingCart();
		cart.setCartId(cartId);
		cart.setProductId(productId);
		cart.setQuanity(quanity);
		cart.setDateAdded(dateAdded);
		cartList.add(cart);
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCreditCardInfo() {
		return creditCardInfo;
	}

	public void setCreditCardInfo(String creditCardInfo) {
		this.creditCardInfo = creditCardInfo;
	}

	public String getShippingInfo() {
		return shippingInfo;
	}

	public void setShippingInfo(String shippingInfo) {
		this.shippingInfo = shippingInfo;
	}

	public ArrayList<Orders> getOrderList() {
		return orderList;
	}

	public void setOrderList(ArrayList<Orders> orderList) {
		this.orderList = orderList;
	}

	public ArrayList<ShoppingCart> getCartList() {
		return cartList;
	}

	public void setCartList(ArrayList<ShoppingCart> cartList) {
		this.cartList = cartList;
	}

	@Override
	public boolean verifyLogin(String userId, String password) {
		// TODO Auto-generated method stub
		System.out.println("In customer Class");
		String user = null;
		if (customerList.isEmpty()) {
			return false;
		} else {
			for (Customer us : customerList) {
				System.out.println("User :: " +us.getUserId());
				if (us.getUserId() == userId) {
					System.out.println(us.getPassword());
					if (us.getPassword() == password) {
						return true;
					}
					else
					{
						return false;
					}
				}

			}
		}

		return true;

	}


	public boolean register(Customer cust) {
		int count = 0;
		String userid = "cust" + count++;
		System.out.println("In Register");
		if (customerList.isEmpty()) {
			/*System.out.println(cust.getUserId());
			System.out.println(cust.getPassword());
			cust.setUserId(cust.getUserId());
			cust.setPassword(cust.getPassword());
			cust.setLoginStatus("F");*/
			customerList.add((Customer) cust);
			System.out.println(customerList.size());
			System.out.println("Customer");
			return true;
		} else {
			for (Customer c : customerList) {
				if (cust.getUserId() != c.getUserId()) {
					/*System.out.println(cust.getUserId());
					System.out.println(cust.getPassword());
					cust.setUserId(cust.getUserId());
					cust.setPassword(cust.getPassword());
					cust.setLoginStatus("F");*/
					customerList.add(cust);
					System.out.println(customerList.size());
					return true;
				}
			}
		}
		return false;

	}
	
/*
	public boolean register(Customer cust) {

		if (customerList.isEmpty()) {
			customerList.add(cust);
			return true;
		} else {
			for (Customer c : customerList) {
				if (cust.getUserId() != c.getUserId()) {
					customerList.add(cust);
					return true;
				}
			}
		}
		return false;

	}*/

	

	public void updateProfile(Customer cust) {

		for (Customer c : customerList) {
			if (c.getUserId() == cust.getUserId()) {
				c.setCustomerName(cust.getCustomerName());
				c.setAddress(cust.getAddress());
				c.setEmail(cust.getEmail());
				c.setCreditCardInfo(cust.getCreditCardInfo());
				c.setShippingInfo(cust.getShippingInfo());
			} else {
				System.out.println("Customer Not found");
			}
		}

	}
	public void getCustomers()
	{
		for(Customer c:customerList)
		{
			System.out.println(c.getUserId() + " " + c.getPassword() +"  "+c.getCustomerName() + " "  + c.getAddress() + " " + c.getEmail() + " " + c.getCreditCardInfo() +
					"  " + c.getShippingInfo());
		}
	}

}
