package com.example.layeredarchitecture.entity;

public class Customer {

    private String id;
    private String Name;
    private String Address;

    public Customer() {
    }

    public Customer(String id, String name, String address) {
        this.id = id;
        Name = name;
        Address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
