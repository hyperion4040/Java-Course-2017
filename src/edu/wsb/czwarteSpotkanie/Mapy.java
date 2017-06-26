package edu.wsb.czwarteSpotkanie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hyperion on 21.06.17.
 */
public class Mapy {

    ArrayList<Integer> lista = new ArrayList<>();
    static HashMap<String,Integer> pesel = new HashMap<>();

    public static void main(String[] args) {

        pesel.put("Adrian",123);
        pesel.put("Piotr",245);
        pesel.put("Adrian",679);
        pesel.putIfAbsent("Adrian",981);

        //System.out.print(pesel.get("Adrian"));

        for (Map.Entry<String,Integer> map : pesel.entrySet()){
            System.out.println(map);
        }
        System.out.println();
        for (String st : pesel.keySet()){
            System.out.println(st);
        }

    }
}
