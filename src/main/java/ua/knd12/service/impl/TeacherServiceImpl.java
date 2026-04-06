package ua.knd12.service.impl;

import ua.knd12.model.Teacher;
import ua.knd12.model.User;
import ua.knd12.service.TeacherService;

public class TeacherServiceImpl extends UserServiceImpl implements TeacherService {

    public TeacherServiceImpl(User[] initialArray) {
        super(initialArray);
    }

    @Override
    public void calculateTotalSalary() {

    }

    @Override
    public void filterByDegree(String degree) {

    }
}
