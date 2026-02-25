package ua.knd12.service.impl;

import ua.knd12.model.Student;
import ua.knd12.model.User;

public class StudentServiceImpl extends UserServiceImpl {
    public StudentServiceImpl() {
        super( new Student[10]);
    }
}
