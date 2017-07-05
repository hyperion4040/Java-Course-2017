package edu.wsb.piąteSpotkanie;

/**
 * Created by hyperion on 28.06.17.
 */


/*
    Poniżej jest interfejs Osoba, która jest niejako konstraktem. Jeśli tworzysz klasę, która
    implementuje interfejs to musi on zawierać implementację metod tego interfejsu.

    Interfejs w Javie różni się od tych, które spotkać można w innych językach.
    Chociażby to, że mogą tu być metody z ciałem metody.

    W interfejsie nie możemy mieć modyfikatora dostępu private dla przykładu oraz konstruktorów.
    Kolejną kwestią, że default nie może być w połączeniu ze static.
 */
public interface Osoba {

    String zmienna ="s";

    void wypiszTechnologie();

    void wyświetlImie();

    default void wyświetlNazwisko(){

    }





}
