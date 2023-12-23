package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.cutom.CustomerDAO;
import com.example.layeredarchitecture.dao.cutom.impl.CustomerDaoImpl;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBOImpl implements CustomerBO {

    CustomerDAO customerDAO = new CustomerDaoImpl();
    @Override
    public boolean saveCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        //customer business logic example
        return customerDAO.save(dto);
    }

    @Override
    public  ArrayList<CustomerDTO>  getAllCustomer() throws SQLException, ClassNotFoundException {
        return  customerDAO.getAll();

    }

    @Override
    public boolean updateCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException{
        return customerDAO.update(dto);
    }

    @Override
   public boolean existCustomer(String id) throws SQLException, ClassNotFoundException {
        return customerDAO.exist(id);
    }

    @Override
    public boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException {
        return customerDAO.delete(id);
    }

    @Override
    public String genarateIDCustomer() throws SQLException, ClassNotFoundException{
        return customerDAO.genarateID();
    }

}
