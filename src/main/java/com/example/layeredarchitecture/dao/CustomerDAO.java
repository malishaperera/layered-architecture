package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {

    ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException ;


    boolean saveCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException ;

     boolean updateCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException ;

    void deleteCustomer(String id) throws SQLException, ClassNotFoundException ;

    boolean existCustomer(String id) throws SQLException, ClassNotFoundException ;

    String genarateID() throws SQLException, ClassNotFoundException ;

    CustomerDTO searchCustomer(String id) throws SQLException, ClassNotFoundException;

}
