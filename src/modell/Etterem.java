package modell;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Etterem {

    private final ArrayList<Asztal> asztalok;
    private final ArrayList<Etel> etlap;

    public Etterem(ArrayList<Asztal> asztalok, ArrayList<Etel> etlap) {
        this.asztalok = asztalok;
        this.etlap = etlap;
    }

    public ArrayList<Asztal> getAsztalok() {
        return asztalok;
    }

    public ArrayList<Etel> getEtlap() {
        return etlap;
    }

    public void etlapotFajlbolFeltolt() throws IOException{
        Path fajl = new Path("etelek.txt");
        List<String> sorok = Files.readAllLines(fajl);
        for (String sor : sorok) {
            String[] vagottSor = sor.split("\\|");
            String etelNev = vagottSor[0];
            int etelAr = Integer.parseInt(vagottSor[1]);
            Etel etel = new Etel(etelNev, etelAr);
            etlap.add(etel);
        }
        
    }

    public void rendeleseketFajlbolfeltolt() {

    }

    private Etel eteltKivalaszt(String etelNeve) {
        return null;
    }

    public void etlapiEtelek() {
        Etel babGulyas = new Etel("Babgulyás", 700);
        Etel gyumolcsLeves = new Etel("Gyümölcsleves", 800);
        Etel rantottSajt = new Etel("Rántottsajt", 900);
        Etel becsiSzelet = new Etel("Bécsi szelet", 1200);
        Etel somloiGaluska = new Etel("Somlói galuska", 500);
        etlap.add(0, babGulyas);
    }
}
