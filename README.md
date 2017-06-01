##Zmienne, Typy danych 

####Zmienna

Jest to obszar pamięci komputera, któremu nadaliśmy nazwę oraz określiliśmy jego typ.

####Typy danych

Program napisany w języku java przechowuje i manipuluje dwoma rodzajami typów danych.

**Typy zmiennych przekazywane przez wartość** nazywają się tak, gdyż w rzeczywistości przechowują daną wartość.
 
**Typy zmiennych przekazywane przez referencję** nazywają się tak, gdyż nie przechowują aktualnej wartości zmiennej,a jedynie referencję do niej.

**Typy proste - przekazywane przez wartość**

![Java primitive types](http://www.write-technical.com/126581/session2/index.6.gif)

##Identyfikatory

Są to nazwy nadawane przez programistę poszczególnym elementom programu.

**Class** Klasa - klasy są "rysunkami technicznymi" dla typów referencyjnych. Określają jaką strukturę przyjmie obiekt, gdy utworzymy instancję klasy.

**Method** Metoda - metody są odrębnymi częściami funkcjonalności w aplikacji, ich odpowiednikiem w programowaniu nie-obiektowym są funkcje

**Variable**  Zmienna - jest identyfkatorem tworzonym aby przechowywać wartości lub referencje do obiektów w twoim kodzie. Zmienna w uproszczeniu jest nazwaną częścią miejsca w pamięci.


Język Java jest silnie typowalnym językiem. Oznacza to, że chcąc utworzyć zmienną należy podać jej typ.
Zmienną można zainicjować (przypisać do niej wartość) od razu podczas deklaracji lub później. 

Tak wygląda utworzenie zmiennej i jednoczesna inicjalizacja.

```
int mojaZmienna = 0;
```

Tak natomiast utworzenie zmiennej i oddzielna inicjalizacja
```
int mojaZmienna;
mojaZmienna =0;
```

**Słowa kluczowe w języku Java**

![Java keywords](http://codetpoint.com/wp-content/uploads/2015/03/java-tutorial-keywords-in-java.jpg)

##Operatory

Operator jest znakiem używanym na operandach.

Przykłady użycia operatorów znajdują się kodzie źródłowym.

![Operatory](http://ecomputernotes.com/images/Operator-Precedence.jpg)

##Konwersja(Castowanie)

Czasem sytuacja wymaga przypisania do typu jednego rodzaju wartości innego typu.
W języku java występują dwa rodzaje konwersji.
Niejawna(implicit) oraz Jawna(Explicit).

W sytuacji gdy do zmiennej o większym przedziale wartośći umieszczamy zmienną 
o mniejszym przedziale dostępnych wartości możemy użyć konwersji niejawnej. 

Wygląda ona następująco:

```
int myInt = 45000;
long myLong = myInt;
```

Z kolei jeśli chcemy do zmiennej o mniejszym zakresie przypisać zmienną o 
większym zakresie musimy dokonać konwersji(castowania)
jawnego, nawet pomimo tego, że wartość zmiennej jest zarówno w zakresie 
jednego jak i drugiego typu:

```
double myDouble = 123.4;
int myInt;
myInt = (int) myDouble;
```