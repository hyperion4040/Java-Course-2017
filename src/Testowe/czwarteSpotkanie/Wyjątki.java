package Testowe.czwarteSpotkanie;

import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by hyperion on 19.06.17.
 */
public class Wyjątki {

    static String[] listas = new String[3];
    static List<String> lista = new ArrayList<>();

    private static void wyjątek() throws IOException {
        try {
            FileWriter writer = new FileWriter("readme.txt");

            writer.write("first line\n");
            writer.write("second line");
            writer.close();
        } catch (IOException e) {
            throw new IOException("Nie udało się utworzyć pliku");
        }
    }

    private static void otwórzPlik() throws IOException {
        FileReader reader = new FileReader("readme.txt");
        CharBuffer charBuffer = CharBuffer.allocate(12);
        reader.read(charBuffer);
        charBuffer.flip();
        System.out.println(charBuffer.toString());
//        char[] tab = new char[50];
//        for (char s : tab){
//            System.out.print(s);
//        }
        reader.close();

    }


    private static void inputStream() {
        try (FileInputStream in = new FileInputStream("readme.txt");
             FileOutputStream out = new FileOutputStream("result.txt")
        ) {
            for (int c = in.read(); c != -1; c = in.read()) {

                out.write(c);
            }


        } catch (IOException e) {
//            e.getStackTrace();

        }
    }


    private static void dir(String dirname) {
        String path = "/home/hyperion/".concat(dirname);
        File d = new File(path);
        if (d.exists()) {
            d.delete();
        } else

            d.mkdirs();
    }

    private static void runChrome() {
        String os = System.getProperty("os.name");

        try {
            Process p = Runtime.getRuntime().exec("google-chrome http://readcomiconline.to/ComicList");

            p.waitFor();
            System.out.println(os);

            System.out.println("Google chrome uruchomione");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    private static void czytajChar() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("readme.txt");
            char[] tablica = new char[30];
            fileReader.read(tablica);
            for (char cs : tablica) {
                System.out.print(cs);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void wczytajDoStruktury(File file){

        try (FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            for (int i =0;i<3;i++){
                listas[i] = bufferedReader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void wczytajSpacja(File file){

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()){

                    String[] list = scanner.next().split("lang=");
                    lista.add(list[1]);

                //lista.add(scanner.next());

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }



        public static void main(String[]args) throws IOException {
//        wyjątek();
//        try {
//            otwórzPlik();
//        }catch (IOException e){
//            //System.out.println("IOException found");
//            e.printStackTrace();
//
//        }
            // runChrome();
//        czytajChar();
            //otwórzPlik();

//        dir("dirname");
//    inputStream();
//        runChrome();
        wczytajSpacja(new File("readme.txt"));
            System.out.println(lista.get(1));

        }
    }

