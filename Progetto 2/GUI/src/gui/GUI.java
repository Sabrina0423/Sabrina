/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author STUDIO
 */
public  class GUI extends Application {
   
     @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Scene scene=new Scene(root);
        
        primaryStage.setTitle("GUIz");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
         // Ripristina le impostazioni di default ad ogni esecuzione
        launch(args);
    }
}

    
  
    

