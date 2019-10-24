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
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
/**
 * FXML Controller class
 *
 * @author STUDIO
 */
public class homeController implements Initializable {

    @FXML
    private VBox home;
    @FXML
    private Button admin;
    @FXML
    private MenuButton quiz;
    @FXML
    private MenuItem gioco;
    @FXML
    private MenuItem regole;
    @FXML
    private MenuButton help;
    @FXML
    private Text text;
    @FXML
    private Button inizia;

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
    private void inizia(ActionEvent inizia) throws IOException {
       Stage stage=new Stage();
       FXMLLoader loader=new FXMLLoader(getClass().getResource("impostazioniPartita.fxml"));
       Parent root= (Parent) loader.load();
       
       Scene scene=new Scene(root);
       stage.setScene(scene);
       stage.setTitle("Impostazioni partita");
       stage.show();
    }
    
    @FXML
    private void regole(ActionEvent regole) throws IOException {
       Stage stage=new Stage();
       FXMLLoader loader=new FXMLLoader(getClass().getResource("regole.fxml"));
       Parent root= (Parent) loader.load();
       
       Scene scene=new Scene(root);
       stage.setScene(scene);
       stage.setTitle("Regole");
       stage.show();
    }
    
    @FXML
    private void admin(ActionEvent admin) throws IOException {
       Stage stage=new Stage();
       FXMLLoader loader=new FXMLLoader(getClass().getResource("login.fxml"));
       Parent root= (Parent) loader.load();
       
       Scene scene=new Scene(root);
       stage.setScene(scene);
       stage.setTitle("Admin");
       stage.show();
    }
    
}
