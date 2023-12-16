package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ItemDaoImpl {



    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getDbConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT * FROM Item");
        ArrayList<ItemDTO> itemList = new ArrayList<>();

        while (rst.next()) {
            ItemDTO itemDTO = new ItemDTO(
            rst.getString("code"),
            rst.getString("description"),
            rst.getString("unitPrice"),
            rst.getString("qtyOnHand"));

            itemList.add(itemDTO);
        }
        return itemList;
    }
}
