package edu.wsb.piąteSpotkanie;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hyperion on 28.06.17.
 */
public class Programista extends Pracownik {

    /*
        Słowo kluczowe final przy nazwie zmiennej oznacza, że zmienna raz zainicjowana nie może zostać
        zmodyfikowana.

     */
    final HashMap<String,poziomZaawansowania > znaneTechnologie = new HashMap<>();

    /*
        Poniższy przypadek to użycie słowa kluczowego final oraz static.
        Nowością jest to, że nazwa zmiennej jest napisana dużymi literami.
        Oznacza to, że mamy tutaj stałą wartość, której już nie możemy zmienić i jest stała dla całej
        klasy Programista.
     */
    final static byte JAVA_VERSION = 8;


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

    /*
        Poniższą metodę, która po raz pierwszy pojawiła się w interfejsie Osoba nadpisujemy, ale dodając
        słowo kluczowe final sprawiamy, że klasa dziedzicząca po klasie Programista nie będzie mogła
        już tej metody nadpisać.
     */
    @Override
    final public void wyświetlImie() {

    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' + "jest programistą" +
                '}';
    }





}
