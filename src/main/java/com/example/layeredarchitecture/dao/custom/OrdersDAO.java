package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.SQLException;
import java.time.LocalDate;

public interface OrdersDAO extends CrudDAO<OrderDTO> {
   /*  boolean isExists(String orderId) throws SQLException, ClassNotFoundException;

    boolean saveOder(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException;

    String generateNextOrderId() throws SQLException, ClassNotFoundException;*/

    boolean saveOder(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException;

}
