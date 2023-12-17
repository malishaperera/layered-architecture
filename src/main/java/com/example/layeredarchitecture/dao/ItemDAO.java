package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {
    ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException ;


    boolean saveItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;

     void deleteCustomer(String code) throws SQLException, ClassNotFoundException ;

    boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException ;

    boolean existCustomer(String code) throws SQLException, ClassNotFoundException ;

    String genarateID() throws SQLException, ClassNotFoundException;

    ItemDTO searchItem(String newItemCode) throws SQLException, ClassNotFoundException ;

}
