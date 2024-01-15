package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class HellowUser {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = scanner.nextLine();

        if (checkLoginExist(login)) {
            System.out.print("Введите пароль: ");
            String password = scanner.nextLine();

            while (!checkPassword(login, password)) {
                System.out.println("Неверный пароль");
                System.out.print("Повторите ввод пароля: ");
                password = scanner.nextLine();
            }

            String name = getNameFromDatabase(login);
            System.out.println("Привет, " + name);
        } else {
            System.out.println("Логин не найден");
        }
    }

    private static boolean checkLoginExist(String login) throws ClassNotFoundException, SQLException {
        // Проверка наличия логина в базе данных и возврат true или false
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/belousov_login_db.","postgres", "admin");

        return false;
    }

    private static boolean checkPassword(String login, String password) {
        // Проверка правильности пароля и возврат true или false

        return false;
    }

    private static String getNameFromDatabase(String login) {
        // Получение имени пользователя из базы данных

        return "Имя пользователя";
    }
}
