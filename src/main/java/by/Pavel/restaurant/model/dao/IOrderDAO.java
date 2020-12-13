package by.Pavel.restaurant.model.dao;

import by.Pavel.restaurant.model.exception.DAOException;
import by.Pavel.restaurant.model.beans.Order;

public interface IOrderDAO {
    int createEmptyOrder(int userId) throws DAOException;
    void addItem(int orderId, int itemId, int count) throws DAOException;
    void deleteItem(int orderId, int itemId) throws DAOException;
    Order getOrder(int orderId) throws DAOException;
    int getCurrentOrderId(int userId) throws DAOException;
    void confirmOrder(Order order) throws DAOException;
}
