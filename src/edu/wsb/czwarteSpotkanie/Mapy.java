package edu.wsb.czwarteSpotkanie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hyperion on 21.06.17.
 */
public class Mapy {
    /*
        Poniżej jest sposób tworzenia tablic dynamicznych.
     */
    ArrayList<Integer> lista = new ArrayList<>();
    /*
        Co jednak jak chcemy grupować nasze wartości po innym kluczu niż liczba ?
        Poniższa struktura danych grupuje po String, który musi być unikalny.
     */
    static HashMap<String,Integer> pesel = new HashMap<>();

    public static void main(String[] args) {

        /*
            W poniższy sposób dodajemy kolejne elementy do HashMap
         */
        pesel.put("Adrian",123);
        pesel.put("Piotr",245);
        /*
            HashMap nie przyjmie kolejnego elementu o tym samym kluczu, ale...
            Uzna, że skoro go podajesz to podmienić wartość, która jest za tym kluczem.
         */
        pesel.put("Adrian",679);
        /*
            W takim wypadku warto zastosować metodę putIfAbsent, która dodaje element jeśli nieobecny.
            Jesli będzie element o takim samym kluczu to już nie podmieni nam wartości.
         */
        pesel.putIfAbsent("Adrian",981);

        //System.out.print(pesel.get("Adrian"));

        /*
            Poniżej jest sposób jak możemy wypisać wartości.
            Musimy wykorzystać metodę values, która zwraca wartości.
         */
        for (Integer i : pesel.values()){
            System.out.println(i);
        }
        System.out.println();
        /*
            Poniższa zaś zwraca nam klucze jakie były. W tym przypadku były to imiona.
         */
        for (String st : pesel.keySet()){
            System.out.println(st);
        }
        /*
            A co jeśli byśmy chcieli wypisać i jedno i drugie ?
            Nie możemy użyć żadnej zmiennej po jakiej możemy iterować, gdyż tutaj będą dwie zmienne.
            Możemy za to wykorzystać Map.Entry i potem podać naszą HashMap z metodą entrySet, która
            zwraca zarówno klucze jak i wartości.
         */
        System.out.println();
        for (Map.Entry<String,Integer> map : pesel.entrySet()){
            System.out.println(map);
        }



    }
}
