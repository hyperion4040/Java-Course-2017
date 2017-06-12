## METODY STATYCZNE

#### DEKLAROWANIE METOD STATYCZNYCH

Możliwość deklarowania metod i ich wywołania jest jedną z fundamentalnych elementów programowania.
Pozwala to umieścić pisany przez nas kod w pudełkach, które możemy uruchomić w zależności
od potrzeby.

Metoda jest deklarowana przez użycie sygnatury metody oraz ciała metody.

Sygnatura odpowiada za dostarczenie modyfikatora dostępu, typu zwracanego przez metodę, nazwy metody oraz listy parametrów.

Ciało metody zawiera implementację tego co metoda ma robić. Każdy ze składników sygnatury metody przedstawiono poniżej:

**Modyfikator dostępu** - używany aby kontrolować dostępność metody (skąd może być wywołana)
**private** - najbardziej restrykcyjny, pozwala na wywołanie metody tylko z zawierającej ją klasy.
**public** - najmniej restrykcyjny, pozwalający na dostęp do metody z każdego miejsca programu
**protected** - pozwala na dostęp do metody z klasy zawierającej i z klas dziedziczących

**Modyfikator static** -  wskazuje, że metoda jest członkiem statycznym klasy a nie członkiem instancji jakiegoś obiektu.

**Typ zwracany** - wskazuje jaki typ danych metoda zwróci. Użyj void jeśli metoda nie zwraca żadnych danych.

**Nazwa metody** - wszystkie metody potrzebują nazwy, abyś wiedział co masz wywołać w swoim kodzie.
**Lista parametrów** - oddzielona przecinkami lista parametrów przyjmujących argumenty.

Przykładowa metoda:

```java
public static int IleSamoglosek(string wyraz)
{
   // kod obliczający ilość samoglosek
}
```

W powyższym przykładzie, public to modyfikator dostępu,static określa, że to metoda klasy(nie trzeba tworzyć obiektu, by ją wywołać) int to typ zwracany, IleSamoglosek to nazwa metody, a string wyraz to lista parametrów. Zauważ, że lista parametrów określa typ danych oraz nazwę parametru).

#### WYWOŁYWANIE METODY

Metodę wywołujesz aby wywołać kod w niej zawarty z jakiegoś miejsca w programie. Nie musisz rozumieć, jak kod w metodzie pracuje. Nie musisz nawet mieć dostępu do kodu, jeśli metoda znajduje się w bibliotece do której nie masz kodu źródłowego.

Aby wywołać metodę określasz nazwę metody i dostarczasz argumenty, które korespondują z parametrami w nawiasach.

Poniższy kod pokazuje jak wywołać metodę Szyfruj, dostarczając zmienne string oraz int  aby spełnić wymagania określone sygnaturą metody.

```java
// deklaracja metody
public static String Szyfruj(string zdanie, int kodSzyfrujacy)
{
   // Tu przetwarzamy dane
}
// deklarujemy dane wejściowe
String wyraz = "alibaba";
int kodSzyfujacy = 13324;
// wywołanie metody, dane wyjściowe musimy przypisać do zmiennej
// tego samego typu co opisany w sygnaturze metody
string wyrazZaszyfrowany = Szyfruj(wyraz, kod);
```

#### ZWRACANIE DANYCH

Jeśli metoda zwraca jakąś wartość, określasz w jaki sposób się nią zająć, zazwyczaj przypisując ją do zmiennej.

Poniższy kod pokazuje jak przechwycić zwracaną wartość metody  GetServiceName  do zmiennej  serviceName.

public static String GetServiceName()
{
   return "FourthCoffee.SalesService";
}
String serviceName = GetServiceName();

#### PRZECIĄŻANIE METOD

Gdy definiujesz metodę, możesz uświadomić sobie, że wymaga ona innego zestawu informacji w różnych okolicznościach. Możesz zdefniować przeciążone metody aby stworzyć wiele metod z tą samą funkcjonalnością, akceptujące różne parametry w zależności od kontekstu w którym są wywoływane.

