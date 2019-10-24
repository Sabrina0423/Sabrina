/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author STUDIO
 */
public class SceltaMultiplaController implements Initializable {

@FXML
    private VBox home;

    @FXML
    private Text textgiocatore;

    @FXML
    private Text textpunteggio;

    @FXML
    private Text textdomanda;

    @FXML
    private Label campoDomanda;

    @FXML
    private RadioButton A;

    @FXML
    private ToggleGroup rispostaMultipla;

    @FXML
    private RadioButton B;

    @FXML
    private RadioButton C;

    @FXML
    private RadioButton D;

    @FXML
    private Button prossimaDomanda;

    @FXML
    private Button vero;

    @FXML
    private Button falso;

    @FXML
    private Button prossimaDomanda1;

    @FXML
    private TextField rispostaAperta;

    @FXML
    private Button prossimaDomanda2;

    @FXML
    private Button terminaPartita;


    private Domande dom;
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        this.dom = new Domande();
        
        try {
            this.dom.lettore("domandefacili.txt");
            //questo next ogni volta che viene chiamato salta fuori domanda diversa
            Domanda current = this.dom.next();
            //chiama la domanda attuale
            this.campoDomanda.setText(current.getDomanda());
            
            
        } catch (IOException ex) {
            System.out.println("Errore di lettura file");
        }
    }    

    @FXML
    private void NextQuestion(ActionEvent event) {
        
    }

    @FXML
    private void EndGame(ActionEvent event) {
    }
        @FXML
    void False(ActionEvent event) {

    }
    
    @FXML
    void True(ActionEvent event) {

    }

    @FXML
    void sceltaAperta(ActionEvent event) {

    }

    @FXML
    void terminaPartita(ActionEvent event) {

    }

    
}
