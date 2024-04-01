package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.stage.Stage;



public class SecondaryController {

    private Parent root;
    private Scene scene;
    private Stage stage;

    @FXML
    private void AjouterRegle(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ExpertAjouter.fxml"));
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void ModifierRegle(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ExpertModifier.fxml"));
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void SupprimerRegle(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ExpertSupprimer.fxml"));
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void Quitter(ActionEvent event) throws IOException {
        App.setRoot("primary");root = FXMLLoader.load(getClass().getResource("primary.fxml"));
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}