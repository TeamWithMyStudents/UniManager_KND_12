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
        if (!(user instanceof Teacher)) {
            System.out.println("Помилка: можна додавати лише викладачів");
            return;
        }

        Teacher t = (Teacher) user;
        if (t.getSalary() < 0) {
            System.out.println("Помилка: Зарплата не може бути мінусовою");
            return;
        }

        super.add(user);
        System.out.println("Викладач доданий успішно!");
    }

    @Override
    public void calculateTotalSalary() {
        double suma = 0;
        for (User user : UserServiceImpl.initialArray) {
            if (user instanceof Teacher) {
                suma += ((Teacher) user).getSalary();
            }
        }
        System.out.println("Загальний бюджет зарплат: " + suma);
    }

    @Override
    public void filterByDegree(String degree) {
        String normalizedDegree = (degree == null) ? "" : degree.trim();

        if (normalizedDegree.isEmpty()) {
            System.out.println("Ступінь для пошуку не може бути порожнім.");
            return;
        }

        System.out.println("Результати пошуку для '" + normalizedDegree + "':");
        boolean found = false;

        for (User user : UserServiceImpl.initialArray) {
            if (user instanceof Teacher) {
                Teacher t = (Teacher) user;
                if (t.getDegree().equalsIgnoreCase(normalizedDegree)) {
                    System.out.println(t.getName() + " " + t.getSurname() + " (" + t.getDegree() + ") - " + t.getSalary());
                    found = true;
                }
            }
        }
        if (!found) System.out.println("Викладачів не знайдено.");
    }
}