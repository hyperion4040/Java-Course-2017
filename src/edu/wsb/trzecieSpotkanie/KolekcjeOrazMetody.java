package edu.wsb.trzecieSpotkanie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

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

    /*
        Poniżej widać deklarację zmiennych nie-statycznych. Oznacza to, że nie możemy już ich użyć(modyfikować
        w metodach statycznych.

        W metodach nie-statycznych możemy zarówno modyfikować zadeklarowane zmienne statyczne jak i nie-statyczne
     */
    double[] szerokośćGeograficzna = new double[5];
    double[] długośćGeograficzna = {3.5,4};


    double[][] wsp = new double[2][];


    /*
        Jak widać na poniższym przykładzie można nie tylko zwracać pojedyńcze wartości określonego typu, ale
        i całe ich zbioty. W tym przypadku zwrócimy tablicę wielowymiarową.
        Nie jest to już metoda statyczna. Oznacza to, że by ją wywołać musimy wpierw stworzyć obiekt Klasy w jakiej znajduje się
        ta metoda. W tym przypadku stworzony obiekt będzie klasy KolekcjeOrazMetody.
        Tak jak w przypadku metod zwracających pojedyńcze wartości należy pamiętać o słowie kluczowym return, po którym będzie
        zmienna, inna metoda tego samego typu jak zadeklarowany zwracany typ.
     */
    public double[][] zwróćTablicęWielowymiarową(){
        /*
            Jak w poniższym przykładzie widać i co starałem się wyjaśnić. Najlepiej tablicę wielowymiarowe traktować jako
            tablicę w tablicy. Zamiast do wsp[0] = 3; przypisujemy całą tablicę. Poniżej są dwa z kilku sposobów jakie
            można zastosować.
            Oczywiście wpierw główną tablicę musimy określić jako doubile[][].
            Ilość [] określa ilośc wymiarów naszej tablicy
         */
        wsp[0] = new double[5];
        wsp[1] = długośćGeograficzna;

        wsp[0][0] = 3.5;
        wsp[0][1] = 4;

        return wsp;
    }

    public void wypiszTablicęWielowymiarową(double[][] tablica){
        /*
            Używając pętli for each należy pamiętać, że jako zadeklarowanej zmiennej po której będzie przebiegać pętla musi
            być typu wartości jakie są wewnątrz naszej struktury danych.
            Wewnątrz każdego elementu tablicy dwuwymiarowej jest kolejna tablica.

            dopiero wewnątrz tej kolejnej tablicy są już zmienne typu double.
         */
        for (double[] tablicaPierwszyPoziom : tablica) {
            for ( double i : tablicaPierwszyPoziom){
                System.out.println(tablicaPierwszyPoziom);
            }
        }

    }
    public static int liczba(){
        return 1;
    }
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
        Oprócz takich kolekcji jak ArrayList, która zachowuje się jak tablica, która dynamicznie potrafi
        zwiększać swój rozmiar, sprawiając, że my nie musimy się tym martwić.
        Są też inne.
        Jedną z ciekawszych jest HashSet, który może służyć do przechowywania wartości zmiennych, które nie
        mogą się powtórzyć jak np. pesel czy w poniższym przykładzie, gdy chcemy by nie potwrzały się
        języki programowania.

        W przeciwieństwie do poprzedniej kolekcji, którą utworzyliśmy z użyciem konstruktora domyślnego
        poniższą tworzymy używając konstruktora z parametrem.
     */
    HashSet<String> języki = new HashSet<>(Arrays.asList("java","java","c#"));
    /*
        Jeśli Typ kolekcji się zgadza możemy przypisać do nowo utworzonej kolekcji starą.
        Chociaż z tego typu przypisaniami należy być ostrożnym.
        Zwłaszcza jeśli podczas jednoczesnej deklaracji i inicjalizacji używamy jako
        parametru w konstruktorze metody Arrays.asList().
        Na spotkaniu można było sie przekonać, że nawet jeśli na początku wszystko wydaje się w porządku
        gdzieś po drodze może pojawić się błąd.

        Jest z tego pewien morał. Nie należy się bać jak ide wskaże nam błędy. Im szybciej się one pojawią
        tym lepiej. Mniej kodu do poprawiania, mniej szukania samego błędu.
     */
    public ArrayList<String> wypiszJęzyki()
    {
        return new ArrayList<>(języki);
    }


    /*
           Poniżej znaduje się statyczna metoda nie zwracając żadnych wartośc, a jako parametr przyjmująca tablicę.
           Jest to metoda główna, która przez virtualną maszynę jest odpalana jako pierwsza i od niej niejako zależy czy
           i jaki fragment kodu zostanie uruchomiony.

           Tutaj będziemy uruchamiać wszystkie nasze metody
    */
    public static void main(String[] args) {

            /*
                Linijka poniżej to wywołanie metody statycznej.
                Wykonujemy to poprzez podanie klasy w jakiej znajduje się metoda, a po kropce wypisujemy samą metodę.
                <Nazwa klasy, gdzie jest metoda statyczna>.<Nazwa samej metody statycznej>
             */
        KolekcjeOrazMetody.wypiszTablicęJednowymariową();
            /*
                 Jeśli jednak wywołujemy metodę w tej samej klasie, gdzie jest metoda statyczna to wówczas
                 mamy wybór. Możemy podać nazwę klasy, a po kropce nazwę metody lub
                 podać nazwę samej metody statycznej

                 Dodatkowo poniższa metoda przyjmuje jako parametr wartość typu prostego int.
                 Możemy go podać bezpośrednio, użyć zmiennej lub użyć metody zwracającej taki typ danych.
                 Wpierw wpiszemy zwyczajnie liczbę 4.
             */
        edytujTablicę(liczba());
            /*
                W poniższej metodzie statycznej możemy wpisać dwa parametry typu int.
                Pierwszy wpiszemy jako zmienną, która przed wywołaniem metody będzie stworzona i przypisana do niej wartość.
                A drugi parametr wpiszemy jako metodę
             */
        int zmiennaParametr = 0;
        wypiszElement(zmiennaParametr, liczba());

            /*
                Poniżej widać procedurę wywołania metod niestatycznych.
                Najpierw należy utworzyć instancję klasy(obiekt) z użyciem konstruktora.
                A następnie na obiekcie wywołać metodę w sposób analogiczny
                do tego jak się postępowało z wywołaniem metody statycznej na klasie

                Obiekt tworzy w bardzo podobny sposób jak się tworzyło tablicę
                z użyciem słowa kluczowego new.
                Po new piszemy konstruktor domyślny utworzony za nas.
             */
        KolekcjeOrazMetody kolekcjeOrazMetody = new KolekcjeOrazMetody();
            /*
                Następnie używamy nazwy obiektu i na nim wywołujemy metodę.
             */
        kolekcjeOrazMetody.wypiszWyniki();
            /*
                Możemy również dzięki naszemu obiektowi uzyskać dostęp do innego utworzonego
                w klasie obiektu i potem wywołać odpowiednią metodę.
                W poniższym przypadku wpierw uzyskujemy dostęp do zmiennej obiektowej
                ocenyNowe, która jest kolekcją(listą dynamiczną), a potem użyjemy metody add
                by dodać element do tej kolekcji.
             */
        kolekcjeOrazMetody.ocenyNowe.add(6);
        /*
            Do tej pory korzystaliśmy z predefiniowanych typów zmiennych jak zmienne proste int
            lub referencyjne String. Nie zapominając o dużych braciach zmiennych prostych jakie używaliśmy
            w kolekcjach jak Integer (referencyjna odmiana zmiennej prostej int).
            W przypadku np. studenta nie ma zmiennych w pełni opisujących go.
            Można oczywiście opisać studenta z pomocą predefiniowanych typów, ale nie będzie
            to proste, a też pojawi się problem z czytelnością samego kodu.

            Stworzymy zatem klasę Student.
         */

    }
}
