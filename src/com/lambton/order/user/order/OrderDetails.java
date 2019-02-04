package com.lambton.order.user.order;

import java.util.ArrayList;

public class OrderDetails {

    private int orderId;
    private int productId;
    private String productName;
    private int quantity;
    private float unitCost;
    private float subtotal;

    ArrayList<OrderDetails> orderDetailsList = new ArrayList<OrderDetails>();

    public OrderDetails() {

    }

    public OrderDetails(int orderId, int productId, String productName, int quantity, float unitCost, float subtotal) {

        this.orderId = orderId;
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.unitCost = unitCost;
        this.subtotal = subtotal;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(float unitCost) {
        this.unitCost = unitCost;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public boolean addOrderDetails(OrderDetails od) {
        if (orderDetailsList.isEmpty()) {
            orderDetailsList.add(od);
            return true;

        } else {
            for(OrderDetails orderD : orderDetailsList)
            {
                if(orderD.getOrderId() != od.getOrderId())
                {
                    orderDetailsList.add(od);
                    return true;
                }
                else
                {
                    return false;
                }

            }
            return true;
        }
    }
    public void getOrderDetails()
    {
        for(OrderDetails orderDe : orderDetailsList)
        {
            System.out.println(orderDe.getOrderId() + "  " +
                    orderDe.getProductId() + "  " +
                    orderDe.getProductName());
        }
    }
    public float calcPrice(int quantity, float cost) {
        float total = 0;
        total = quantity * cost;
        return total;
    }
}
