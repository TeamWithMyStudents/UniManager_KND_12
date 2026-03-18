package ua.knd12.controller;

import ua.knd12.model.Student;
import ua.knd12.service.StudentService;
import ua.knd12.service.impl.StudentServiceImpl;

public class StudentController {
    private final StudentService service = new StudentServiceImpl();

    public void create(String input) {
        String[] parts = input.trim().split("\\s+");

        if (parts.length < 3) {
            System.out.println("Помилка: треба ввести мінімум 3 параметри (Ім'я Прізвище Група)");
            return;
        }

        Student student = new Student(parts[0], parts[1], parts[2]);
        service.add(student);
        System.out.println("Студент успішно доданий!");
    }

    public void delete(int id) {
        service.delete(id);
        System.out.println("Студент з ID " + id + " видалений.");
    }
}