package edu.wsb.drugieSpotkanie;

/**
 * Created by hyperion on 07.06.17.
 *
 */
public class TabliceOrazPętle {

    public static void main(String[] args) {

        /*
            Tablice można utworzyć na kilka sposobów.
            Mozna zadeklarować tablicę typu poprzez dodanie do nazwy typu []
            a potem przez new <nazwa typu>[<wielkość tablicy>]
         */
        String[] imie = new String[5];
        /*
            Potem jednak należy odwołując się do pozycji w tablicy wpisywać
            do niej wartośći jak podano niżej
         */
        imie[0] = "Paweł";
        imie[1] = "Piotr";
        /*
        Możemy też to zrobić za jednym zamachem, nie podajemy jednak wówczas wielkości
        tablicy w [], gdyż jest ona ustalana automatycznie na podstawie liczby elementów
        Pozycję w tablicy liczymy od 0
         */
        String[] nazwiska = new String[]{"Kozłowski","Kozioł","Lewandowski"};
        /*
            Wypisać wartość zmiennych nie możemy wpisując jedynie nazwę zmiennej
         */
        System.out.println(nazwiska[1]);
        /*
            Jeśli chcemy wszystkie wartości wypisać z tablicy musimy zastosować
            pętle np. for

            pętla for w swojej najprostrzej postaci wygląda for(;;){}
            jako pierwszy element podajemy punkt startowy, jako drugi warunek jaki
            musi być spełniony, by pętla dalej się wykonywała, a
            trzeci to krok, co po każdej iteracji(wykonaniu pętli) powinien zrobić program
            ze zmienną według której iterujemy
        */
        for(int i =0;i<nazwiska.length;i++){
            System.out.println(nazwiska[i]);
        }
        /*
        Poniższy przykład wykonuje dokładnie to samo z tym wyjątkiem, że
        stosujemy pętle while.
         */
        int liczba =0;
        do {
            System.out.println(nazwiska[liczba]);
            liczba++;
        }while (liczba <nazwiska.length);
        System.out.println();

        int liczbaNowa = 1;
        while (liczbaNowa < 1){
            System.out.println(liczbaNowa);
            liczbaNowa++;
        }
        System.out.println();

        String[] imieNowe = new String[]{"Adrian","Piotr","Mateusz"};

        if (imieNowe.length ==1){
            System.out.println(imieNowe[0]);
        }
        else {
            for (int i = imieNowe.length -1; i >=0;i--){
                System.out.println(imieNowe[i]);
            }
        }

        System.out.println();
        String[] nazwiskaNowe = new String[]{"Kozłowski","Kozioł"};

        int długość = nazwiskaNowe.length;

        switch (długość){
            case 1:
                System.out.println(nazwiskaNowe[0]);
                break;
            default:
                int i = nazwiskaNowe.length -1;
                while (i >= 0){
                    System.out.println(nazwiskaNowe[i]);
                    i--;
                }
        }



    }

}
