package com.example.layeredarchitecture.dao.cutom;

import com.example.layeredarchitecture.model.CustomDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface QueryDAO {

    ArrayList<CustomDTO> customerOrderDetail(CustomDTO customDTO) throws SQLException, ClassNotFoundException;


}
