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

/**
 * FXML Controller class
 *
 * @author STUDIO
 */
public class VeroFalsoController implements Initializable {

    @FXML
    private VBox home;
    @FXML
    private Text textgiocatore;
    @FXML
    private Text textpunteggio;
    @FXML
    private Text textdomanda;
    @FXML
    private Button vero;
    @FXML
    private Button falso;
    @FXML
    private Button prossimaDomanda;
    @FXML
    private Button TerminaGame;

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
    private void True(ActionEvent event) {
    }

    @FXML
    private void False(ActionEvent event) {
    }

    @FXML
    private void NextQuestion(ActionEvent event) {
    }

    @FXML
    private void EndGame(ActionEvent event) {
    }
    
}
