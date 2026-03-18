package ua.knd12;

import ua.knd12.controller.StudentController;
import java.util.Scanner;

public class UniManager {
    static StudentController controller = new StudentController();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- МЕНЮ ---");
            System.out.println("1. Додати студента");
            System.out.println("2. Видалити за ID");
            System.out.println("3. Вихід");
            System.out.print("Вибір: ");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.println("Введіть (Ім'я Прізвище Група):");
                controller.create(scanner.nextLine());
            }
            else if (choice.equals("2")) {
                System.out.print("ID для видалення: ");
                try {
                    int id = Integer.parseInt(scanner.nextLine());
                    controller.delete(id);
                } catch (Exception e) {
                    System.out.println("Помилка: введіть число!");
                }
            }
            else if (choice.equals("3")) {
                System.out.println("Бувай!");
                break;
            }
        }
    }
}