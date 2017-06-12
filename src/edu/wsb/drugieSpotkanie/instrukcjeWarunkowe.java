package edu.wsb.drugieSpotkanie;

import edu.wsb.StandardInput;

/**
 * Created by hyperion on 07.06.17.
 *
 */
public class instrukcjeWarunkowe {




    public static void main(String[] args) {

        /*
            Oprócz operatorów, które manipulują wartościami zmiennych są też inne, które
            zwracają wartość logiczną operacji jak na przykład takiej 3 > 2.
            Jest to prawda.
            dzięki temu możemy przypisać do zmiennej typu boolean coś więcej niż
            tylko true lub false. Możemy przypisać np. 3==2, a operator zwróci nam false
             i przypisze do zmiennej.
         */
        boolean zmiennaLogiczna = 3 ==2;
        /*
        Tego rodzaju operatory logiczne mają przemożną rolę do spełnia, gdy zaczynamy użwać
        instrukcji warunkowych, które w zależności od tego co znajduje się po słowie kluczowym
        if a wewnątrz zwykłych nawiasów.
         */
        if(true)
            System.out.println("Jeśli to widzisz to warunek w instrukcji był prawdziwy");
        /*
            Poniższy fragment kodu niczego nie wypisze w naszej konsoli.
            Warunek wewnątrz instrukcji ma wartość false
         */
        if(false)
            System.out.println("Jeśli to widzisz warunek był prawdziwy");
        /*
            Oczywiście nie musimy na sztywno wpisywać true lub false
         */
        if(3 > 2)
            System.out.println("Liczba 3 była większa niż 2");

        /*
            Należy jednak pamiętać, że w przypadku prawdziwości warunku jest wykonywana tylko
            jedna linijka kodu.
            Jeśli chcemy by wykonało się więcej musimy kod, który chcemy by się uruchamiał
            umieścić pomiędzy klamrami. Nic nie stoi na przeszkodzie, by nawet dla jednej linijki to
            robić.
         */
        if (3>=2){
            System.out.println("Pierwsza linijka");
            System.out.println("Druga linijka");
        }
        /*
            Możemy też podać kilka warunków lub stworzyć drugą instrukcję
            warunkową wewnątrz pierwszej
            Dwa poniższe instrukcje warunkowe są sobie równe.
            && oznacza oraz
         */
        if (3 > 2 && 10 > 5){
            System.out.println("Warunek był prawdziwy");
        }
        if (3 > 2){
            if (10 > 5){
                System.out.println("Warunek był prawdziwy");
            }
        }

        /*
        Możemy też instrukcję warunkową napisać tak, by kod się uruchamiał
        gdy choć jeden z warunków jest spełniony.
        || oznacza lub
         */
        if (3 > 2 || 10 < 5)
        {
            System.out.println("Warunek okazał się prawdziwy");
        }
        /*
            Chcielibyśmy jednak by nasz program jeśli warunek okaże się
            spełniony wykonywał inny fragment kodu, a gdy fałszywy inny.
         */
        if (3 > 2){
            System.out.println("Warunek logiczny prawdziwy");
        }else {
            System.out.println("Warunek logiczny nie był spełniony");
        }
        /*
        Możemy też sprawdzać czy zmienna podana przez użytkownika czy jakaś inna
        jaką używamy spełnia nasze oczekiwania
         */
        int pobranaZmienna = StandardInput.readInt("Podaj liczbę");
        System.out.println("Czekaj");
        if (3>= pobranaZmienna && pobranaZmienna <= 10 ) {
            if (3 == pobranaZmienna)
                System.out.println("Liczba jest równa 3");
            else
                System.out.println("Liczba jest w przedziale zamkniętnym <3,10>");
        }
        else
            System.out.println("Liczba nie spełnia żadnego lub tylko jeden z warunków");

        /*
            Uważać należy na to jakie warunki są łączone poprzez operator &&
         */
        if (pobranaZmienna %3 ==0 && pobranaZmienna <2){
            System.out.println("Ten warunek nigdy nie zostanie spełniony gdyż nie" +
                    "ma takiej liczby, która zarówno będzie mniejsza od 2 i" +
                    "będzie dzielić się bez reszty przez 3");
        }else
            System.out.println("Za każdym razem ten fragment zostanie odpalony");

        /*
        Poniższy fragment kodu sprawdza czy liczba jest mniejsza od 3 lub większa
        od 6
         */
        int liczba = 5;

        if (liczba < 3 || liczba > 6 )
            if(liczba < 5)
            System.out.println("Liczba jest mniejsza od 3 lub większa od 6");


        /*
            W przypadku gdy cały czas sprawdzamy czy liczba jest dokładnie równa jakiejś
            zamiast zagnieżdzonych instrukcji if else może skorzystać ze switch.
            Problemem switch jest to, że musimy niejako na sztywno wpisać w case
            z czym porównujemy
         */
            char znak = StandardInput.readChar("Podaj znak");
        switch (znak){
            /*
                Nie musimy pisać osobno każdego case możemy je tak jak w poniższym
                umieścić jeden po drugim
                Po fragmencie, który dla danego case ma się wykonać używamy break, który to sprawia, że
                wychodzimy z switch.
             */
            case 'q':
            case 'e':
                System.out.println("Wypisałeś q");
                System.out.println("Lub wypisałeś e");
                break;
                /*
                    Default wykonuje się dla każdego innego case
                 */
            default:
                System.out.println("Nie ma takiego przypadku");
                break;
        }


    }

}
