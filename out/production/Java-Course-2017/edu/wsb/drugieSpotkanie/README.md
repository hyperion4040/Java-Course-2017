## IF

W języku java, wyrażenie if  jest powiązane z logiką Boolean.
Jeśli wyrażenie jest true (prawdziwe) to blok kodu powiązany z wyrażeniem
if zostanie wykonany. Jeśli wyrażenie będzie false (fałsz) bieg programu przenosi
się do pierwszej linii po wyrażeniu if, lub do pierwszej linijki po klamrze
zamykającej blok wyrażenia if.

Poniższy kod demonstruje wyrażenie if sprawdzające czy zmienna response zawiera wartość "Yes"

```java
    String response = "Yes";
    if (response == "Yes")
    {
        // kod, który zostanie wykonany jeśli wartość zmiennej response będzie yes
    }
```

Zwróć uwagę na użycie nawiasów klamrowych w przykłądzie. Można ich nie użyć ale wyłącznie gdy ma zostać wykonane tylko jednoliniowe wyrażenie.
Java rozumie, że jeśli nie ma klamr, to pierwsza linia kodu zaraz pod wyrażeniem if(warunek) będzie wykonany gdy warunek będzie true.
Aby uniknąć nieporozumień dobrą praktyką jest używanie klamr za każdym razem.

W Javie wyrażenia if mogą być również połączone z wyrażeniami else (w przeciwnym wypadku).
Kod w bloku wyrażenia else zostanie wykonane gdy warunek if da wynik false (fałsz).

Poniższy przykład ilustruje użycie wyrażeń if oraz else.

```java
String response;
if (response == "connection_failed")
{
    // blok kodu wykonany gdy wartość zmiennej response będzie "connection failed"
}
else
{
    // blok kodu wykonany gdy wartość zmiennej response będzie inna niż "connection failed"
}
```

Wyrażenia if mogą mieć również powiązane wyrażenia else if (wprzeciwnym razie jeśli).
Wyrażenia te są sprawdzane w kolejności, w jakiej występują po wyrażeniu if.
Jeśli któreś z wyrażeń będzie prawdziwe, to blok kodu związany z danym wyrażeniem przejmie kontrolę nad wykonaniem programu -
zostanie on wykonany, a następnie wykona się kod pod wszystkimi powiązanymi wyrażeniami if, else if, else

Poniższy przykład prezentuje jak używać wyrażeń if, else if, else.

```java
String response;
if (response == "connection_failed")
{
    // blok kodu wykonany gdy wartość zmiennej response będzie "connection failed"
}
else if (response == "connection_error")
{
    // blok kodu wykonany gdy wartość zmiennej response będzie "connection error"
}
else
{
    // blok kodu wykonany gdy wartość zmiennej response będzie inna niż
   // wyżej znajdujące się wyrażenia
}
```
Możesz utworzyć tak wiele wyrażeń else if, jak tylko logika Twojego kodu potrzebuje, lub do momentu gdy się zagubisz w tym gąszczu ;).
Jeśli potrzebujesz więcej niż 5 wyrażeń else if - lepszym rozwiązaniem może okazać się użycie wyrażenia switch opisanego poniżej.

## SWITCH

W przypadku gdy jest dużo wyrażeń else if kod może stać się mało czytelny. W tym wypadku lepiej użyć wyrażenia switch. To wyrażenie w łatwy sposób zastępuje wiele wyrażeń else if.

Poniższy przykład pokazuje jak używać switch

```java
String response;
switch (response)
{
   case "connection_failed":
      // blok kodu wykonywany gdy zmienna response będzie "connection_failed".
      break;
   case "connection_success":
      // blok kodu wykonywany gdy zmienna response będzie "connection_success".
      break;
   case "connection_error":
      // blok kodu wykonywany gdy zmienna response będzie "connection_error".
      break;
   default:
      // blok kodu wykonany gdy żaden z powyższych warunków nie będzie spełniony
      break;
}
```

Zwróć uwagę na blok z etykietą default:  Ten blok zostanie wykonany gdy żaden z wyżej zamieszczonych warunków nie zostanie spełniony.

Zwróć uwagę również, że w każdym wyrażeniu case (przypadek) słowo kluczowe break. Ono powduje, że po wykonaniu kodu wewnątrz bloku case, kontrola zostanie przekazana na sam koniec switch'a.
Jeśli chcesz aby kilka case'ów (przypadków) skorzystało z tego samego kodu możesz użyć podejścia "spadającego", tak jak zaprezentowano poniżej.

```Java
String response;
switch (response)
{
   case "connection_success":
      // blok kodu wykonywany gdy zmienna response będzie "connection_success".
      break;
   case "connection_failed":
   case "connection_error":
      // blok kodu wykonywany gdy zmienna response będzie "connection_failed".
      // lub "connection_error;
      break;
   default:
      // blok kodu wykonany gdy żaden z powyższych warunków nie będzie spełniony
      break;
}
```

