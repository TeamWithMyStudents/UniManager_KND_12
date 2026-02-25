package ua.knd12.service.impl;

import ua.knd12.model.User;
import ua.knd12.service.UserService;


abstract class UserServiceImpl implements UserService {
    protected User[]initialArray;

    public UserServiceImpl(User[] initialArray) {
        this.initialArray = initialArray;
    }

    public void add(User u){
        int counter = 1;

    }
    public void delete(int id){

    }
}