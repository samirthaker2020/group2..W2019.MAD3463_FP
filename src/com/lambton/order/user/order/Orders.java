package com.lambton.order.user.order;

import com.lambton.order.user.shipping.ShippingInfo;

import java.util.ArrayList;

public class Orders {

    private int orderId;

    private String dateCreated;

    private String dateShipped;

    private String customerName;

    private String customerId;

    private String status;

    private String shippingId;

    ShippingInfo shipInfo;

    OrderDetails orderDeails;

    ArrayList<Orders> orderList = new ArrayList<Orders>();

    public Orders() {

    }


    public Orders(int orderId, String dateCreated, String dateShipped, String customerName, String customerId,
                  String status, String shippingId, ShippingInfo shipInfo, OrderDetails orderDeails) {

        this.orderId = orderId;
        this.dateCreated = dateCreated;
        this.dateShipped = dateShipped;
        this.customerName = customerName;
        this.customerId = customerId;
        this.status = status;
        this.shippingId = shippingId;
        this.shipInfo = shipInfo;
        this.orderDeails = orderDeails;
    }


    public Orders(int orderId, String dateCreated, String dateShipped, String customerName, String customerId,
                  String status, String shippingId) {

        this.orderId = orderId;
        this.dateCreated = dateCreated;
        this.dateShipped = dateShipped;
        this.customerName = customerName;
        this.customerId = customerId;
        this.status = status;
        this.shippingId = shippingId;

    }


    public Orders(int shippingId, String shippingType, int shippingCost, int shippingRegionId) {
        shipInfo = new ShippingInfo(shippingId, shippingType, shippingCost, shippingRegionId);

    }

    public Orders(int orderId, int productId, String productName, int quantity, float unitCost, float subtotal) {
        orderDeails = new OrderDetails(orderId, productId, productName, quantity, unitCost, subtotal);
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateShipped() {
        return dateShipped;
    }

    public void setDateShipped(String dateShipped) {
        this.dateShipped = dateShipped;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getShippingId() {
        return shippingId;
    }

    public void setShippingId(String shippingId) {
        this.shippingId = shippingId;
    }

    public ShippingInfo getShipInfo() {
        return shipInfo;
    }

    public void setShipInfo(ShippingInfo shipInfo) {
        this.shipInfo = shipInfo;
    }

    public OrderDetails getOrderDeails() {
        return orderDeails;
    }

    public void setOrderDeails(OrderDetails orderDeails) {
        this.orderDeails = orderDeails;
    }


    public ArrayList<Orders> getOrderList() {
        return orderList;
    }


    public void setOrderList(ArrayList<Orders> orderList) {
        this.orderList = orderList;
    }


    public boolean placeOrder(Orders o)
    {
        if(orderList.isEmpty())
        {
            orderList.add(o);
            return true;
        }
        else
        {
            for(Orders order:orderList)
            {
                if(order.getOrderId() != o.getOrderId())
                {
                    orderList.add(o);
                    return true;
                }
            }
        }
        return false;
    }

}

