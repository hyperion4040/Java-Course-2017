package edu.wsb.drugieSpotkanie;

/**
 * Created by hyperion on 07.06.17.
 *
 */
public class TabliceOrazPętle {

    public static void main(String[] args) {
//        String[] imie = new String[5];
//        String[] nazwiska = new String[]{"Kozłowski","Kozioł","Lewandowski"};
////        System.out.println(nazwiska[1]);
//
//        for(int i =0;i<nazwiska.length;i++){
//            System.out.println(nazwiska[i]);
//        }

        int liczba =1;
        do {
            System.out.println(liczba);
            liczba++;
        }while (liczba < 1);
        System.out.println();
        int liczbaNowa = 1;
        while (liczbaNowa < 1){
            System.out.println(liczbaNowa);
            liczbaNowa++;
        }
        System.out.println();

        String[] imie = new String[]{"Adrian","Piotr","Mateusz"};

        if (imie.length ==1){
            System.out.println(imie[0]);
        }
        else {
            for (int i = imie.length -1; i >=0;i--){
                System.out.println(imie[i]);
            }
        }

        System.out.println();
        String[] nazwiska = new String[]{"Kozłowski","Kozioł"};

        int długość = nazwiska.length;

        switch (długość){
            case 1:
                System.out.println(nazwiska[0]);
                break;
            default:
                int i = nazwiska.length -1;
                while (i >= 0){
                    System.out.println(nazwiska[i]);
                    i--;
                }
        }



    }

}
