package modell;

public class Etel {

    private final String nev;
    private final int ar;

    public Etel(String nev, int ar) {
        this.nev = nev;
        this.ar = ar;
    }

    public String getNev() {
        return nev;
    }

    public int getAr() {
        return ar;
    }

    @Override
    public String toString() {
        return "Etel{" + "nev=" + nev + ", ar=" + ar + '}';
    }

}
