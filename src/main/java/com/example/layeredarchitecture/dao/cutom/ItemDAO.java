package com.example.layeredarchitecture.dao.cutom;

import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO extends CrudDAO<ItemDTO> {

    /*ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException ;


    boolean saveItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;

     boolean deleteItem(String code) throws SQLException, ClassNotFoundException ;

    boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException ;

    boolean existItems(String code) throws SQLException, ClassNotFoundException ;

    String genarateID() throws SQLException, ClassNotFoundException;

    ItemDTO searchItem(String newItemCode) throws SQLException, ClassNotFoundException ;
*/
}