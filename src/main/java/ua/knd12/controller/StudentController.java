package ua.knd12.controller;

import ua.knd12.model.User;

import java.util.Arrays;

public class StudentController {
    protected User[]initialArray;

    public StudentController(User[] initialArray) {
        this.initialArray = initialArray;
    }


    public void add(User u) {
        int counter = 0;
        int newSize = (initialArray.length*2)+1;
        if (initialArray.length<=counter) {
            initialArray = Arrays.copyOf(initialArray, newSize);
        }
        initialArray[counter] = u;
        counter++;
    }

    public void delete(int id) {
    }
}
