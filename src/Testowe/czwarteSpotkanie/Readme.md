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

#### Blok Try catch a throws

```java
try{
    //fragment kodu, który zakładamy, że może się nie wykonać
}
catch(Exception e){
    //tutaj decydujemy co z wyjątkiem zrobimy
}
```

Poniższy fragment przedstawia jak wygląda blok try catch.
W przypadku jeśli będziemy chcieli np. otworzyć plik to
od razu ta linijka zostanie podkreślona na czerwono.
IDE zaproponuje nam dwa rozwiązania. Albo użycie bloku try catch, albo
użycie słowa kluczowego przy nazwie metody słowa kluczowego throws oraz nazwy wyjątku.

Słowo kluczowe throws mówi ni mniej, ni więcej. Nie będę się zajmował
obsługą wyjątków, przekaż dalej, niech inni się martwią.

```java
catch(IOException e){
    e.printStackTrace();

}
```

W bloku catch można zwyczajnie wypisać w konsoli jakąś informację związaną z
problemem jaki się pojawił lub użyć powyższej konstrukcji.

#### Finally oraz Try with Resources

Jest jeszcze blok finally, który pojawia się po
bloku catch. Instrukcje wewnątrz tego bloku wykonują się niezależnie czy
zgłoszono wyjątek czy nie. Ten blok najczęściej używa się np. do zamykania pliku, choć wpierw należy sprawdzić
czy pilk, który chcemy zamknąć istnieje.
Sytuacja jest o tyle problematyczna, że wewnątrz bloku finally pojawia się
kolejny blok try..catch.

```java
FileReader fr = null;
      try {
         File file = new File("file.txt");
         fr = new FileReader(file); char [] a = new char[50];
         fr.read(a);   // reads the content to the array
         for(char c : a)
         System.out.print(c);   // prints the characters one by one
      }catch(IOException e) {
         e.printStackTrace();
      }finally {
         try {
            fr.close();
         }catch(IOException ex) {
            ex.printStackTrace();
         }
      }
```

Jednak od javy 7 jest rozwiązanie tego problemu.
Sprawia to, że powyższy kod można zredukować do:

```java
try(FileReader fr = new FileReader("file.txt")) {
         char [] a = new char[50];
         fr.read(a);   // reads the contentto the array
         for(char c : a)
         System.out.print(c);   // prints the characters one by one
      }catch(IOException e) {
         e.printStackTrace();
      }
```

Używając konstrukcji try with resources pozbyliśmy się
bloku finally.

Zostało jeszcze jedno słowo kluczowe, a mianowicie słow  throw.
Mówi ono, że teraz zostanie rzucony wyjątek. Gdzie go można użyć ?
Np. wewnątrz instrukcji warunkowej.
```java
if(50/0){
    throw new Exception("Nie można dzielić przez 0");
    }
```

## I/O

#### Strumienie

Najogólniej i najprościej mówiąc strumienie można przyrównać do
wody w kranie. Chcąc z niej skorzystać wpierw należy odkręcić zawór, a po zakończeniu
pracy z nim go zakręcić, by nie marnować zasobów.

```java
import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("input.txt");
         out = new FileOutputStream("output.txt");

         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}
```

Kod powyżej korzysta ze strumieni bajtów, a poniżej
ze strumienia znaków.


```java
import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {

      try (FileInputStream in = new FileInputStream("input.txt");
          FileOutputStream out = new FileOutputStream("output.txt")
      {
          int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }

   }
}
```

#### Tworzenie folderów

Używając języka java możemy oprócz tworzenia plików, tworzyć
całe katalogi.

```java
 try {
         byte bWrite [] = {11,21,3,40,5};
         OutputStream os = new FileOutputStream("test.txt");
         for(int x = 0; x < bWrite.length ; x++) {
            os.write( bWrite[x] );   // writes the bytes
         }
         os.close();

         InputStream is = new FileInputStream("test.txt");
         int size = is.available();

         for(int i = 0; i < size; i++) {
            System.out.print((char)is.read() + "  ");
         }
         is.close();
      }catch(IOException e) {
         System.out.print("Exception");
      }
```