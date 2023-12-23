package com.example.layeredarchitecture.dto;

import java.math.BigDecimal;

public class CustomDTO {

    // select orders.oid,orders.date,orders.customerID,orderdetails.itemCode,orderdetails.qty,orderdetails.unitPrice from orders INNER JOIN orderdetails ON orders.oid = orderdetails.oid;

    private String ordersId;
    private String ordersDate;
    private String customerId;
    private String itemCode;
    private int qty;
    private BigDecimal unitPrice;

    public CustomDTO() {
    }

    public CustomDTO(String ordersId, String ordersDate, String customerId, String itemCode, int qty, BigDecimal unitPrice) {
        this.ordersId = ordersId;
        this.ordersDate = ordersDate;
        this.customerId = customerId;
        this.itemCode = itemCode;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(String ordersId) {
        this.ordersId = ordersId;
    }

    public String getOrdersDate() {
        return ordersDate;
    }

    public void setOrdersDate(String ordersDate) {
        this.ordersDate = ordersDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
}
