public class Main {
    public static void main(String[] args) {
    Biblioteka biblioteka = new Biblioteka(3);

    Ksiazka ksiazka = new Ksiazka("Pan Tadeusz", "Adam Mickiewicz", 300, true);
    Ksiazka ksiazka1 = new Ksiazka("Lalka", "Bolesław Prus", 400, true);
    Ksiazka ksiazka2 = new Ksiazka("Zbrodnia i kara", "Fiodor Dostojewski", 500, false);


    biblioteka.dodajKsiazke(ksiazka);
    biblioteka.dodajKsiazke(ksiazka1);
    biblioteka.dodajKsiazke(ksiazka2);


    biblioteka.wypiszDostepneKsiazki();
    Czytelnik czytelnik = new Czytelnik("Jan", "Kowalski", 12345, 0);
    biblioteka.wypozyczKsiazke("Lalka", czytelnik);
    biblioteka.wypiszDostepneKsiazki();
    biblioteka.zwrocKsiazke("Lalka", czytelnik);
    biblioteka.wypiszDostepneKsiazki();

    }
}
