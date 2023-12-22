package com.example.layeredarchitecture.dao.cutom.impl;

import com.example.layeredarchitecture.dao.SqlUtil;
import com.example.layeredarchitecture.dao.cutom.QueryDAO;
import com.example.layeredarchitecture.model.CustomDTO;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class QueryDAOImpl implements QueryDAO {

    // select orders.oid,orders.date,orders.customerID,orderdetails.itemCode,orderdetails.qty,orderdetails.unitPrice from orders INNER JOIN orderdetails ON orders.oid = orderdetails.oid;

    @Override
    public ArrayList<CustomDTO> customerOrderDetail(CustomDTO customDTO) throws SQLException, ClassNotFoundException {

        ResultSet rst = SqlUtil.execute("SELECT orders.oid,orders.date,orders.customerID,orderdetails.itemCode,orderdetails.qty,orderdetails.unitPrice from orders INNER JOIN orderdetails ON orders.oid = orderdetails.oid");

        ArrayList<CustomDTO> customDTOSar = new ArrayList<>();

        while (rst.next()){
            CustomDTO customDTO1 = new CustomDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getInt(5),
                    rst.getBigDecimal(6));

            customDTOSar.add(customDTO);
        }
        return customDTOSar;
    }
}
