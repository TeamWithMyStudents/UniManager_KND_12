package ua.knd12.service;

import ua.knd12.model.User;

public interface UserService {
    void add(User user);
    void delete(int id);
    void getAll();

}