Metody przeciążone mają tą samą nazwę, aby pokazać, że mają współny cel. Jednak metody przeciążone muszą mieć różne sygnatury, aby odróżnić je od pozostałych metod w danej klasie.

Sygnatura metody zawiera jej nazwę oraz listę parametrów. Typ zwracany nie jest częścią sygnatury, dlatego nie możesz stworzyć metod przeciążonych, które różnią się tylko typem który zwracają. Nie możesz również tworzyć metod przeciążonych, różniących się kolejnością parametrów.

Poniższy kod prezentuje trzy wersje metody StopService, wszystkie o unikalnych sygnaturach.

```java
void StopService()
{
   // Ta metoda nie przyjmuje argumentów
}
void StopService(string serviceName)
{
   // Ta metoda przyjmuje tylko jeden argument typu string
}
void StopService(int serviceId)
{
   // Ta metoda przyjmuje jeden argument typu int
}
```

Gdy wywołasz metodę StopService,  masz wybór, której przeciążonej metody użyć. Po prostu dostarczasz odpowiedni argument aby spełnić którąś z sygnatur, a dalej kompilator sam określi, którą metodę użyć na podstawie dostarczonych przez ciebie argumentów.

## KLASY ORAZ OBIEKTY

W Javie, możesz zdefiniować własny typ przez utworzenie klasy. Klasy jako konstrukcje języków programowania, są centralnymi punktami języków zorientowanych obiektowo (object oriented programming). Pozwala to na enkapsulację (zamykanie) zachowań i charakterystyk każdego logicznego bytu (encji) w możliwy do wielokrotnego wykorzystania i rozszerzalny sposób.

W Javie, klasa jest konstrukcją, którą możesz użyć aby zdefiniować własny typ danych. Gdy tworzysz klasę, tak naprawdę tworzysz szkic (rysunek techniczny) typu. Klasa definiuje zachowania i charakterystyki (członkowie klasy), które są dzielone przez wszystkie instancje tej klasy. Te charakterystyki i zachowania reprezentujesz definiując metody, pola (field) oraz kostruktory obiektów.

Załóżmy, że tworzysz klasę o nazwie DrinksMachine.

Używasz słowa kluczowego class aby zdefiniować klasę, tak jak na poniższym przykładzie:

//Deklarowanie klasy
public class DrinksMachine
{
    // metody, pola, właściwości i zdarzenia deklarujesz tutaj
}

Słówko class jest poprzedzone modyfikatorem dostępu np. public

Nazwa klasy musi być taka sama jak nazwa pliku w jakim się znajduje dana klasa.

Uzywamy pól by zdefiniować charakterystyki maszyny do napojów (naszej DrinksMachine) takie jak producenta, model, wiek, czas do przeglądu. Stworzysz metody aby zaprezentować to co maszyna może zrobić, na przykład zrobić espresso lub zrobić latte.

// definiowanie czlonkow klasy
public class DrinksMachine
{
   //Poniżej mamy pole z modyfikatorem dostępu private
   private String location;
   //poniżej zaś metody specjalne(getter oraz setter), które
   //umożliwią nam zmianę wartośći zmiennej lub jej pobranie
   //Są to metody, które by użyć należy wpierw stworzyć obiekt i na nim
   //te metody uruchomić.
    public int getLocation() {
           return location;
       }

       public void setLocation(int location) {
           this.location = location;
       }




