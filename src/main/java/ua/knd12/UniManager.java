package ua.knd12;

import ua.knd12.controller.StudentController;
import ua.knd12.controller.TeacherController; // Додали новий контролер
import java.util.Scanner;

public class UniManager {
    static StudentController studentController = new StudentController();
    static TeacherController teacherController = new TeacherController();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- ГОЛОВНЕ МЕНЮ ---");
            System.out.println("1. Студенти");
            System.out.println("2. Викладачі");
            System.out.println("3. Вихід");
            System.out.print("Вибір: ");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                runStudentMenu();
            }
            else if (choice.equals("2")) {
                runTeacherMenu();
            }
            else if (choice.equals("3")) {
                System.out.println("Бувай!");
                break;
            }
        }
    }

    private static void runStudentMenu() {
        while (true) {
            System.out.println("\n--- МЕНЮ СТУДЕНТІВ ---");
            System.out.println("1. Додати студента");
            System.out.println("2. Видалити за ID");
            System.out.println("0. Назад");
            System.out.print("Вибір: ");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.println("Введіть (Ім'я Прізвище Група):");
                studentController.create(scanner.nextLine());
            } else if (choice.equals("2")) {
                System.out.print("ID для видалення: ");
                try {
                    studentController.delete(Integer.parseInt(scanner.nextLine()));
                } catch (Exception e) {
                    System.out.println("Помилка: введіть число!");
                }
            } else if (choice.equals("0")) {
                break;
            }
        }
    }


    private static void runTeacherMenu() {
        while (true) {
            System.out.println("\n--- МЕНЮ ВИКЛАДАЧІВ ---");
            System.out.println("1. Додати викладача");
            System.out.println("2. Показати бюджет зарплат");
            System.out.println("3. Пошук за ступенем");
            System.out.println("0. Назад");
            System.out.print("Вибір: ");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.println("Введіть (Ім'я Прізвище Кафедра Ступінь Зарплата):");
                teacherController.create(scanner.nextLine());
            } else if (choice.equals("2")) {
                teacherController.showBudget();
            }else if (choice.equals("3")) { // Нова логіка перевірки
                System.out.print("Введіть ступінь для пошуку (наприклад, PhD): ");
                String degree = scanner.nextLine();
                teacherController.filter(degree);
            }else if (choice.equals("0")) {
                break;
            }
        }
    }
}