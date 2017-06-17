package edu.wsb.trzecieSpotkanie;

import java.util.ArrayList;
import java.util.Arrays;

public class MainStudent {


    public static void main(String[] args) {


        Student student = new Student();
        System.out.println(student.getImię());
        student.setImię("Adrian");
        System.out.println(student.getImię());
        ArrayList<Double> noweOceny = new ArrayList(Arrays.asList(4.0,5.0,4.5));

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
        System.out.println( student.toString());

    }
}
