package Testowe.czwarteSpotkanie;

import edu.wsb.StandardInput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by hyperion on 21.06.17.
 */
public class Test {

    private static void wypiszLiczbę(String[] informacje){

            int liczba = StandardInput.readInt(informacje[0]);
        System.out.println("Podana liczba wynosi " + liczba);

    }

    private static void wypiszZnakUżywającJdk(String wiadomość)  {
        byte[] tablica = new byte[5];
        try{
            System.out.print(wiadomość);
            System.in.read(tablica);
            for (byte c : tablica){
                char znak = (char) c;
                System.out.println(znak);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void wczytajUżywającScannera(String wiadomość, int dzielna){
        Scanner scanner = new Scanner(System.in);
        System.out.print(wiadomość);
        int dzielnik =  scanner.nextInt();
        if(dzielnik == 0){
            throw new ArithmeticException("Nie można dzielić przez 0");
        }else {
            int wynik = dzielna / dzielnik;
            System.out.println(wynik);
        }
    }

    private static void czytajPlik(){
        byte[] tablica = new byte[20];
        try {
            FileInputStream fileInputStream = new FileInputStream("result.txt");
            fileInputStream.read(tablica);
            for (byte wynik : tablica){
                char c = (char) wynik;
                System.out.println(c);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }


    }




    public static void main(String[] args) {


        //wypiszLiczbę(args);
//        wypiszLiczbęUżywającJdk(args[0]);
//        wczytajUżywającScannera(args[0], 3);
//        czytajPlik();
        wypiszZnakUżywającJdk("Znaki to");
    }
}
