package ua.knd12.service.impl;

import ua.knd12.model.Student;
import ua.knd12.model.User;
import ua.knd12.service.StudentService;

public class StudentServiceImpl extends UserServiceImpl implements StudentService {
    public StudentServiceImpl() {
        super(new Student[10]);
    }

    @Override
    public void findByGroup(String groupName) {
        boolean find = false;
        if (groupName == null) {
            System.out.println("Назва групи не може бути порожньою");
            return;
        }

        for (User user : initialArray) {
            if (user instanceof Student) {
                Student student = (Student) user;
                if (student.getGroup().equals(groupName)) {
                    System.out.println(student);
                    find = true;
                }
            }
        }
        if (!find) {
            System.out.println("Немає студентів в групі");
        }

    }
    /**
     * Додає студента до загального списку користувачів.
     * об'єкт студента кодребіт просить додавати коментарі  >:\
     */
    @Override
    public void add(Student student) {
        super.add(student);
    }
    /**
     * Видаляє студента за ідентифікатором.
     *
     */
    @Override
    public void delete(int id) {
        super.delete(id);
    }
}




