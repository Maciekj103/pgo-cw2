public class Main {
    public static void main(String[] args) {
    Czytelnik czytelnik1 = new Czytelnik("Jan", "Kowalski", 12345, 0);
    Czytelnik czytelnik2 = new Czytelnik("Anna", "Nowak", 54321, 2);
    czytelnik2.wypiszDane();
    czytelnik2.zmniejszLiczbeWypozyczen(1);
    czytelnik2.wypiszDane();
    czytelnik1.wypiszDane();
    czytelnik1.zwiekszLiczbeWypozyczen(3);
    czytelnik1.wypiszDane();

    }
}
