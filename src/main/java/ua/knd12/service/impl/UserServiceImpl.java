package ua.knd12.service.impl;

import ua.knd12.model.User;
import ua.knd12.service.UserService;

import java.util.Arrays;


abstract class UserServiceImpl implements UserService {
    protected User[]initialArray;

    public UserServiceImpl(User[] initialArray) {
        this.initialArray = initialArray;
    }

    public void add(User u){
        int counter = 0;
        int newSize = 0;
        if (initialArray.length<=counter)
            newSize = (initialArray.length*2)+1;
            initialArray = Arrays.copyOf(initialArray,newSize);
            initialArray[counter] = u;
    }
    public void delete(int id){

    }
}