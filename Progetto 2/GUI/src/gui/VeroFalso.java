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
public class VeroFalso extends Domanda {
    //nella view ci saranno di default le risposte vero o falso
    boolean soluzione;

    public boolean isSoluzione() {
        return soluzione;
    }
    //costruttore setta la soluzione, in una domanda la soluzione non cambia mai
    public VeroFalso(String domanda, boolean soluzione) {
        //gli da la domanda dalla classe padre
        super(domanda);
        this.soluzione = soluzione;
        
    }
    
}
