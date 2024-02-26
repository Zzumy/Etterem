package modell;

import java.util.ArrayList;

public class Asztal {

    private final String asztal;
    private final ArrayList<Etel> rendelesek;

    public Asztal(String asztal, ArrayList<Etel> rendelesek) {
        this.asztal = asztal;
        this.rendelesek = rendelesek;
    }
    
    public String getAsztal() {
        return asztal;
    }

    public ArrayList<Etel> getRendelesek() {
        return rendelesek;
    }

    public void ujRendeles(Etel etel) {
        rendelesek.add(etel);
    }
    
    public int getOsszAr(){
        for (int ix = 0; ix < rendelesek.size(); ix++) {
            System.out.println("sd");
        }
        return 0;
    }

}
