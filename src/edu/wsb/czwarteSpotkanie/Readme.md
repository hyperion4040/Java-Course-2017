## OBSŁUGA WYJĄTKÓW

#### WYJĄTKI

Pisząc kod programu wielokrotnie zakładaliśmy, że
Prosząc o liczbę typu byte nie otrzymamy typu zmiennoprzecinkowego
lub poza zakresem, a już na pewno nie znak lub cały wyraz.

Wiele takich sytuacji można rozwiązać poprzez
sprawdzanie prawdziwości warunku, ale nie zawsze jest to takie
proste.

W takim wypadku do gry wchodzą wyjątki. W języku java
występują dwa rodzaje wyjątków. Checked oraz Unchecked.
Checked są to wyjątki sprawdzane podczas kompilacji i są to
wyjątki, których obsługą powinniśmy się zająć.
Unchecked są to takie, które nie są sprawdzane podczas kompilacji
i z reguły nie powinniśmy w ich obsługiwać.

#### Blok Try catch

```java
try{
    //fragment kodu, który zakładamy, że może się nie wykonać
}
catch(Exception e){
    //tutaj decydujemy co z wyjątkiem zrobimy
}
```

Jak na powyższym fragmencie kodu widać