   public void MakeCappuccino()
   {
      // logika metody
   }
   public void MakeEspresso()
   {
      // logika metody
   }
   //Możemy zdefiniować też metody statyczne
   public static void wypisz(){
            //logika metody
   }

}
```

#### TWORZENIE OBIEKTU

Klasa jest tylko szkicem dla typu. Aby użyć charakterystyki i zachowania, które zdefiniowałeś wewnątrz klasy, musisz stworzyć instancję tej klasy. Instancja klasy nazywana jest obiektem.

Aby stworzyć nową instancję klasy musisz użyć słówka new, jak na poniższym przykładzie:

```java
// Instancjalizacja klasy
DrinksMachine dm = new DrinksMachine();
```

 Tworząc instancję w ten sposób, właściwie dwie rzeczy się dzieją:

1. Tworzysz nowy obiekt w pamięci bazujący na typie DrinksMachine
2. Tworzysz referencję o nazwie dm, która wskazuje na nowy obiekt DrinksMachine

Po zainicjalizowaniu obiektu, możesz użyć dowolnego jej członka, którego zdefiniowałeś.

```java
DrinksMachine dm = new DrinksMachine();
dm.setLocation("Gdynia");
dm.getLocation();

```

Co z metodą statyczną ? Uruchamiamy ją w podobnej konwencji, ale zamiast nazwy obiketu używamy nazwy klasy, w której ta metoda się znajduję.

```java
DrinksMachine.wypisz();
```

#### ENKAPSULACJA

Często uważana za pierwszy filar programowania obiektowego, enkapsulacja może być użyta aby opisać dostępność członków klasy. Java daje nam modyfikatory dostępu aby ułatwić enkapsulację twojej klasy.

Modyfikatory dostępu są identyczne do tych jakie używaliśmy dla metod.

#### KONSTRUKTORY

Czytając artykuł powyżej, w sekcji instancjalizacja klas zauważysz taką linijkę kodu:

```java
DrinksMachine dm = new DrinksMachine();
```
 Zauważ, że składnie jest podobna do wywoływania metody. Tak jest, ponieważ gdy powołujesz instancję klasy, tak włąściwie wywołujesz specjalną metodą zwaną konstruktorem. Konstruktor jest metodą w klasie o tej samej nazwie co klasa. Konstruktory nie zwracają żadnej wartości, co więcej nie można w ich deklaracji użyć słówka void. Konstruktory, są zazwyczaj używane do dostarczenia początkowych wartości dla członków klasy
```java
 // tworzenie konstruktora
 public class DrinksMachine
 {
     public int Age { get; set; }
     public DrinksMachine()
     {
         Age = 0;
     }
 }
 ```

Konstruktor, który nie przyjmuje żadnych parametrów jest konstruktorem domyślnym. Jeśli w swojej klasie nie umieścisz żadnego konstruktora, to zostanie on stworzony automatycznie zamiast Ciebie.

Uwaga: Jeśli już stworzysz jakiś konstruktor z parametrami, a chcesz użyć domyślnego to już musisz go również stworzyć.

W wielu przyadkach, przydatne jest dla uzytkownikó twojej klasy aby móc określić wartości początkowe dla członków twojej klasy w momencie, gdy tworzony jest obiekt. Na przykłąd, gdy ktoś tworzy nową instancję klasy DrinksMachine, będzie przydatne gdyby mogli określić producenta oraz model w tym samym czasie. Twoja klasa może zawierać wiele konstruktorów, przyjmujących różne parametry, które pozwolą użytkownikom kodu na inicjalizowanie obiektów z różnymi wartościami. Przypomnij sobie metody przeciążone.
Poniższy przykład pokazuje dodanie kilku konstruktorów do klasy

```java
// dodanie wielu konstruktorów
public class DrinksMachine
{
    private int Age;
    private string Make;
    private string Model;
    // tutaj wirtualnie są settery oraz gettery

