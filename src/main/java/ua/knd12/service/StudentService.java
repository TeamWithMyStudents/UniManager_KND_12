package ua.knd12.service;

import ua.knd12.model.Student;

public interface StudentService extends UserService {
    public void findByGroup(String groupName);





    void add(Student student);

    void delete(int id);
}
