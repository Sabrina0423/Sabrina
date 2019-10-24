/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author STUDIO
 */
public class RegoleController implements Initializable {

    @FXML
    private VBox home;
    @FXML
    private Text text;
    @FXML
    private Button indietro;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
   @FXML
    private void indietro(ActionEvent indietro) throws IOException {
       Stage stage=new Stage();
       FXMLLoader loader=new FXMLLoader(getClass().getResource("home.fxml"));
       Parent root= (Parent) loader.load();
       
       Scene scene=new Scene(root);
       stage.setScene(scene);
       stage.setTitle("Regole");
       stage.show();
    }
}
    

