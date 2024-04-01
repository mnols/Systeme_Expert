package com.example;

import java.io.IOException;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class PrimaryController {

    @FXML
    TextField nameText;
    @FXML
    PasswordField passwordField;

    private Parent root;
    private Scene scene;
    private Stage stage;
    @FXML
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String DATABASE_USERNAME = "root";
    private static final String DATABASE_PASSWORD = "";
    private static final String SELECT_QUERY = "SELECT * FROM users WHERE name = ? and password = ?";

    
    @FXML
    private void logIn(ActionEvent event) throws IOException {
        String name = nameText.getText();
        String password = passwordField.getText();

        if (name.isEmpty() || password.isEmpty()) {
            System.out.println("Name or password cannot be empty!");
            return;
        }

        try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_QUERY)) {

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Parent root = FXMLLoader.load(getClass().getResource("secondary.fxml"));
                Scene scene = new Scene(root);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.show();
            } else {
                System.out.println("Invalid credentials!");
            }

        } catch (SQLException | IOException e) {
            e.printStackTrace();
            System.out.println("An error occurred while logging in.");
        }
    }


    @FXML
    private void CreerCompte(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("creationCompte.fxml"));
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void logInn(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("UtilisateurChoix.fxml"));
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    } 
}


