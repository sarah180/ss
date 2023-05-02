/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package users.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
  */
public class AcceuilAdminController implements Initializable {

  @FXML
    private Button statBtn;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void openModifInterface3(ActionEvent event) {
        try {
        	
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ListeDesReclamation.fxml"));
            Parent root = loader.load();

            // Show the Modif.fxml interface
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            } catch (IOException ex) {
                ex.printStackTrace();

             }
    }
    
    @FXML
    public void openModifInterface4(ActionEvent event) {
        try {
        	
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ModifierReclamation.fxml"));
            Parent root = loader.load();

            // Show the Modif.fxml interface
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            } catch (IOException ex) {
                ex.printStackTrace();

             }
    }
        @FXML
        public void openModifInterface2(ActionEvent event) {
            try {
                // Load the Modif.fxml file
                FXMLLoader loader = new FXMLLoader(getClass().getResource("AjouterArticle.fxml"));
                Parent root = loader.load();

                // Show the Modif.fxml interface
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
    
}
        public void showStat( ) {
            try {
                // Load the Modif.fxml file
                FXMLLoader loader = new FXMLLoader(getClass().getResource("StatFXML.fxml"));
                Parent root = loader.load();

                // Show the Modif.fxml interface
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
                statBtn.getScene().getWindow().hide();

            } catch (IOException e) {
                e.printStackTrace();
            }
    
}
}
