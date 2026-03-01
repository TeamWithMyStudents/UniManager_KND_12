package ua.knd12.viewer;

import ua.knd12.controller.StudentController;
import ua.knd12.model.User;

import java.util.Arrays;

public class ApplicationDisplay {
    public void getUsers() {
        for (User user : StudentController.getInitialArray()) {
            if (user!=null)
                System.out.println(user);
        }
    }
}
