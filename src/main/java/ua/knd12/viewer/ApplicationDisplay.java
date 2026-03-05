package ua.knd12.viewer;

import ua.knd12.model.User;
import ua.knd12.service.impl.UserServiceImpl;

public class ApplicationDisplay {
    public void getUsers() {
        for (User user : UserServiceImpl.getInitialArray()) {
            if (user!=null)
                System.out.println(user);
        }
    }
}
