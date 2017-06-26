package edu.wsb.czwarteSpotkanie;

import edu.wsb.StandardInput;

import java.io.*;
import java.util.Scanner;

/**
 * Created by hyperion on 21.06.17.
 */
public class Wyjątki {

    /*
        Poniższa metoda pokazuje sposób w jaki pobieraliśmy znak
        od użytkownika.
        Z ciekawszych rzeczy jest to, że tekst wiadomości jaki się wyświetli bierzemy z
        parametru metody, a sam parametr pobieramy z parametru metody głównej main.
     */
    private static void podajZnak(String[] wiadomość){
        /*
            Jako parametr metody mamy tablicę String, a zatem
            chcąc pobrać pojedyńczy element musimy wskazać o
            jaki element tablicy nam chodzi.
         */
        char znak = StandardInput.readChar(wiadomość[0]);
        System.out.print("Podałeś " + znak);
    }
    /*
        Poniższa metoda pokazuje sposób w jaki metoda readChar z klasy StandardInput
        pobierała za nas znak od użytkownika.
     */
    private static char pobierzZnak(String komunikat){
        System.out.println(komunikat);
        /*
            Wpierw tworzymy obiekt klasy Scanner i jako parametr wskazujemy gdzie "nasłuchiwać"
            czekając na pojawienie się danych. System.in oznacza konsolę.
         */
        Scanner scanner = new Scanner(System.in);
        /*
            Następnie następny ciąg znaków jaki pojawi się w System.in ma przypisać do
            zmiennej znak.
            Wczytaliśmy cały wyraz, a chcemy tylko pojedyńczy znak.
         */
        String znak = scanner.next();
        /*
            Sprawdzamy jaki długi jest nasz wyraz.
            Jak dłuższy niż 1 to throw nowy wyjątek.
         */
        if(znak.length() >1){
            /*
                Wywalamy poniżej nowy RuntimeException. Wszystkie wyjątki, które do niego przynależą
                określamy jako Unchecked. Co oznacza, że nie jest on sprawdzany w czasie kompilacii, a w trakcie
                 uruchamiania kodu. Takiego rodzaju wyjątków z reguły nie obsługujemy poprzez try catch lub throw Exception
             */
            throw new RuntimeException("Podałeś cały wyraz");
        }else
            /*
                Jeśli nasz wyraz ma długość 1 to zwracamy znak na pierwszym miejscu.
             */
        return znak.charAt(0);

    }


    /*
        Wczytywanie danych z konsoli jest jedną kwestią, a wczytywanie z pliku.
        Możemy to uczynić na kilka sposobów.
        Wpierw jednak pojawia się słowo kluczowe throws.
        Mówi ono, że poniższa metoda nie będzie się zajmować obsługą wyjątków i przekazuje to zadanie
        metodzie, która będzie wywoływać poniższą metodę.
        Można też użyć bloku try catch.
        Nie trzeba używać i jednego i drugiego sposobu.
        Został on wykorzystany na potrzeby przykładu.
     */
    private static void wczytajPlik() throws IOException{
        /*
            Wpierw tworzymy obiekt klasy FileInputStream, następnie zaś
            przypisujemy do niej wartość null.
         */
        FileInputStream fileInputStream = null;
        /*
            Poniżej jest blok try catch, który zajmuje się obsługą wyjątku.
            Wpierw staramy się uruchomić kod, a jeśli się nie uda chwytamy wyjątki.
         */
        try {
            /*
                Tworzymy nowy obiekt z użyciem konstruktora wskazując nazwę naszego pliku.
             */
            fileInputStream = new FileInputStream("readme.txt");
            /*
                Poniżej tworzymy tablicę byte o określonej wielkości.
             */
            byte[] tablica = new byte[6];
            /*
                wywołujemy metodę read z parametrem na obiekcie fileInputStream
                Ta metoda pobieraz kolejne elementy(znaki z pliku)
                i wrzuca je jeden po drugim do tablicy.
             */
            fileInputStream.read(tablica);
            /*
                Wydawać się by mogło, że chcąc wypisać to co było w pliku wystarczy zwykła
                pętla for each i metoda println.
                Niestety elementy w tablicy są w formie byte. Znaki zostały zamienione na wartości liczbowe.
             */
            for (byte s : tablica){
                //Chcąc uzyskać znaki musimy wpierw dokonać castowania.
                char znak = (char) s;
                System.out.println(znak);
            }
            /*
                Poniżej łapiemy wyjątki, możemy mieć kilka catch.
             */
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            /*
                Na końcu jednak skoro otworzyliśmy plik musimy go zamknąć. A dokładniej
                strumień do którego plik był przyłączony.
                Kod finally jest uruchamiany niezależnie czy wykonał się kod z bloku try
                czy z bloku catch
             */
        }finally {
            fileInputStream.close();
        }
    }
    /*
        Jak widać używanie z try catch nie jest przyjmne. Musimy pamiętać o zamknięciu, a
        wielokrotnie wpierw sprawdzić czy można zamknąć.
        Dlatego łatwiej korzystać z automatycznego systemu zarządzania zasobami.
        try with resosurces. Dzięki temu blok finally możemy niejako pominąć i nie przejmować się
        zamykaniem i sprawdzaniem czy możemy zamknąć.
     */
    private static void WczytajPlikNowaWersja(){
        /*
            Blok try with resources różni się tym, że pojawia się zwykły nawias, a wewnątrz niego umieszczmy
            deklaracje i inicjalizacje, które chcemy by zostały poddane automatyzacji jeśli chodzi o zarządzanie.
            Działa to podobnie do garbage collectora, który za nas zajmuje się niszczeniem obiektu jak nie są potrzebne.
         */
        try(FileReader reader = new FileReader("readme.txt")){
            /*
                Pobranie danych z plików z użyciem FileReader sprawia, że nasze dane możemy umieścić
                w tablicy char.
             */
            char[] tablica = new char[10];
            reader.read(tablica);
            for (char c : tablica){
                System.out.println(c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    /*
        A co w przypadku zapisu do pliku ? Zasada jest podobna. Tylko, że zamiast z metody read korzystamy z
        write.
     */
    private static String zapiszPlik(){
        try (FileWriter fileWriter = new FileWriter("result.txt"))
        {
            fileWriter.write("Pierwsza linia\n");
            fileWriter.write("Druga linia");
            return "Zapis zakończony powodzeniem";
        } catch (IOException e) {
            //e.printStackTrace();
            return "Zapis nieudany: " + e.getStackTrace();
        }
    }

    /*
        Możemy też utworzyć folder.
     */
    private static int stwórzFolder(String folderName){
        /*
            Wpierw tworzymy string, który będzie przechowywał ścieżkę wraz z nazwą
            naszego folderu.
            Ścieżka jest prawidłowego dla mojego systemu operacyjnego i nazwy użytkownika.

         */
        String path = "/home/hyperion/".concat(folderName);
        /*
            Potem tworzymy File i jako parametr podajemy naszą ścieżę.
         */
        File d = new File(path);
        /*
            sprawdzamy czy folder istnieje. Jak istnieje to go niszczymy.
         */
        if(d.exists()){
            d.delete();
            return -1;
            /*
            A jak nieistnieje to tworzymy.
             */
        }else
            d.mkdirs();
            return 1;
    }




    public static void main(String[] args) throws IOException {
        //podajZnak(args);
//        char znak = pobierzZnak("Podaj znak ");
//        System.out.println(znak);
//        wczytajPlik();
//        WczytajPlikNowaWersja();
//        System.out.print(zapiszPlik());
        stwórzFolder("dirname");
    }

}
