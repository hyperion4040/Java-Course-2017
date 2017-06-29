package edu.wsb.piąteSpotkanie;

import java.util.HashMap;

/**
 * Created by hyperion on 28.06.17.
 */
public class Main {

    public static void main(String[] args) {
        HashMap<String,poziomZaawansowania> znaneTechnologie = new HashMap<>();
        znaneTechnologie.put("Java",poziomZaawansowania.praktyczna);
        znaneTechnologie.put("Haskell", poziomZaawansowania.teoretyczna);


        Programista programista = new Programista("Adrian","Kozłowski",znaneTechnologie);
//        programista.wypiszTechnologie();

        System.out.println( programista.toString());

        Pracownik pracownik = new Programista("Marek","Kozioł");
        System.out.println(pracownik.toString());
        Pracownik pracownik1 = new Pracownik() {
            @Override
            public void wypiszTechnologie() {

            }
            public void wyświetlImie(){

            }

        };

        System.out.println(pracownik1.toString());

        Osoba osoba = new Osoba() {
            @Override
            public void wypiszTechnologie() {

            }

            @Override
            public void wyświetlImie() {

            }
        };
        System.out.println(osoba.toString());
        osoba.wyświetlImie();
        osoba.wyświetlNazwisko();
    }
}
