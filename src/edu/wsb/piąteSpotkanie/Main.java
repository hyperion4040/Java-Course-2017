package edu.wsb.piąteSpotkanie;

import java.util.HashMap;

/**
 * Created by hyperion on 28.06.17.
 */


public class Main {

    public static void main(String[] args) {
        /*
            Poniżej widać nową strukturę danych określaną jako HashMap
            Działa na podobniej zasadzie jak HashSet.
            Nie pozwala na pojawienie się duplikatów, ale nie wartości jak w HashSet, a kluczy.

            W nawiasach <klucz, wartość>
         */
        HashMap<String,poziomZaawansowania> znaneTechnologie = new HashMap<>();
        znaneTechnologie.put("Java",poziomZaawansowania.praktyczna);
        znaneTechnologie.put("Haskell", poziomZaawansowania.teoretyczna);

    /*
        Poniżej jest widoczny dotychczasowy sposób tworzenia obiektów.
        Obiekt klasy Programista utworzony z użyciem konstruktora Programista.
        Mamy dostęp do wszystkich zmiennych i metod dostępnych
        zarówno w klasie Programista i tych po jakich dziedziczy.
        W przypadku, gdy w klasie Programista i nadklasie są takie same metody to
        poprzez overriding są używane wersje z klasy Programista
     */
        Programista programista = new Programista("Adrian","Kozłowski",znaneTechnologie);
//        programista.wypiszTechnologie();
        /*
            Poniżej widać efekt nadpisania metody toString()
            Możemy wywołać metodę na obiekcie, ale w przypadku wypisania jak niżej
            jest ta metoda wywołana za nas domyślnie niejako.
         */
        System.out.println( programista);

        /*
            Tworzymy obiekt klasy Pracownik uzywając konstruktora Programista.
            Przez to mamy dostęp tylko do metod jakie są w klasie Pracownik, ale w wersji jakie sa w klasie
            z jakiej wywołujemy konstruktor.
         */
        Pracownik pracownik = new Programista("Marek","Kozioł");
        System.out.println(pracownik.toString());
        /*
            Wpominałem, że w klasie abstrakcyjnej może być konstruktor, ale nie możemy utworzyć obiektu.
            Z chwilą, gdy próbujemy tego dokonać to IDE nam automatycznie tworzy poniższą strukturę, gdzie
            przedstawiamy implementację metod abstrakcyjnych
         */
        Pracownik pracownik1 = new Pracownik() {
            @Override
            public void wypiszTechnologie() {

            }
            public void wyświetlImie(){

            }

        };

        System.out.println(pracownik1);
        /*
            Podobnie w przypadku Interfejsu.
            Tworzymy niejako w locie nową klasę, która implementuje metody, które nie zostały zaimplementowane.
         */
        Osoba osoba = new Osoba() {
            @Override
            public void wypiszTechnologie() {

            }

            @Override
            public void wyświetlImie() {
                System.out.println("Metoda wywołana z interfejsu");
            }
        };
        System.out.println(osoba);
        osoba.wyświetlImie();

    }
}
