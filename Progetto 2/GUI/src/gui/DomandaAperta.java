/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Lella
 */
public class DomandaAperta extends Domanda{
    String soluzione;

    public DomandaAperta(String domanda, String soluzione) {
        super(domanda);
        this.soluzione=soluzione;
    }
    
}
