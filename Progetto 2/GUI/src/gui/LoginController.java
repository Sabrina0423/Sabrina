/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

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
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author STUDIO
 */
public class LoginController implements Initializable {

    @FXML
    private VBox home;
    @FXML
    private Text text2;
    @FXML
    private Button indietro;
    @FXML
    private Button togliGiocatore;
    @FXML
    private Button aggiungiGiocatore;
    @FXML
    private TextField giocatore1;
    @FXML
    private TextField giocatore2;
    @FXML
    private TextField giocatore3;
    @FXML
    private TextField giocatore4;
    @FXML
    private Text text21;
    @FXML
    private RadioButton facile;
    @FXML
    private ToggleGroup difficoltaDomande;
    @FXML
    private RadioButton medio;
    @FXML
    private RadioButton difficile;
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
       stage.setTitle("QUIZ");
       stage.show();
    }

    @FXML
    private void togliGiocatore(ActionEvent event) {
    }

    @FXML
    private void aggiungiGiocatore(ActionEvent event) {
    }

    @FXML
    private void giocatore1(ActionEvent event) {
    }

    @FXML
    private void giocatore2(ActionEvent event) {
    }

    @FXML
    private void giocatore3(ActionEvent event) {
    }

    @FXML
    private void giocatore4(ActionEvent event) {
    }

    @FXML
    private void facile(ActionEvent event) {
    }

    @FXML
    private void medio(ActionEvent event) {
    }

    @FXML
    private void difficile(ActionEvent event) {
    }
}
