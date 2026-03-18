public class Main {
    public static void main(String[] args) {
        Ksiazka book1 = new Ksiazka("Hobbit", "J.R.R. Tolkien", 300, true);
        Ksiazka book2 = new Ksiazka("Potop", "Sienkiewicz", 900, true);
        Ksiazka book3 = new Ksiazka("Dziady cz. III", "Adam Mickiewicz", 281, true);
        book1.wypiszInfo();
        book2.wypozycz();
        book2.wypiszInfo();
        book2.zwroc();
        book2.wypiszInfo();
        book3.wypiszInfo();
    }
}
