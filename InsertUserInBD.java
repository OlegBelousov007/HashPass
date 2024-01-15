package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class InsertUserInBD {
    public static void addUser(User user) {
        String url = "jdbc:mysql://localhost:3306/belousov_login_db.";
        String username = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "INSERT INTO users (user_id, user_name, user_log, user_pass) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, user.getUser_log());
            statement.setString(2, HashPassword.hashPassword(user.getUser_pass()));
            statement.setString(3, user.getUser_name());
            statement.setInt(4, user.getUser_id());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
