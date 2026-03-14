package ua.knd12.service.impl;

import ua.knd12.model.Student;
import ua.knd12.model.User;
import ua.knd12.service.StudentService;

public class StudentServiceImpl extends UserServiceImpl implements StudentService {
    public StudentServiceImpl()
    {
        super(new Student[10]);
    }

    @Override
    public void findByGroup(String groupName) {

    }
}



