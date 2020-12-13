package by.Pavel.restaurant.model.service;

import by.Pavel.restaurant.model.beans.Category;
import by.Pavel.restaurant.model.beans.Dish;
import by.Pavel.restaurant.model.exception.ServiceException;

import java.util.List;

public interface IDishService {
    List<Dish> getItemsByCategory(int categoryId) throws ServiceException;
    List<Category> getCategories() throws ServiceException;
    Dish getItem(int itemId) throws ServiceException;
}
