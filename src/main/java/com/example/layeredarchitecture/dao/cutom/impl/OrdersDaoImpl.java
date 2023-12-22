package com.example.layeredarchitecture.dao.cutom.impl;

import com.example.layeredarchitecture.dao.SqlUtil;
import com.example.layeredarchitecture.dao.cutom.OrdersDAO;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class OrdersDaoImpl implements OrdersDAO {
    @Override
    public ArrayList<OrderDTO> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean save(OrderDTO customerDTO) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean update(OrderDTO dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    public boolean exist(String orderId) throws SQLException, ClassNotFoundException {


        ResultSet resultSet=  SqlUtil.execute("SELECT oid FROM `orders` WHERE oid=?",orderId);
        System.out.println(resultSet);
        return resultSet.next();


      }
      @Override
    public boolean saveOder(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException {

       return   SqlUtil.execute("INSERT INTO `orders` (oid, date, customerID) VALUES (?,?,?)",orderId,orderDate,customerId);

    }

    public String genarateID() throws SQLException, ClassNotFoundException {


        ResultSet rst = SqlUtil.execute("SELECT oid FROM `orders` ORDER BY oid DESC LIMIT 1;");

        if (rst.next()) return rst.getString(1);

        return null;

    }

    @Override
    public OrderDTO search(String id) throws SQLException, ClassNotFoundException {
        return null;
    }
}
