package edu.wsb.piąteSpotkanie;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hyperion on 28.06.17.
 */
public class Programista extends Pracownik {


    HashMap<String,poziomZaawansowania > znaneTechnologie = new HashMap<>();


    Programista(){}

    Programista(String imie, String nazwisko){
        super(imie,nazwisko);
    }

    Programista(String imie, String nazwisko,HashMap<String,poziomZaawansowania> znaneTechnologie){
        this(imie,nazwisko);
        znaneTechnologie.put("Java",poziomZaawansowania.brak);
        znaneTechnologie.put("C#",poziomZaawansowania.brak);
        znaneTechnologie.putAll(znaneTechnologie);
    }

    @Override
    public void wypiszTechnologie(){
        for (Map.Entry<String,poziomZaawansowania> technologie : znaneTechnologie.entrySet()){
            System.out.println(technologie);
        }
    }

    @Override
    public void wyświetlImie() {

    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' + "jest programistą" +
                '}';
    }





}
