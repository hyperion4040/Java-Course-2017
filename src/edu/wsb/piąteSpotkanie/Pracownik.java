package edu.wsb.piąteSpotkanie;

/**
 * Created by hyperion on 28.06.17.
 */
public abstract class Pracownik  extends Object implements Osoba{
    String imie;
    String nazwisko;

    Pracownik(){}

    Pracownik(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public abstract void wypiszTechnologie();


    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }

}
