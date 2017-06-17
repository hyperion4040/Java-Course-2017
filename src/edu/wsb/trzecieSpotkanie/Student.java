package edu.wsb.trzecieSpotkanie;

import java.util.ArrayList;

/**
 * Created by hyperion on 14.06.17.
 */
public class Student {

    private String imię = "Sebastian";
    private ArrayList<Double> oceny = new ArrayList<>();
    public  int liczbaStatyczna = 0;

    public ArrayList<Double> getOceny(){
        return oceny;
    }

    public void setOceny(ArrayList<Double> oceny){
        this.oceny.addAll(oceny);
    }

    public String getImię(){
        return imię;
    }

    public void setImię(String noweImię ){
        if (noweImię.length() < 3)
        {
            System.out.println("Nie ma takich ");
        }
        else {
            imię = noweImię;
        }

    }

    public void setOcena(Double ocena){
        oceny.add(ocena);
    }

    public void wypiszInformacje(){
        System.out.println("Mam na imię " + imię);
        System.out.print("Moje oceny to: ");
//        Double[] tablica = (Double[]) oceny.toArray();
//        for ( Double i  : tablica  ){
//            System.out.print(i);
//        }
        for (Number en: oceny){
            System.out.print(en+" ");
        }



    }

    public Student(String imię, Double ocena){
        setImię(imię);
        setOcena(ocena);



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

    @Override
    public String toString() {
        return "Student{" +
                "imię='" + imię + '\'' +
                ", oceny=" + oceny +
                ", liczbaStatyczna=" + liczbaStatyczna +
                '}';
    }
}
