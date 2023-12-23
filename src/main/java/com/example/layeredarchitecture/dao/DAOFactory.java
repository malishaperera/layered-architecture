package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.dao.custom.impl.*;

public class DAOFactory {

    private static DAOFactory daoFactory;
    private DAOFactory(){
    }
    public static DAOFactory getDaoFactory(){
        return (daoFactory==null)?daoFactory =new DAOFactory():daoFactory;
    }
    public enum DAOTypes{
        CUSTOMER,ITEM,ORDER,ORDER_DETAIL,QUERY
    }
    public SuperDAO getDAO(DAOTypes daoTypes){
        switch (daoTypes){
            case CUSTOMER:
                return new CustomerDaoImpl();
            case ITEM:
                return new ItemDaoImpl();
            case ORDER:
                return new OrdersDaoImpl();
            case ORDER_DETAIL:
                return new OrderDetailDaoImpl();
            case QUERY:
                return new QueryDAOImpl();
            default:
                return null;
        }
    }
}
