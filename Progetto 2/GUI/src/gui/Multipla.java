/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author elisa
 */
//figlio di domanda
public class Multipla extends Domanda{
    //array di 4 domande
    String risposta[];
    //soluzione a numeri interi
    int soluzione;

    public String[] getRisposta() {
        return risposta;
    }

    public int getSoluzione() {
        return soluzione;
    }
    //costruttore
    public Multipla(String domanda,String[] risposta,int soluzione) {
        //gli da la domanda dal padre
        super(domanda);
        this.risposta=risposta;
        this.soluzione=soluzione;
    }
    
    

}
