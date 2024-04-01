package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;




public class ExpertAjoutController {

   private Parent root;
   private Scene scene;
   private Stage stage;
   
   @FXML
     public void AjouterRegle_final(ActionEvent event)throws IOException {
        
        root = FXMLLoader.load(getClass().getResource("regleAjoutee.fxml"));
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
     }
     public void Regle_res1(ActionEvent event)throws IOException {
        
      root = FXMLLoader.load(getClass().getResource("secondary.fxml"));
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
   }

   
   
}
