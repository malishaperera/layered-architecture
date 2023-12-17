package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.*;

public class OrderDetailDaoImpl implements OrderDetailDAO{

    public boolean saveOrderDetail(String orderId, OrderDetailDTO detail) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement pstm = connection.prepareStatement("INSERT INTO orderdetails (oid, itemCode, unitPrice, qty) VALUES (?,?,?,?)");

        pstm.setString(1,orderId);
        pstm.setString(2,detail.getItemCode());
        pstm.setBigDecimal(3,detail.getUnitPrice());
        pstm.setInt(4,detail.getQty());

        return pstm.executeUpdate() >0;
    }

}