## Tablica[]

Tablica (Array) jest zbiorem obiektów, które są razem zgrupowane jako jednostka. Możesz pomyśleć o tablicy jak o szeregu elementów, które są tego samego typu.
Możesz stworzyć prostą tablicę, która ma tylko jeden wymiar (listę), dwa wymiary (tabelę), trzy (sześcian) i tak dalej.
Tablice w Javie mają następujące własności:

Każdy element tablicy posiada wartość
Tablice są zero-indeksowe, pierwszy element jest elementem zerowym (pozycja nr zero)
Rozmiar tablicy jest liczbą elementów, które mogą byż do niej włożone
Tablice mogą być jedno-wymiarowe, wielo-wymiarowe lub zagnieżdżone.
Stopień tablicy jest liczbą wymiarów w tablicy.

#### TWORZENIE I UŻYWANIE JEDNO-WYMIAROWYCH TABLIC

Gdy deklarujesz tablicę, określasz ty danych, które ma przechowywać oraz nazwę tablicy.
Zadeklarowanie tablicy, wnosi ją do zakresu programu, ale jeszcze nie alokuje dla niej pamięci
Dzięje się to z chwilą użycia słowa kluczowego new i podaniu rozmiaru tablicy.

Aby zadeklarować jedno-wymiarową tablicę, powinieneś określić  typ elementów tablicy i użyć kwadratowych nawiasów [] aby wskazać, że element będzie przechowywany w tablicy.
Następnie określasz rozmiar tablicy gdy alokujesz pamięć używając słowa kluczowego new.
Rozmiar tablicy może być dowolnym wyrażeniem dającym liczbę rzeczywistą.

Poniższy przykład pokazuje jak stworzyć jedno-wymiarową tablicę liczb rzeczywistych, w której są indeksy od 0 do 9.

```java
int[] nazwaTablicy = new int[10];
```

Możesz również stworzyć tablicę i zainicjalizować ją wartościami w tym samym czasie, tak jak pokazano to na następnym przykładzie.
Kompilator sam określi jak dużą tablicę (rozmiar) ma stworzyć, patrząc na ilość elementów w klamrach:

Można to zrobić na dwa sposoby:

```java
int[] nazwaTablicy = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
```
lub
```java
int[] nazwaTablicy = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
```

Na spotkaniu korzystaliśmy z pierwszego.

#### DOSTĘP DO DANYCH W TABLICY

Do danych w tablicy możesz dostać się na kilka sposobów, takich jak wskazanie indeksu elementu, który potrzebujesz (wskazanie pozycji w tablicy), lub przez przyjście przez całą tablicę i zwracanie każdego elementu po kolei.

Poniższy przykład używa indeksu aby dostać się do elementu o indeksie 2

```java
// dostęp do danych po indeksie
int[] numerki = { 1, 2, 3, 4, 5 };
//zmienna liczba będzie miała wartość 3
int liczba = numerki[2];
```

Uwaga: Tablice są zero-indeksowe, więc pierwszy element w każdym wymiarze ma indeks równy 0.
Ostatni element będzie mieć indeks równy N-1, gdzie N oznacza liczbę elementów.

Przejść przez tablicę możesz na przykład przez użycie pętli for.
Możesz użyć własności tablicy length aby określić kiedy zatrzymać pętlę.
Poniższy przykład pokazuje jak użyć pętlę for do przejścia przez tablicę.

```java
// przejście przez tablicę
int[] numerki = { 1, 2, 3, 4, 5 };
for (int i = 0; i < numerki.Length; i++)
{
    int liczba = numerki[i];
    //...
}
```

#### TABLICE WIELO-WYMIAROWE

Tablica może mieć więcej niż jeden wymiar. Liczba wymiarów koresponduje z ilością indeksów potrzebnych do wskazania danego elementu w tablicy.
Możesz określić do 32 wymiarów, ale w rzeczywistości rzadko potrzebujesz więcej niż trzy.
Tablice wielowymiarowe deklarujesz tak jak tablice jednowymiarową, ale oddzielasz wymiary przecinkiem.
Poniższy przykład demonstruje jak stworzyć tablicę int-ów o dwóch wymiarach.

```java
// tablica o długości 10 (rzędy) i szerokości 10 (kolumny)
int[ , ] tablica = new int[10,10];
```

Aby dostać się do elementu w wielo-wymiarowej tablicy musisz uwzględnić wszystkie indeksy, tak jak w poniższym przykładzie.

```java
// dostęp do elementu w pierwszym wierszu i pierwszej kolumnie
int value = arrayName[0,0]
//dostęp do elementu w pierwszym wierszu i drugiej kolumnie
int value2 = arrayName[0, 1];
//dostęp do elementu w drugim wierszu i pierwszej kolumnie
int value2 = arrayName[1, 0];
```

