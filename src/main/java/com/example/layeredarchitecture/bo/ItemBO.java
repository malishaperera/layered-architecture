package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemBO {

     boolean saveItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;

     ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException;

     boolean deleteItem(String code) throws SQLException, ClassNotFoundException;

     boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException;

     boolean existItem(String code) throws SQLException, ClassNotFoundException;

     String genarateIDItem() throws SQLException, ClassNotFoundException;
     ItemDTO searchItem(String newItemCode) throws SQLException, ClassNotFoundException;
}
