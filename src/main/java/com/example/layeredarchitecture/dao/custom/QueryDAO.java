package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.SuperDAO;
import com.example.layeredarchitecture.dto.CustomDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface QueryDAO extends SuperDAO {

    ArrayList<CustomDTO> customerOrderDetail(CustomDTO customDTO) throws SQLException, ClassNotFoundException;


}
