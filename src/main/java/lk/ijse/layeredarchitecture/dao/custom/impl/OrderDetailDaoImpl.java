package lk.ijse.layeredarchitecture.dao.custom.impl;

import lk.ijse.layeredarchitecture.dao.SqlUtil;
import lk.ijse.layeredarchitecture.dao.custom.OrderDetailDAO;
import lk.ijse.layeredarchitecture.dto.OrderDetailDTO;

import java.sql.*;
import java.util.ArrayList;

public class OrderDetailDaoImpl implements OrderDetailDAO {

    public boolean saveOrderDetail(String orderId, OrderDetailDTO detail) throws SQLException, ClassNotFoundException {

        return SqlUtil.execute("INSERT INTO orderdetails (oid, itemCode, unitPrice, qty) VALUES (?,?,?,?)",orderId,detail.getItemCode(),detail.getUnitPrice(),detail.getQty());

    }

    @Override
    public ArrayList getAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean save(Object customerDTO) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean update(Object dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean exist(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public String genarateID() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public Object search(String id) throws SQLException, ClassNotFoundException {
        return null;
    }
}
