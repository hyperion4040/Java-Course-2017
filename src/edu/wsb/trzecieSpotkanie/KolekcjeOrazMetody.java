package edu.wsb.trzecieSpotkanie;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by hyperion on 14.06.17.
 */
public class KolekcjeOrazMetody {

    /*
        Do tej pory wszystkie nasze deklaracje zmiennych umieszczaliśmy wewnątrz
        głównej metody main, która jednocześnie odpalała nam program.
        Tworząc nowe własne metody i chcąc mieć dostęp do zmiennych mysimy je mieć
        wewnątrz klasy, a nie metody.

        Pierwsza zmienna statyczna to tablica jednowymiarowa intów.
     */
    static int[] java = {3,5};
    /*
    Poniżej widać tablicę wielowymiarową.
    Niezadeklarowaliśmy jej wielkości, a poprzez umieszczanie
    wewnątrz inicjacji tablic jednowymiarowych
    sprawialiśmy, że samoistnie następowało określenie wielkości
    tablicy wielowymiarowej.
     */
    static int[][] oceny = new int[][]{
            //Poniższe dwie linijki prezentują najprostrzy sposób przypisania
            //wartości do tablicy jednowymiarowej, która jest komórką w innej tablicy
            {2,3},
            {5,6},
            //Poniżej inny sposób z utworzeniem słowa kluczowego new
            new int[]{7,8},
            //tutaj zaś w użyciem utworzonej nieco wcześniej tablicy jednowymiarowej
            java
    };


    /*
        Tablice mają jedną zasadniczą wadę. Gdy raz ustalimy ich rozmiar
        to nie będziemy mogli ot tak tego rozmiaru zmienić.
        Wówczas będziemy musieli utworzyć nową tablicę o większym rozmiarze
        a potem przekopiować starą do nowej, element po elemencie

        Lub użyć dynamicznej wersji tablicy, która to wszystko robi za nas
        ArrayList ma jednak pewną wadę. Nie może przyjmować
        wartości zmiennych prostych, a ich obiektowe wersje.

        Zamiast int będzie przyjmować Integer.
        Tutaj też widać jak tworzymy obiekt klasy ArrayList z użyciem konstruktora
        domyślnego.
        */
     ArrayList<Integer> ocenyNowe = new ArrayList<>();

     /*
        Poniżej mamy metodę niestatyczną, którą jeśli chcemy odpalić
        musimy wpierw utworzyć obiekt klasy, w której znajduje się metoda.
        W metodzie głównej pokażę jak ten proces wygląda.
      */
    public void wypiszWyniki(){
        /*
        Nie musimy jednak tworzyć obiektu Integer i1 = new Integer(4);
        A poprzez Integer i1 = 4;
        Java wykonuje to za nas, ale sam ten proces też wpływa na szybkość
        działania naszego programu
     */
        Integer i1 =4;
        /*
            Poniżej widzimy jak utworzony wcześniej obiekt klasy ArrayList o
            nazwie ocenyNowe zostaje wykorzystany do wywołania
            metod niestatycznych na nim.
            Metoda add dodaje do obiektu kolejne elementy Typu Integer(obiektowy
            wielki brat typu prostego int)
         */
        ocenyNowe.add(i1);
        ocenyNowe.add(5);
        /*
            Używaliśmy pętli for np. for(int i =0;i< tablica.length;i++)
            Taka pętla przechodziła przez wszystkie elementy tablicy.
            Możemy zrobić to samo używając poniższego rodzaju pętli
            Zaznaczamy typ elementu jaki jest wewnątrz naszej struktury(tablicy, listy)
            a potem po : wskazujemy właśnie naszą "kolekcję emenetów"
            zbiór elementów ocenyNowe zawiera wartości
            typu Integer, ale możemy też zamiast
            Integer i użyć int i
         */
        for (Integer i : ocenyNowe){
            System.out.println(i);
        }
    }

    /*
        Następna tak jak poprzednie metody nie zwracały wartości żadnej.
        Oczywiście wypisywały coś na konsoli, ale nie zwracały żadnej wartości
        którą moglibyśmy gdzieś przypisać, wrzucić do jakiejś zmiennej.

        Poniższa metoda różni się od pozostałych tym, że
        pobiera jakiś parametr.
        Następnie wartość tego parametru wpisujemy do tablicy java na pozycję 0
     */
    public static void edytujTablicę(int liczba){
        java[0] = liczba;
    }

    /*
        Poniższa metoda pobiera dwa elementy,a  zwraca wartość liczbową typu int
     */
    public static int wypiszElement(int x, int y){
        return oceny[x][y];
    }


    public static void wypiszTablicęJednowymariową(){
        //Poniżej pętla for each przechodząca przez wszystkie elementy tablicy jednowymiarowej
        for (int i   : java  ){
            System.out.println(i);
        }
        System.out.println();
        /*
            Poniższe zaś pętle for each przechodzą przez wszystkie elementy tablicy
            wielowymiarowej. Tablicy w tablicy.
            Przedstawiałem to w ten sposób, by łatwiej można było
            zrozumieć poniższe zagnieżdzone pętle.
            Najpierw iterujemy po tablicy int, a
            potem po int.
         */
        for (int[] i   : oceny  ){
            for( int j : i){
                System.out.println(j);
            }

        }


    }

    public static void main(String[] args) {

        double[] szerokośćGeograficzna = new double[5];
        double[] długośćGeograficzna = {3.5,4};


        double[][] wsp = new double[2][];
        wsp[0] = new double[5];
        wsp[1] = new double[5];
        wsp[0][0] = 3.5;
        wsp[0][1] = 4;
            KolekcjeOrazMetody kolekcjeOrazMetody = new KolekcjeOrazMetody();
            kolekcjeOrazMetody.wypiszWyniki();

//        int liczba = wypiszElement(0,0);
//        System.out.println(liczba);
//        System.out.println();
//        trzecieSpotkanie trzecie = new trzecieSpotkanie();
//        trzecie.wypiszWyniki();
//        trzecie.ocenyNowe.add(6);
//        System.out.println();
//        trzecie.wypiszWyniki();

//        HashSet<String> języki = new HashSet<>(Arrays.asList("java","java","c#"));
//        for ( String i : języki ){
//            System.out.println(i);
//        }

        Student student = new Student();
        System.out.println(student.getImię());
        student.setImię("Adrian");
        System.out.println(student.getImię());
        ArrayList<Double> noweOceny = new ArrayList(Arrays.asList(4,5,4.5));
















                // new ArrayList(Arrays.asList(4.0,5.0));
//        noweOceny.add(4.0);


        student.setOceny(noweOceny);
        System.out.println(student.getOceny());
        System.out.println();
        System.out.print(2);
        student.wypiszInformacje();
        System.out.println();
        Student student1 = new Student("Marek",4.5);
        System.out.print(student1.liczbaStatyczna);
        student1.wypiszStatyczną();
        System.out.print(student1.getImię());
        student1.setImię("Marian");
        student.wypiszPowitanie();
        student.wypiszStatyczną();
        System.out.print(student.getImię());




//        wypiszTablicęJednowymariową();
//        edytujTablicę(-6);
//        wypiszTablicęJednowymariową();





    }
}
