package com.example.layeredarchitecture.dao.cutom;

import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;

public interface OrderDetailDAO extends CrudDAO {
    boolean saveOrderDetail(String orderId, OrderDetailDTO detail) throws SQLException, ClassNotFoundException;
}