    public DrinksMachine(int age)
    {
        this.Age = age;
    }
    public DrinksMachine(string make, string model)
    {
        this.Make = make;
        this.Model = model;
    }
    public DrinksMachine(int age, string make, string model)
    {
        this.Age = age;
        this.Make = make;
        this.Model = model;
    }
}
```


 Konsumenci twojej klasy mogą użyć dowolny z konstruktorów aby stworzyć instancję twojej klasy, w zależności od informacji, którą maja w danym czasie. Na przykład:

```java
// wywołanie konstruktorów
DrinksMachine dm1 = new DrinksMachine(2);
DrinksMachine dm2 = new DrinksMachine("Fourth Coffee", "BeanCrusher 3000");
DrinksMachine dm3 = new DrinksMachine(3, "Fourth Coffee", "BeanToaster Turbo");
```

## KOLEKCJE

Kolekcje to specjalna grupa klas, które służą do tego, by przechowywać dane.

Zostaną omówione dwie główne kolekcje takie jak List oraz Set oraz taka, która stricte kolekcją nie jest a mianowicie Map

#### LIST

**java.util.List**

Lista to kolekcja, w której każdy element ma przyporządkowany numer kolejny (indeks). Podstawowe operacje na liście to dodaj element ( add( element) ) oraz pobierz element z pozycji i (  get(int position) ).
Obiekty na liście mogą się powtarzać – tj. ten sam obiekt może się pojawić na liście kilka razy (np. na pozycjach 0, 1 i 2)

**Najpopularniejsze rodzaje**

**ArrayList** – przechowuje dane wewnętrznie w tablicy. Opcja optymalna jeśli znamy docelowy rozmiar listy lub operacji dodawania wykonujemy mało w stosunku do operacji odczytu, a operacje odczytu nie są w pętli for-each
**LinkedList** – przechowuje dane w postaci powiązanej, wydajniejsza w sytuacjach w których dodajemy wiele elementów, a odczyt odbywa się sekwencyjnie (odczytujemy elementy za pomocą iteratora lub pętli for-each)

```java
List<String> lista = new ArrayList<String>();
lista.add("pierwszy");
lista.add("drugi");
System.out.println(lista.get(1)); //wypisze "drugi"

```

W nawiasach ostrych za nazwą kolekcji piszemy Typ jakiego ma być kolekcja.

#### SET

**java.util.Set**

Set (zbiór) to kolekcja, w której elementy nie mają przyporządkowanego numeru kolejnego (indeksu), a dostęp do nich odbywa się za pośrednictwem iteratora. Podstawowe operacje na tym zbiorze to dodaj element ( add(E element) ) oraz pobierz itertor ( Iterator<E> iterator() ).
Obiekty w zbiorze nie mogą się powtarzać – tj. ten sam obiekt można dodać do zbioru wielokrotnie, ale będzie on w nim przechowywany tylko jeden raz

**Najpopularniejsze rodzaje**

**HashSet** – podstawowa implementacja, wykorzystuje mechanizm hashCode() wbudowany w język Java do organizacji przechowywania
**TreeSet**– przechowuje elementy w postaci drzewa, posortowane, gwarantowana złożoność przy wstawianiu elementów (może być to istotne w przypadku dużych zbiorów)

```java
Set<String> zbior = new HashSet<String>();
zbior.add("pierwszy");
zbior.add("drugi");
for (String ciagZnakow : zbior) {
    System.out.println(ciagZnakow);
}
```

#### MAP

**java.util.Map**

Mapy, choć nie są formalnie kolekcjami z punktu widzenia języka Java (nie są typu Collection), także służą do przechowywania elementów. Wyróżnia je to, że przechowują nie tyle same elementy, co mapowanie klucz-wartość, tzn. jeden obiekt (klucz) wskazuje na inny obiekt (wartość).
W przypadku map mamy przede wszystkim operację dodawania ( put( key,  value) ) oraz pobierania elementu (  get( key) ).
Obiekty w mapie mogą się powtarzać, jeśli są wartościami. Klucze muszą być unikalne. Wartości i klucze moga być dowolnego typu.

**Najpopularniejsze rodzaje**

**HashMap** – mapa, której właściwości są podobne do HashSet’a, kolejność oraz przechowywanie wynikają z implementacji funkcji hashCode()
**TreeMap** – elementy są przechowywane w formie posortowanej (wg klucza)

```java
Map<String, Integer> mapa = new HashMap<String, Integer>();
mapa.put("pierwszy", 1);
mapa.put("drugi", 2);
System.out.println(map.get("pierwszy")); //wypisze "1"
```