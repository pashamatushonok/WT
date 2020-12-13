package by.Pavel.restaurant.model.dao;

import by.Pavel.restaurant.model.exception.DAOException;
import by.Pavel.restaurant.model.beans.Category;
import by.Pavel.restaurant.model.beans.Dish;

import java.util.List;

public interface IDishDAO {
    List<Dish> findItemsByCategory(int categoryID) throws DAOException;
    List<Category> getCategories() throws DAOException;
    Dish getItem(int itemId) throws DAOException;
}
