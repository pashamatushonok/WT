package by.Pavel.restaurant.model.service;

import by.Pavel.restaurant.model.beans.User;
import by.Pavel.restaurant.model.exception.ServiceException;
import by.Pavel.restaurant.model.exception.ServiceUserAlreadyExistsException;

import java.util.Date;

public interface IUserService {
    boolean registration(String login, byte[] password, String name, String surname, String email, String phone, Date birthDate, int roleId) throws ServiceException, ServiceUserAlreadyExistsException;
    User signIn (String login, byte[] password) throws ServiceException;
}
