package com.lambton.order.user.cart;
import com.lambton.order.user.order.*;

import java.util.ArrayList;

public class ShoppingCart {

	private int cartId;

	private int productId;

	private int quanity;

	private String dateAdded;

	ArrayList<ShoppingCart> cartList = new ArrayList<ShoppingCart>();

	public ShoppingCart() {

	}

	public ShoppingCart(int cartId, int productId, int quanity, String dateAdded) {

		this.cartId = cartId;
		this.productId = productId;
		this.quanity = quanity;
		this.dateAdded = dateAdded;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuanity() {
		return quanity;
	}

	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}

	public String getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}

	public boolean addCartItem(ShoppingCart s) {
		if (cartList.isEmpty()) {
			cartList.add(s);
			return true;
		} else {
			for (ShoppingCart sc : cartList) {
				if (sc.getCartId() != s.getCartId()) {
					cartList.add(s);
					return true;
				}
			}
		}
		return false;

	}

	public boolean updateQuantity(ShoppingCart cart) {
		for (ShoppingCart sc : cartList) {
			if (sc.getCartId() == cart.getCartId()) {
				sc.setProductId(cart.getProductId());
				sc.setQuanity(cart.getQuanity());
				sc.setDateAdded(cart.getDateAdded());
				return true;
			} else {
				return false;
			}
		}
		return true;

	}

	public ArrayList<ShoppingCart> viewCartDetails() {
		ArrayList<Orders> orderList = null;
		if (cartList.isEmpty()) {
			cartList = null;
		} else {
			for (ShoppingCart sc : cartList) {

				// System.out.println(sc.getCartId() + " " + sc.getDateAdded() +
				// " " + sc.getProductId() + " " + sc.getQuanity());
				int cartId = sc.getCartId();
				int productId = sc.getProductId();
				int quantity = sc.getQuanity();
				String dateAdded = sc.getDateAdded();

			}
		}
		return cartList;

	}

}
