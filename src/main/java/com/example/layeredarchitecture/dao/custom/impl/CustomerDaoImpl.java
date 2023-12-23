package com.example.layeredarchitecture.dao.custom.impl;

import com.example.layeredarchitecture.dao.SqlUtil;
import com.example.layeredarchitecture.dao.custom.CustomerDAO;
import com.example.layeredarchitecture.dto.CustomerDTO;
import com.example.layeredarchitecture.entity.Customer;

import java.sql.*;
import java.util.ArrayList;

public class CustomerDaoImpl implements CustomerDAO {


    @Override
    public  ArrayList<Customer>  getAll() throws SQLException, ClassNotFoundException {


        ResultSet rst = SqlUtil.execute("SELECT * FROM Customer");

        ArrayList<Customer> allCustomer = new ArrayList<>();

        while (rst.next()){
            Customer entity =new Customer(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3));

            allCustomer.add(entity);
        }
        return allCustomer;
    }

    @Override
    public boolean save(Customer entity) throws SQLException, ClassNotFoundException {

       return SqlUtil.execute("INSERT INTO Customer (id,name, address) VALUES (?,?,?)",entity.getId(),entity.getName(),entity.getAddress());
    }

    @Override
    public boolean update(Customer entity) throws SQLException, ClassNotFoundException {

       return SqlUtil.execute("UPDATE Customer SET name=?, address=? WHERE id=?",entity.getName(),entity.getAddress(),entity.getId());

    }


    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {

       return SqlUtil.execute("DELETE FROM Customer WHERE id=?",id);
    }

    @Override
    public boolean exist(String id) throws SQLException, ClassNotFoundException {


        ResultSet rs = SqlUtil.execute("SELECT id FROM Customer WHERE id=?", id);
        return rs.next();
    }

    @Override
    public String genarateID() throws SQLException, ClassNotFoundException {

        ResultSet rst = SqlUtil.execute("SELECT id FROM Customer ORDER BY id DESC LIMIT 1");
        if (rst.next()) {
            String id = rst.getString("id");
            int newCustomerId = Integer.parseInt(id.replace("C00-", "")) + 1;
            return String.format("C00-%03d", newCustomerId);
        } else {
            return "C00-001";
        }
    }

    @Override
    public Customer search(String id) throws SQLException, ClassNotFoundException {

        ResultSet rst = SqlUtil.execute("SELECT * FROM customer WHERE id=?",id);


        if (rst.next()) {
            return new Customer(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3)
            );
        }

        return null;
    }
}
