package ua.knd12.service;

import ua.knd12.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void delete(int id);
    List getAll();

}
