package edu.wsb.pierwszeSpotkanie;

/**
 * Created by hyperion on 31.05.17.
 */
public class Operatory {

    public static void main(String[] args) {

        /*
            Maszyna doskonale radzi sobie z operacjami jak dodawanie, odejmowanie i mnożenie
            liczb całkowitych, ale już ze liczbami zmiennoprzecinkowymi już nie.
            W poniższym przykładzie bez zastanowienia każdy człowiek powiedziałby
            wynik to 0.3
         */
        double sumaCzęści = 0.1 + 0.1 + 0.1;
        /*
            Używając tej metody powiemy..wynik dobry, ale metoda wypisuje 6 cyfr znaczących
            po przecinku
         */
        System.out.printf("%f",sumaCzęści);
        /*
            Ta metoda wypisze wszystkie dostępne aż do końca zakresu zmiennej i widzimy, że
            nie wyszło dokładnie 0.3
         */
        System.out.println("\n A teraz wynosi " + sumaCzęści);
        /*
            A jak z poniższym mnożeniem ?
         */
        double sumaInnychCzęści = 0.1 * 5;
        /*
            Wypisuje dobrze. Dlaczego raz dobrze, a raz źle ?
            Maszyna zapamiętuje liczby jako sumę potęg liczby 2.
            O ile przedstawienie np. 3 nie jest problemem
            to przedstawienie 0.1 i pomnożenie przez 3 już jest
         */
        System.out.println("\n Suma wynosi " + sumaInnychCzęści);

        /*
            Wspomniane zostało, że z liczbami całkowitymi sobie maszyna doskonale radzi, ale do
            czasu jak nie każemy jej dzielić.
            Zaokrąglając powinno wyjść 2, a wynik to 1
            Maszyna dzieli, ale jak widzi . to wszystko co za nią ścina.
            Dlatego wychodzi 1, a nie 2
         */
        int wynikDzielenia = 3/2;
        System.out.println(wynikDzielenia);
        /*
            Tutaj to powinno jak nic wyjść 1.5, ale znowu wychodzi 1.0
            Jak maszyna nie widzi . to traktuje liczby jako int. Dzieli i wychodzi 1.
            A potem jak przypisuje wartość całkowitą do zmiennej double to dodaje .0
            i mamy wynik 1.0
         */
        double wynikDzieleniaCałkowitych = 3/2;
        System.out.println(wynikDzieleniaCałkowitych);
        /*
            Możemy temu przeciwdziałać na 3 sposoby:
            poprzez castowanie
         */
        double dzielenie1 = (double) 3/2;
        System.out.println(dzielenie1);
        /*
            Poprzez zamienienie 2 na 2.0, 3 na 3.0 lub obu liczb
            Sprawia to, że już maszyna zaczyna to taktować jak dzielenie liczb zmiennoprzecinkowych
         */
        double dzielenie2 = 3/2.0;
        System.out.println(dzielenie2);
        /*
            Lub poprzez dodanie d lub f
            Wówczas maszyna całą liczbę traktuje jako odpowiednio double jak pojawiło się d
            lub jako float jak było f
         */
        double dzielenie3 = 3/0d;

        /*
            Do tej pory przypisywaliśmy wartośći do zmiennych na różne sposoby.
         */
        int liczba = 1;
        /*
            Poniżej są 3 różne sposoby na zwiększenie wartości zmiennej liczba o 1
            Pierwsze dwie można zastosować również w przypadku dodawania innych liczb niż 1
            Analogicznie z odejmowaniem, mnożeniem i dzieleniem
            odpowiednio -= *= /=
         */
        liczba = liczba +1;
        liczba += 1;
        liczba ++;
        System.out.println("Wartość zmiennej liczba =1 zwiększaliśmy 3 razy i wynosi: "+ liczba);
        int liczba2 = 4;
        liczba2 -=2;
        System.out.println(liczba2);

        int liczba3 = 5;
        liczba3 *= 2;
        System.out.println(liczba3);

        int liczba4 = 6;
        liczba4 /= 3;
        System.out.println(liczba4);





    }

}
