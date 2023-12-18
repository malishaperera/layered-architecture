package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.*;
import java.time.LocalDate;

public class OrdersDaoImpl implements OrdersDAO{
    public boolean isExists(String orderId) throws SQLException, ClassNotFoundException {
      /* Connection connection = DBConnection.getDbConnection().getConnection();

        PreparedStatement stm = connection.prepareStatement("SELECT oid FROM `orders` WHERE oid=?");
        stm.setString(1, orderId);
        return stm.executeQuery() != null;*/

        ResultSet resultSet=  SqlUtil.execute("SELECT oid FROM `orders` WHERE oid=?",orderId);
        System.out.println(resultSet);
        return resultSet.next();

       // return SqlUtil.execute("SELECT oid FROM `orders` WHERE oid=?",orderId);
      }

    public boolean saveOder(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException {
       /* Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement pstm = connection.prepareStatement("INSERT INTO `orders` (oid, date, customerID) VALUES (?,?,?)");
        pstm.setString(1,orderId);
        pstm.setDate(2, Date.valueOf(orderDate));
        pstm.setString(3,customerId);

        return pstm.executeUpdate() >0;*/
       return   SqlUtil.execute("INSERT INTO `orders` (oid, date, customerID) VALUES (?,?,?)",orderId,orderDate,customerId);

    }

    public String generateNextOrderId() throws SQLException, ClassNotFoundException {
       /* Connection connection = DBConnection.getDbConnection().getConnection();

        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT oid FROM `orders` ORDER BY oid DESC LIMIT 1;");*/

        ResultSet rst = SqlUtil.execute("SELECT oid FROM `orders` ORDER BY oid DESC LIMIT 1;");

        if (rst.next()) return rst.getString(1);

        return null;

    }
}
