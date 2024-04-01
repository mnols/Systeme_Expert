package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ExpertSuppController {
    
   private Parent root;
    private Scene scene;
    private Stage stage;

    public void SupprimerRegle_final(ActionEvent event)throws IOException {
        
         root = FXMLLoader.load(getClass().getResource("regleSupprimee.fxml"));
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
      }
      public void Regle_res3(ActionEvent event)throws IOException {
        
         root = FXMLLoader.load(getClass().getResource("secondary.fxml"));
         scene = new Scene(root);
         stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         stage.setScene(scene);
         stage.show();
            }
}
