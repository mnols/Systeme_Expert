package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UtilisateurController {

    private Parent root;
    private Scene scene;
    private Stage stage;

    
    @FXML
    public void ValiderChoix(ActionEvent event)throws IOException {
        
        root = FXMLLoader.load(getClass().getResource("UtilisateurDiag.fxml"));
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
      }

      @FXML
      public void Retourner(ActionEvent event)throws IOException {
        
         root = FXMLLoader.load(getClass().getResource("UtilisateurChoix.fxml"));
         scene = new Scene(root);
         stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         stage.setScene(scene);
         stage.show();
     }
     @FXML
     public void QuitterUtil(ActionEvent event)throws IOException {
        
      root = FXMLLoader.load(getClass().getResource("primary.fxml"));
      scene = new Scene(root);
      stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.setScene(scene);
      stage.show();

   
}
}