package edu.wsb.piąteSpotkanie;

/**
 * Created by hyperion on 28.06.17.
 */

/*
    Poniżej widzimy klasę abstrakcyjną, która jest naszą superklasą dla klas Programista oraz Tester.
    Tutaj jawnie napisaliśmy, że klasa dziedziczy po klasie Object. Nie jest to konieczne, bo każda
    klasa, która nie dziedziczy po innej dziedziczy po klasie Object.
    Po tej klasie nadpisujemy metodę toString.
    Implementujemy również interfejs Osoba.
    Klasa abstract mówi, że w tej klasie mogą być metody bez implementacji.
 */
public abstract class Pracownik  extends Object implements Osoba{
    String imie;
    String nazwisko;

    /*
        Klasa abstract może mieć konstruktory, ale nie może tworzyć instancji klasy(obiektów tej klasy)
     */
    Pracownik(){}

    Pracownik(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    /*
        Poniżej widać metodę abstrakcyjną, taką która nie posiada ciała metody, kończy się ";"
     */
    public abstract void wypiszTechnologie();


    /*
        Metoda toString występuje w klasie Object, ale gdybyśmy jej nie nadpisali to otrzymalibyśmy nazwę
        klasy adres, gdzie znajduje się obiekt.
        @Override nie jest konieczne, ale dzięki temu dajemy znak kompilatorowi, że nadpisujemy metodę.
        Gdyby tej anotacji nie było, a np. w nazwie obiektu byłaby literówka tooString to
        metoda System.out.println(<nazwa obiektu klasy>) nie wypisałaby tego, co jest w implementacji
        metody.
     */
    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }

}
