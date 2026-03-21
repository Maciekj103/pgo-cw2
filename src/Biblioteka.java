public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka(int pojemnosc) {
        ksiazki = new Ksiazka[pojemnosc];
        liczbaKsiazek = 0;
    }
    public void dodajKsiazke(Ksiazka ksiazka) {
        if (liczbaKsiazek < ksiazki.length) {
            ksiazki[liczbaKsiazek] = ksiazka;
            liczbaKsiazek++;
        } else {
            System.out.println("Nie można dodać książki. Biblioteka jest pełna.");
        }
    }

    public void wypiszDostepneKsiazki(){
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i] != null && ksiazki[i].isDostepna()) {
                ksiazki[i].wypiszInfo();
            }
        }
    }

    public Ksiazka znajdzKsiazkePoTytule(String tytul) {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i] != null && ksiazki[i].getTytul().equals(tytul)) {
                return ksiazki[i];
            }
        }
        return null;
    }

    public int policzDostepneKsiazki(){
        int licznik = 0;
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i] != null && ksiazki[i].isDostepna()) {
                licznik++;
            }
        }
        return licznik;
    }

}

//Dodaj klasę Biblioteka, która będzie przechowywała tablicę obiektów Ksiazka. W tym zadaniu
//pojawia się już logika wymagająca pętli, licznika elementów i prostych metod wyszukujących.
//• pole Ksiazka[] ksiazki oraz pole int liczbaKsiazek
//• konstruktor przyjmujący maksymalny rozmiar tablicy
//• metoda dodajKsiazke(Ksiazka ksiazka)
//• metoda wypiszDostepneKsiazki() wykorzystująca pętlę
//• metoda znajdzKsiazkePoTytule(String tytul)
//• metoda policzDostepneKsiazki() zwracająca liczbę książek dostępnych


