package edu.wsb.trzecieSpotkanie;

import java.util.ArrayList;
import java.util.Arrays;

public class MainStudent {


    public static void main(String[] args) {

        /*
            Tworzymy obiekt Klasy Student używając konstruktora domyślnego.
            Wpierw jednak wypiszemy informacje zanim dodamy oceny oraz imię, a potem po ich dodaniu.
             Będzie dzięki temu widać, że po utworzenie obiektu nowy obiekt zmienne niestatyczne bierze
             jakby z template, który jest w klasie
         */
        Student student = new Student();
        student.wypiszInformacje();
        /*
            Modyfikuje zmienną imię.
         */
        student.setImię("Adrian");
        System.out.println(student.getImię());
        /*
            Tworzymy listę ocen typu Double. Należy uważać, gdyż
            dodanie parametru Arrays.asList nie jest zbyt bezpiecznie.
            Nie następuje sprawdzanie jakie wartości umieścliśmy w ArrayList
            Błąd podczas spotkania wynikał z tego, że były tam wartości typu innego niż Double
            Moglibyśmy nawet dodać wewnątrz tej grupy liczb String np. "Ocena".
            Stało się to pomimo zabezpieczenia ArrayList jako tej posiadającej wartości
            typu Double.
         */
        ArrayList<Double> noweOceny = new ArrayList(Arrays.asList(4.0,5.0,4,"Ocena"));
        student.setOceny(noweOceny);
        /*
        Nawet wypisanie naszej listy sprawia, że nie widać żadnego błędu.
         */
        System.out.println(student.getOceny());
        /*
            Błąd dopiero jest zgłaszany, gdy na utworzonym obiekcie próbujemy użyć metody dodającej

            ArrayList<Double> noweOcenyBezpieczniejsza = new ArrayList();
            noweOcenyBezpieczniejsza.addAll(Arrays.asList(4.0,5.0,4,"Ocena"));

            Sprawia to, że już na etapie wywołania metody addAll pojawia się błąd.
            Z jednej strony to wprowadzenie w myśl zasady by błędy ewentualnie pojawiały się
            jak najszybciej.
            W przeciwnym wypadku błąd pojawia się dopiero podczas pętli for each jak
            na naszym spotkaniu.
        */
        ArrayList<Double> nowaListaOcen = new ArrayList<>();
        nowaListaOcen.addAll(Arrays.asList(4.5,5.0));
        /*
            W tym przypadku już żaden błąd nie powinien się pojawić.
         */
        Student student1 = new Student("Marek",nowaListaOcen);
        student1.wypiszInformacje();
        System.out.println();
        /*
            Teraz zajmiemy się zmienną statyczną. Najpierw wypiszemy jej wartość na początku
            przed modyfikacjami. Potem wywołamy metodę na pierwszym obiekcie modyfikującą tą zmienną.
            A potem wywołamy metodę wypisującą wartość zmiennej używając innego obiektu.
         */
        System.out.println("Sposób działania zmiennych statycznych");
        student.wypiszStatyczną();
        student.modyfikujeZmiennąStatyczną();
        student1.wypiszStatyczną();
        student.wypiszStatyczną();
        /*
            Zmienną zmodyfikowaliśmy na jednym obiekcie, a zmiany były
            zapisane na obu.
            Stworzymy jeszcze jeden zupełnie nowy obiekt, który zostanie utworzony po modyfikacjach i zobaczymy
            , że i on ma zmienioną wartość zmiennej statycznej.
         */
        System.out.println("Utworzenie nowego obiektu");
        Student student2 = new Student();
        student2.wypiszStatyczną();











    }
}
