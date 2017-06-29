package edu.wsb.piąteSpotkanie;

import java.util.HashMap;

/**
 * Created by hyperion on 28.06.17.
 */
public class Tester extends Pracownik {
    HashMap<String,poziomZaawansowania > znaneTechnologie = new HashMap<>();


    @Override
    public void wypiszTechnologie(){
        for (HashMap.Entry<String,poziomZaawansowania> technologie :
                znaneTechnologie.entrySet()){
            System.out.println(technologie);
        }

    }

    @Override
    public void wyświetlImie() {

    }

    public void wyświetlNazwisko(){
        System.out.println(nazwisko);
    }

}
