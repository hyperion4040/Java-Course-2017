package edu.wsb.trzecieSpotkanie;

import java.util.ArrayList;

/**
 * Created by hyperion on 14.06.17.
 */
/*
    Klasa Student będzie naszym autorskim typem danych, którego będziemy wykorzystywać
     w metodzie main klasy MainStudent.
     W klasie możemy zdefiniować zmienne typów predefiniowanych, metody oraz konstruktory.
 */
public class Student {
    /*
        Poniżej mamy zadeklarowane i zainicjowane zmienne.
        Poniżej zmienna String z przypisaną wartością domyślną Sebastian.
        Jest to zmienna niestatyczna. Jest to zmienna obiektu jaki utworzymy.
        Dla przykładu mając dwa obiekty, które w swoim wnętrzu mają zmienną niestatyczną.
        Dokonując zmiany zmiennej w jednym obiekcie nie sprawiamy, że ulegnie też zmiania
        zmienna w drugim obiekcie.
     */
    private String imię = "Sebastian";
    /*
       Słowo kluczowe static sprawia, że zmienna staje się zmienną całej klasy, a nie tylko pojedyńczego
       obiektu. Zmiana dokonana na tej zmiennej w dowolnym miejscu sprawia, że wszystkie obiekty
       będą miały zmienną zmodyfikowaną.
     */
    public static   int liczbaStatyczna = 0;
    /*
        Możemy również zadeklarować pustą kolekcję ArrayList przechowującą typ Double.
        Pojawia się tutaj słowo kluczowe private.
        Public oznacza, że metoda, zmienna jest dostępna z każdego miejsca w naszym projekcie.
        Private, że jest dostępna tylko z klasy, w której się znajduje.
     */
    private ArrayList<Double> oceny = new ArrayList<>();

    /*
        Jeśli zgodnie z zasadami pisania kodu wszystkie zmienne w klasie będą private
        Nie będzie sposobu, by je zmodyfikować z innych miejsc w projekcie.
        Owszem, ale możemy utworzyć metodę publiczną(dostępną z każdego miejsca),
        która będzie modyfikować bądź zwracać zmienną.
        Pytanie po co skoro i tak i tak będziemy mogli modyfikować zmienną.
        W metodzie możemy dodać fragment kodu, który będzie sprawdzał czy modyfikacja jest dozwolona.

        Linijka poniżej to metoda zwana getterem, która zwraca wartość zmiennej, która jest w tej klasie
     */
    public ArrayList<Double> getOceny(){
        return oceny;
    }
    /*
       Poniżej jest metoda zwana setterem, która modyfikuje zmienną.
       Jak widać jest to zwykłe przypisanie nowej wartości, która jest parametrem metody.
       W tym przypadku nazwa parametru i zmiennej w klasie student są inne
       by było widać, że ta metoda mimo, że ma specjalną nazwę nie różni się
       właściwie z niczym z innymi metodami.
     */
    public void setOceny(ArrayList<Double> Noweoceny){
        oceny = Noweoceny;
    }

    public String getImię(){
        return imię;
    }
    /*
        W metodzie poniżej są dwie zmianny z poprzednim setterem.
        nazwa paramatru jest taka sama jak nazwa zmiennej w klasie.
        Dodaliśmy warunek. Jeśli długość wyrazu będzie mniejsza niż 3 to wypisze, że nia ma
        takich imion. Oczywiście pomijam fakt, że są imiona np. chińskie, które składają się
        jedynie z dwóch znaków
     */
    public void setImię(String imię ){
        if (imię.length() < 3)
        {
            System.out.println("Nie ma takich ");
        }
        else {
            /*
                Ten fragment jest interesujący. Słowo kluczowe this
                wskazuje, że chodzi nam o zmienną w klasie.
             */
            this.imię = imię;
        }

    }
    /*
        Mamy setter, który dokonuje zmiany całej zmiennej oceny, która jest ArrayList
        Chcielibyśmy jednak dokonać zmiany pojedyńczej wartośći jednego z elementów w tej kolekcji.
     */
    public void setOcena(Double ocena, Double nowaOcena){
        /*
            Najpierw używając metody niestatycznej klasy ArrayList na obiekcie oceny
            sprawdzamy czy ocenę, którą chcemy zmienić w ogóle istnieje.
         */
        if (oceny.contains(ocena)){
            /*
                Jeśli warunek jest prawdziwy sprawdzamy gdzie jest taka ocena.
                Zakładam, że dokonujemy zmian na ocenach, które najpóźniej zostały wpisane.
                Zatem chcemy, by szukanie nastąpiło od końca naszego ArrayList

                Przypisujemy wynik indeksu do zmiennej miejsce
             */
            int miejsce = oceny.lastIndexOf(ocena);
            /*
                Na koniec zaś używamy metody set, która chce dwóch argumentów.
                Indeksu elementu oraz na co podmienić.
             */
            oceny.set(miejsce,nowaOcena);
            /*
                Blok else który sie uruchamia jeśli nie znaleziono oceny, którą należy podmienić.
             */
        }else {
            System.out.println("Nie ma takiej oceny");
        }
    }

    public void wypiszInformacje(){
        System.out.println("Mam na imię " + imię);
        System.out.print("Moje oceny to: ");
        for (Number en: oceny){
            System.out.print(en+" ");
        }



    }

    public Student(String imię, Double ocena,Double nowaOcena){
        setImię(imię);
        setOcena(ocena,nowaOcena);



    }
    public Student(){}


    public  void wypiszPowitanie(){
        System.out.println("Witaj");
        liczbaStatyczna++;
    }
    public void wypiszPowitanie(String name){
        System.out.println("Witaj " + name);
        liczbaStatyczna++;
    }

    public void wypiszStatyczną(){
        System.out.println(liczbaStatyczna);
    }


}
