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
public class ImpostazioniPartitaController implements Initializable {

    @FXML
    private VBox home;
    @FXML
    private Text text2;
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
    private Button indietro;
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
    @FXML
    private Button iniziaPartita;
    
    int cont=1;
    
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        togliGiocatore.setVisible(false);
    }    

    @FXML
    private void togliGiocatore(ActionEvent event) {
        cont --;
        switch (this.cont) {
            case 1:
                giocatore2.setVisible(false);
                break;
            case 2:
                giocatore3.setVisible(false);
                break;
            case 3:
                giocatore4.setVisible(false);
                break;
            default: 
                break;
        
        }
        if(cont==1){
            togliGiocatore.setVisible(false);
            aggiungiGiocatore.setVisible(true);
        }
        
        else {  
            togliGiocatore.setVisible(true);
            aggiungiGiocatore.setVisible(true);
        }
        
    }

    @FXML
    private void aggiungiGiocatore(ActionEvent event) {
        cont ++;
        switch (this.cont) {
            case 2:
                giocatore2.setVisible(true);
                break;
            case 3:
                giocatore3.setVisible(true);
                break;
            case 4:
                giocatore4.setVisible(true);
                break;
            default: 
                break;
        
        }
        if(cont==4){
            togliGiocatore.setVisible(true);
            aggiungiGiocatore.setVisible(false);
        }
        else {  
            aggiungiGiocatore.setVisible(true);
            togliGiocatore.setVisible(true);
            
        }
        
        
        

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
    private void indietro(ActionEvent event) throws IOException {
        Stage stage=new Stage();
       FXMLLoader loader=new FXMLLoader(getClass().getResource("home.fxml"));
       Parent root= (Parent) loader.load();
       
       Scene scene=new Scene(root);
       stage.setScene(scene);
       stage.setTitle("QUIZ");
       stage.show();
    }
    
    @FXML
    private void iniziaPartita(ActionEvent event) throws IOException {
        Stage stage=new Stage();
       FXMLLoader loader=new FXMLLoader(getClass().getResource("sceltaMultipla.fxml"));
       Parent root= (Parent) loader.load();
       
       Scene scene=new Scene(root);
       stage.setScene(scene);
       stage.setTitle("QUIZ");
       stage.show();
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
