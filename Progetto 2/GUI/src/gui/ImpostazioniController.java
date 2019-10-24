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
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author STUDIO
 */
public class ImpostazioniController implements Initializable {

    @FXML
    private VBox domande1;
    @FXML
    private Text text31;
    @FXML
    private RadioButton facile1;
    @FXML
    private ToggleGroup difficultylevel1;
    @FXML
    private RadioButton medio1;
    @FXML
    private RadioButton difficile1;
    @FXML
    private Button avviaPartita;
    @FXML
    private VBox domande;
    @FXML
    private Text text3;
    @FXML
    private RadioButton uno;
    @FXML
    private ToggleGroup numerogiocatori;
    @FXML
    private RadioButton due;
    @FXML
    private RadioButton quattro;
    @FXML
    private RadioButton tre;
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
    private void avviaPartita(ActionEvent avviaPartita) throws IOException {
        
       Stage stage=new Stage();
       FXMLLoader loader=new FXMLLoader(getClass().getResource("rispostaAperta.fxml"));
       Parent root= (Parent) loader.load();
       
       Scene scene=new Scene(root);
       stage.setScene(scene);
       stage.setTitle("QUIZ");
       stage.show();
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
}
    

