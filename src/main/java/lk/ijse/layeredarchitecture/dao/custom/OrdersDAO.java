package lk.ijse.layeredarchitecture.dao.custom;

import lk.ijse.layeredarchitecture.dao.CrudDAO;
import lk.ijse.layeredarchitecture.dto.OrderDTO;

import java.sql.SQLException;
import java.time.LocalDate;

public interface OrdersDAO extends CrudDAO<OrderDTO> {
   /*  boolean isExists(String orderId) throws SQLException, ClassNotFoundException;

    boolean saveOder(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException;

    String generateNextOrderId() throws SQLException, ClassNotFoundException;*/

    boolean saveOder(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException;

}
