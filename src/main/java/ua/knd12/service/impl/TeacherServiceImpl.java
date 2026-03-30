package ua.knd12.service.impl;

import ua.knd12.model.Teacher;
import ua.knd12.model.User;
import ua.knd12.service.TeacherService;

public class TeacherServiceImpl extends UserServiceImpl implements TeacherService {
    private Teacher[]teachers;

    public TeacherServiceImpl(User[] initialArray, Teacher[]teachers) {
        super(initialArray);
        this.teachers = teachers;
    }

    @Override
    public void calculateTotalSalary() {

    }

    @Override
    public void filterByDegree(String degree) {

    }
}
