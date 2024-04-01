package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ExpertModifController {

   private Parent root;
    private Scene scene;
    private Stage stage;


    public void ModifierRegle_final(ActionEvent event)throws IOException {
        
         root = FXMLLoader.load(getClass().getResource("regleModifiee.fxml"));
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
      }
      public void Regle_res2(ActionEvent event)throws IOException {
        
         root = FXMLLoader.load(getClass().getResource("secondary.fxml"));
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
      }
    
}
