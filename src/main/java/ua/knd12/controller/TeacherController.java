package ua.knd12.controller;

import ua.knd12.model.Teacher;
import ua.knd12.service.TeacherService;
import ua.knd12.service.impl.TeacherServiceImpl;

public class TeacherController {
    private final TeacherService service = new TeacherServiceImpl(new ua.knd12.model.User[100]);

    public void create(String input) {
        String[] p = input.trim().split("\\s+");
        if (p.length < 5) {
            System.out.println("Помилка: треба 5 параметрів!");
            return;
        }

        try {

            double salary = Double.parseDouble(p[4]);
            Teacher t = new Teacher(p[0], p[1], 0, p[2], p[3], salary);
            service.add(t);
            System.out.println("Викладач доданий успішно!");
        } catch (NumberFormatException e) {
            System.out.println("Помилка: зарплата повинна бути числовим значенням!");
        }
    }

    public void showBudget() {
        System.out.print("Результат розрахунку: ");
        service.calculateTotalSalary();
    }
}