#### TABLICE ZAGNIEŻDŻONE

Tablica zagnieżdżona jest po prostu tablicą w której są tablice. Rozmiary wewnętrznych tablic mogą być różne.
Zagnieżdżone tablice mogą być przydatne do modelowania rozproszonych struktur danych, w których nie chcesz alokować pamięci dla każdego elementu, jeśli nie będzie używany.
Poniższy przykład pokazuje jak zdeklarować i zainicjalizować tabicę zagnieżdżoną. Uwaga - musisz określić rozmiar pierwszej tablicy, ale nie możesz określić rozmiarów tablic wewnętrznych! Pamięć dla każdej tablicy wewnętrznej alokojesz oddzielnie, używając słowa kluczowego new.

```java
int[][] tablicaZagniezdzona = new int[10][];
tablicaZagniezdzona [0] = new Type[5]; // możesz określić różne rozmiary
tablicaZagniezdzona [1] = new Type[7];
//...
tablicaZagniezdzona [9] = new Type[21];
```

## PĘTLE FOR, FOREACH

#### PĘTLA FOR

Pętla for wykonuje blok kodu, aż wartość pewnego wyrażenia zmieni się na false. Pętle for definiuje się w następujący sposób.

```java
for ([inicjalizatory]; [warunek]; [iterator])
{
   // kod, który ma być powtarzany
}
```

inicjalizatory - ta część używana jest do zainicjalizowania wartości, która będzie licznikiem pętli.
W każdej iteracji (powtórzeniu), pętla sprawdza czy wartość licznika jest w granicy określonej w części warunek, i jeśli tak jest, wykonywane jest ciało pętli.
Na końcu każdego powtórzenia część iterator odpowiedzialna jest za zmianę wartości licznika.

Poniższy kod prezentuje jak użyć pętli for do wykonania bloku kodu 10 razy.

```java
for (int i = 0 ; i < 10; i++)
{
    // kod do wykonania
}
```

W powyższym przykładzie: i = 0; jest licznikiem (inicjalizatorem), i < 10;jest warunkiem, and i++ jest iteratorem.

#### PĘTLA FOREACH

Chociaż pętla for jest łatwa w użyciu, to czasami może stwarzać wyzwania, w zalezności od sytuacji. Na przykład pomyśl o przejściu przez wszystkie elementy w tablicy. Musiałbyś wiedzieć ile elementów się w niej znajduje. W wielu sytuacjach jest to możliwe, ale czasami możesz spotkać kolekcję, w której elementy są dynamiczne i ich ilość nie jest znana w momencie kompilacji (zamiany kodu napisanego przez ciebie, na kod zrozumiały przez komputer). W takich przypadkach lepiej jest użyć pętli foreach.

Poniższy przykład pokazuje użycie pętli foreach aby przejść przez wszystkie elementy tablicy o typie string.

```java
string[] imiona = new string[10];
// przetwórz każdy element w tablicy
foreach (string name in names)
{
    // kod do wykonania
}
```

Java bierze na siebie określenie ilości elementów w kolekcji i zatrzyma się, gdy osiągnie koniec.

## PĘTLE WHILE, DO...WHILE

#### PĘTLA WHILE

Pętla while pozwala tobie na wykonywanie bloku kodu, dopóki podany warunek jest prawdziwy (true). Np. możesz użyć pętli while aby żądać od użytkownika podania prawidłowych danych. Pętla while będzie się powtarzała do momentu podania danych spełniających warunek wyjścia (z pętli).

Poniższy przykład pokazuje jak używać pętli while.

```java
String odpowiedz = StandardInput.ReadLine();
while (odpowiedz != "Koniec")
{
    // przetwórz dane
    odpowiedz = StandardInput.ReadLine();
}
```

 Jest wymagane aby zawrzeć odpowiedz = StandardInput.ReadLine(); wewnątrz pętli. Nie zrobienie tego będzie skutkować nieskończoną pętlą , ponieważ warunek wyjścia nigdy nie zostanie spełniony.

#### PĘTLA DO

Pętla do jest czasami określana jako pętla do…while. Jest ona bardzo podobna do pętli while, z tą różnicą, że kod wewnątrz pętli do zawsze zostanie wykonany przynajmniej jeden raz. W pętli while, jeśli warunek jest od początku równy false, ciało pętli nie zostanie wykonane.

Pętli do możesz użyć głównie w przypadku gdy kod wykona się odpowiednio do danych podanych przez użytkownika. W tym scenariuszu wiesz, że program będzie musiał przynajmniej jeden raz zapytać użytkownika o podanie danych, i dlatego możesz użyć pętli do.

```java
do
{
    // Process the data.
    odpowiedz = PytajUzytkownika();
}
while (odpowiedz != "Koniec");
```

