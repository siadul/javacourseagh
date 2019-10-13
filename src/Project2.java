// PROJEKT 2
// Do kodu z PROJEKT 1 dodać nakładkę graficzną korzystając z JavaFX
// Dodać GUI:
// - przyciski operacji Sum, Difference, Product, Dividend, SquareRoot, Power
// - min. 2 x input, LICZBY do operacji użytkownik wpisuje do formularza z klawiatury, lub za pomocą przycisków
// - slider poziomy i pionowy - zmieniające wartość liczby wpisanej w inputach
// - textfield/label z rezultatem operacji
// - textfield z dotychczasowymi operacjami

// - obsługa błędów (np. dzielenie przez 0 - ArithmeticException, parsowanie danych wprowadzonych przez usera)
// - listę operacji przechowujemy w kontenerze (najlepiej na stosie, ale może być ostatecznie zwyczajne ArrayList)

//  - min. 10 klas w tym:
//      - Klasy abstrakcyjnej AbstractOperation, zawierającej metodę abstrakcyjną calculate
//      - Klas dziedziczących po Operation: Sum, Difference, Product, Dividend, SquareRoot, Power, Exit
//      - Klasy Calulator z metodą główną main, która odpowiada za obliczanie operacji

// javafx:
// pobieramy SDK, struktura projektu i dorzucamy odpowiednie pliki
// https://stackoverflow.com/questions/51478675/error-javafx-runtime-components-are-missing-and-are-required-to-run-this-appli
// w opcjach uruchomienia dodajemy potrzebne komponenty javafx.fxml i javafx.graphics (uwaga! nie controls)

public class Project2 extends Object {

    public static void main(String... args) {
        

    }
}
