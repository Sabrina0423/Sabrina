/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author elisa
 */
/*QUESTA CLASSE E' UNA LISTA DI DOMANDE, VERIFICA CHE SIANO RM RISPOSTE MULTIPLE
O VF VERE O FALSE
*/
public class Domande {
    //ci stanno sia le domande multiple sia le domande vere o false
    ArrayList<Domanda> domande;
    private int cont = 0;
    
    //metodo che mi legge il mio file csv
    
    public void lettore(String percorsoFile) throws FileNotFoundException, IOException{
        
        BufferedReader csvReader = new BufferedReader(new FileReader(percorsoFile));
        String riga;
        while((riga= csvReader.readLine()) !=null) {
            //dati contengono una lista di campi in un array
            String[] dati = riga.split(";");
            //dati 1 mi legge primo campo rm o vf
            //se è vf
            if(dati[1].equalsIgnoreCase("vf")) {
                //crea  domanda, dati 2 è il campo domande, dati 5 sono le soluzioni
                //gli passo un nuovo figlio di tipo vero falso 
                //che vuole nel costruttore domanda, e soluzione (1 x vero)
                this.domande.add(new VeroFalso(dati[2], dati[5].equals("1")));
            }
            /*else if(dati[1].equalsIgnoreCase("rm")) {
                 String[] risposte = {dati[2], dati[3],dati[4],dati[5]};
                //decodifica )(decode) i la stringa del campo 6 ovvero la soluzione in un int
                this.domande.add(new Multipla(dati[1],risposte,Integer.decode(dati[6])));
            }*/
            else if(dati[1].equalsIgnoreCase("rm")) {
                String[] risposte = {dati[3],dati[4],dati[5],dati[6]};
                this.domande.add(new Multipla(dati[2],risposte,Integer.decode(dati[7])));                
            }
            else if(dati[1].equalsIgnoreCase("ap")){
                String risposta = dati[3];
                this.domande.add(new DomandaAperta(dati[2],dati[7]));
 
            }
            
        }
        csvReader.close();
    }

    /*sopra ho istanziato il posto dove mettere il mio arraylist di domande, 
    nel costruttore lo riempio
    */
    public Domande() {
        this.domande = new ArrayList<Domanda>();
    }
    
    public Domanda next() {
        return this.domande.get(this.cont++);
    }
    
}
