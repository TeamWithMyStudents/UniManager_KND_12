package ua.knd12.service.impl;

import ua.knd12.model.User;
import ua.knd12.service.StudentService;

import java.util.Arrays;

abstract class UserServiceImpl implements StudentService {
    protected User[]initialArray;

    public UserServiceImpl(User[] initialArray) {
        this.initialArray = initialArray;
    }

    public void add(User u){
        if(initialArray.length==0)
            initialArray=Arrays.copyOf(initialArray,5);

    }
    public void delete(int id){

    }
}