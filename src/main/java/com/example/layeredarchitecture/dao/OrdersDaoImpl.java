package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class OrdersDaoImpl implements OrdersDAO{
    public boolean isExists(String orderId) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getDbConnection().getConnection();

        PreparedStatement stm = connection.prepareStatement("SELECT oid FROM `orders` WHERE oid=?");
        stm.setString(1, orderId);

        return stm.executeQuery() != null;
    }

    public boolean saveOder(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement pstm = connection.prepareStatement("INSERT INTO `orders` (oid, date, customerID) VALUES (?,?,?)");
        pstm.setString(1,orderId);
        pstm.setDate(2, Date.valueOf(orderDate));
        pstm.setString(3,customerId);

        return pstm.executeUpdate() >0;
    }
}
