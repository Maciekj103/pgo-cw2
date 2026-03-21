public class Main {
    public static void main(String[] args) {
    Biblioteka biblioteka = new Biblioteka(5);

    Ksiazka ksiazka = new Ksiazka("Pan Tadeusz", "Adam Mickiewicz", 300, false);
    Ksiazka ksiazka1 = new Ksiazka("Lalka", "Bolesław Prus", 400, true);
    Ksiazka ksiazka2 = new Ksiazka("Zbrodnia i kara", "Fiodor Dostojewski", 500, false);
    Ksiazka ksiazka3 = new Ksiazka("Mistrz i Małgorzata", "Michaił Bułhakow", 350, true);
    Ksiazka ksiazka4 = new Ksiazka("Krzyżacy", "Henryk Sienkiewicz", 450, true);

    biblioteka.dodajKsiazke(ksiazka);
    biblioteka.dodajKsiazke(ksiazka1);
    biblioteka.dodajKsiazke(ksiazka2);
    biblioteka.dodajKsiazke(ksiazka3);
    biblioteka.dodajKsiazke(ksiazka4);

    biblioteka.wypiszDostepneKsiazki();
    Czytelnik czytelnik = new Czytelnik("Jan", "Kowalski", 12345, 0);
    biblioteka.wypozyczKsiazke("Lalka", czytelnik);
    biblioteka.wypiszDostepneKsiazki();
    biblioteka.zwrocKsiazke("Lalka", czytelnik);
    biblioteka.wypiszDostepneKsiazki();

    }
}
