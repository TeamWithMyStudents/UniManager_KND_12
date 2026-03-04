package ua.knd12.controller;

import ua.knd12.model.User;

import java.util.Arrays;

public class StudentController {
    protected static User[]initialArray;
    private int counter = 0;

    public StudentController(User[] initialArray) {
        this.initialArray = initialArray;
    }


    public void add(User u) {

        int newSize = (initialArray.length*2)+1;
        if (initialArray.length<=counter) {
            initialArray = Arrays.copyOf(initialArray, newSize);
        }
        initialArray[counter] = u;
        counter++;
    }

    public void delete(int id) {
        for (int i=0;i<initialArray.length;i++) {
            if(initialArray[i].getId()==id) {
                initialArray[initialArray.length-1] = initialArray[i];
                initialArray[i] = null;
                counter--;
            }
        }
    }

    public static User[] getInitialArray() {
        return initialArray;
    }
}