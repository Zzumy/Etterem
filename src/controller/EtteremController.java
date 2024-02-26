package controller;

import modell.Asztal;
import modell.Etel;
import modell.Etterem;
import view.Nezet;

public class EtteremController {
    private final Nezet nezet;
    private final Asztal asztal;
    private final Etel etel;
    private final Etterem etterem;

    public EtteremController(Nezet nezet, Asztal asztal, Etel etel, Etterem etterem) {
        this.nezet = nezet;
        this.asztal = asztal;
        this.etel = etel;
        this.etterem = etterem;
    }
    
    public void teszt(){
        
    }
    
    
}
