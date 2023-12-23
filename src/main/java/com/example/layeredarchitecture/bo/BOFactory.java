package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.bo.custom.impl.CustomerBOImpl;
import com.example.layeredarchitecture.bo.custom.impl.ItemBOImpl;
import com.example.layeredarchitecture.bo.custom.impl.PlaceOrderBOImpl;

public class BOFactory {

    private static BOFactory boFactory;

    private BOFactory(){

    }

    public static BOFactory getDaoFactory(){
        return (boFactory == boFactory)?boFactory = new BOFactory():boFactory;
    }

    public enum BOTypes{
        Customer,Item,PlaceOrder

    }

    public SuperBO getBO(BOTypes boTypes){
        switch (boTypes){
            case Customer:
                return new CustomerBOImpl();

            case Item :
                return new ItemBOImpl();

            case PlaceOrder:
                return new PlaceOrderBOImpl();

            default:
                return null;

        }
    }
}


