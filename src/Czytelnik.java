public class Czytelnik {
    private String imie;
    private String nazwisko;
    private int numerKarty;
    private int liczbaWypozyczen;

    public Czytelnik(String imie, String nazwisko, int numerKarty, int liczbaWypozyczen) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKarty = numerKarty;
        this.liczbaWypozyczen = liczbaWypozyczen;
    }

    public void wypiszDane() {
        System.out.println("------- CZYTELNIK -------" + "\nImię: " + imie + "\nNazwisko: " + nazwisko + "\nNumer karty: " + numerKarty + "\nLiczba wypożyczeń: " + liczbaWypozyczen);
    }

    public void zwiekszLiczbeWypozyczen(int ile){
        liczbaWypozyczen = liczbaWypozyczen + ile;
    }

    public void zmniejszLiczbeWypozyczen(int ile){
        liczbaWypozyczen = liczbaWypozyczen - ile;
    }
}


//Rozbuduj projekt o klasę Czytelnik. Ma ona reprezentować użytkownika biblioteki i przechowywać
//podstawowe informacje o stanie wypożyczeń.
//• pola: imie, nazwisko, numerKarty, liczbaWypozyczen
//• konstruktor ustawiający dane czytelnika
//• metody: wypiszDane(), zwiekszLiczbeWypozyczen(), zmniejszLiczbeWypozyczen()
//• w Main utwórz co najmniej dwóch czytelników i wywołaj ich metody