package edu.wsb.pierwszeSpotkanie;

import edu.wsb.StandardInput;

public class ZmienneOrazOperatory {

    /*
        Poniżej znajduje się metoda główna metoda main, która uruchamia nasz program.
     */
    public static void main(String[] args) {

        /*
            Typ byte jest najmniejszy ze wszystkich typów całkowitych
            Poniżej jest osobno zadeklarowanie zmiennej numerSali jako typu byte
            oraz zainicjowanie tzn. przypisanie do zmiennej numerSali wartości 113
         */
        byte numerSali;
        numerSali = 113;
        /*
            Poniżej jest jednoczesne zadeklarowanie zmiennej oraz przypisanie wartości
         */
        short liczbaDniWRoku = 365;
        /*
            Przypisanie wartości nie musi następować "na sztywno", ale można też pobrać od użytkownika
            Tutaj wykorzystano jedną z metod z zewnętrznej biblioteki Java-Course-Library
         */
        int średnicaRównika = StandardInput.readInt("Podaj średnicę równika ?");
        /*
            Pomimo deklaracji zmiennej jako int można do niej wpisać wartość innego typu.
            W przypadku przypisania zmiennej typu mniejszego do zmiennej typu większego
             Można to zrobić w poniższy sposób. Nazywa się to castowaniem niejawnym.
         */
        long średnicaRównikaDoWypisania = średnicaRównika;
        /*
            W przypadku przypisania zmiennej większej do mniejszej należy zastosowanie castowanie jawne.
            Dokonuje się to poprzez umieszczenie (<Nazwa typu do którego castujemy>) przed nazwą zmiennej
            która ma zostać przypisana do nowej zmiennej.
            Nie tutaj znaczenia, że wartość liczbowa jest zarówno w zakresie obu typów.
            To niejako zabezpieczenie przed przypadkowym przypisaniem.
            Castując mówimy, tak wiem, że jeśli liczba będzie zbyt duża to pojawią się problemy.
         */
        int średnicaDoWypisania = (int) średnicaRównikaDoWypisania;

        /*
            Jak już wspominałem na spotkaniu String jest bardzo szczególnym rodzajem obiektu.
            Tak jak pozostałe obiekty jest przekazywany przez referencję, ale
            zachowuje się w poniższym przypadku jak zmienne proste(byte, int ...)
            Dlatego też poniższym kodzie nie można było zauważyć przekazywania poprzez referencje
         */
        String tekst = "Średnica równika wynosi ";
        String tekstNowy = "\n Średnica równika teraz wynosi ";
         tekstNowy = tekst;
         tekst = " Średnica";

        /*
            Poniższe dwie linijki wypisujemy za pomocą metody println tekst w konsoli
            Należy pamiętać o dwóch kwestiach
            + numerSali jest niejako doklejany do końca Stringa, którego ostatnim elementem
            jest spacja. Gdyby jej nie było to wypisałoby: Jesteśmy wa sali113
         */
        System.out.println("Jesteśmy w sali " + numerSali);
        /*
            Kolejna kwestia to metoda println, która wypisuje String i od razu przechodzi
            do następnej linii. Ostatnia linijka może być wypisana już z użyciem metody print
         */
        System.out.println("Za tydzień też będziemy " + numerSali);
        System.out.print("Liczba dni w bieżącym roku wynosi " + liczbaDniWRoku);
        /*
            Poniższe dwie linijki zawierały ten sam tekst w czudzysłowie.
            Zamiast pisać go dwa i więcej razy stworzyliśmy zmienną String
            z przypisanym tekstem jaki zamierzaliśmy wypisać

            Tutaj wykorzystujemy metodę printf, za pomocą możemy nie tylko wypisać
            coś w konsoli, ale to uprzednio sformatować
            %s odnosi się do Stringa
            %d odnosi się do liczby całkowitej
            Po przecinku zmienne muszą pojawić się w kolejności ich placeholderów &s %d
         */
        System.out.printf("\n%s %d",tekst,średnicaRównika);
        /*
            \n przejdź do następnej linii
         */
        System.out.printf("\n%s %d",tekstNowy,średnicaRównikaDoWypisania);

        /*
            zmienna logiczna boolean może przyjmować wartości true lub false
            2>3 również może przyjąć, a dokładniej wynik, który jest false
         */
        boolean czyPrawda = true;

        /*
            Zmienna znakowa, która przyjmuje znaki
         */
        char znak = '1';

        /*
            Nie wszystko można przedstawić za pomocą liczb całkowitych
            Dowolne liczby z kropką nie umieszczone w cudzysłowie są traktowane jako
            liczba typu double. Chcąc taką przypisać do zmiennej typu float należy
            albo castować jawnie do float jak w kodzie niżej lub dodając do liczby f
            jak w drugiej linijce
         */
        float castowanaPrzekątnaEkranu = (float) 15.6;
        float przekątnaEkranu = 15.6f;
        /*
            Do zmiennej typu zmiennoprzecinkowego float lub double
            możemy przypisać liczbę całkowitą, a zostanie ona zapisana jako -18.0
         */
        double temperatura = -18;
        /*
            Metoda printf pozwala formatować liczby
            umieszczając pomiędzy % a f .<liczba cyfr znaczących>
            określamy ile cyfr po przecinku zostanie wypisanych
         */
        System.out.printf("Przekątna ekranu wynosi %.1f",przekątnaEkranu);
        /*
            W poniższej linijce oprócz określenia 2 cyfr po przecinku
            ustalamy, że ma zostać wypisany znak liczby poprzez dodanie +
            Gdyby go nie było to liczba ujemna zostałaby przedstawiona ze znakiem
            ale dodatnia już nie. W przypadku zmiennej temperatura jest to użyteczne sformatowanie
         */
        System.out.printf("\n Temparatura wynosi %+.2f", temperatura);



    }
}
