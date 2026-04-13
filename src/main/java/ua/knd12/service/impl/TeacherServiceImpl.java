package ua.knd12.service.impl;

import ua.knd12.model.Teacher;
import ua.knd12.model.User;
import ua.knd12.service.TeacherService;

public class TeacherServiceImpl extends UserServiceImpl implements TeacherService {

    public TeacherServiceImpl(User[] initialArray) {
        super(initialArray);
    }

    @Override
    public void add(User user) {
        Teacher t = (Teacher) user;
        if (t.getSalary() < 0) {
            System.out.println("Зарплата не може бути мінусовою!");
        } else {
            super.add(user);
            System.out.println("Викладач доданий успішно!");
        }
    }

    @Override
    public void calculateTotalSalary() {
        double suma = 0;
        for (int i = 0; i < counter; i++) {
            if (initialArray[i] instanceof Teacher) {
                Teacher t = (Teacher) initialArray[i];
                suma = suma + t.getSalary();
            }
        }
        System.out.println("Загальний бюджет зарплат: " + suma);
    }

    @Override
    public void filterByDegree(String degree) {
        System.out.println("Результати пошуку для '" + degree + "':");
        boolean found = false;

        for (int i = 0; i < counter; i++) {
            if (UserServiceImpl.initialArray[i] instanceof Teacher) {
                Teacher t = (Teacher) UserServiceImpl.initialArray[i];

                if (t.getDegree().equalsIgnoreCase(degree)) {
                    System.out.println(t.getName() + " " + t.getSurname() + " (" + t.getDegree() + ") - " + t.getSalary());
                    found = true;
                }
            }
        }
        if (!found) System.out.println("Викладачів не знайдено.");
    }
}