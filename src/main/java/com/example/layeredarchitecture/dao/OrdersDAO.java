package com.example.layeredarchitecture.dao;

import java.sql.SQLException;
import java.time.LocalDate;

public interface OrdersDAO {
     boolean isExists(String orderId) throws SQLException, ClassNotFoundException;

    boolean saveOder(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException;

}
