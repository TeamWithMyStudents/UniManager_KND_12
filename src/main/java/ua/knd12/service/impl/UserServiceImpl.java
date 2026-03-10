package ua.knd12.service.impl;
import ua.knd12.model.User;
import ua.knd12.service.UserService;

import java.util.Arrays;

public abstract class UserServiceImpl implements UserService {
    protected static User[]initialArray;
    private int counter = 0;

    public UserServiceImpl(User[] initialArray) {
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
        int pos = initialArray.length - 1;
        for (int i = 0; i < initialArray.length; i++) {
            if (initialArray[i].getId() == id) {
                initialArray[pos] = initialArray[i];
                initialArray[i] = null;
                counter--;
                pos--;
            }
        }
    }

    public void getAll() {
        for (User user : UserServiceImpl.getInitialArray()) {
            if (user!=null)
                System.out.println(user);
        }
    }

    public static User[] getInitialArray() {
        return initialArray;
    }
}