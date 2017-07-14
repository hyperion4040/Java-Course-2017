package edu.wsb.piąteSpotkanie;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by hyperion on 28.06.17.
 */

/*
    Dodajac słowo kluczowe final przy klasie sprawiamy, że to jest klasa ostatnia, żadna
    kolejna nie może po niej dziedziczyć.

    Gdyby oprócz słowa kluczowego final chciałoby się dopisać abstract to od razu
    nam podkreśli na czerwono.
 */
final public class Tester extends Pracownik {
    HashMap<String,poziomZaawansowania > znaneTechnologie = new HashMap<>();
    LinkedList linkedList = new LinkedList();

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
