package dogs;
// jeżeli klasy zawierają się w jednym pakiecie, to nie trzeba wykonywać
// importów


// Dziedziczenie - słowo kluczowe extends
//class A {}
//class BetterA extends A {}
// klasa BetterA przejmuje wszystkie pola oraz metody z klasy A (które nie są prywatne)
// A jest KLASA BAZOWA dla klasy BetterA
// BetterA jest KLASĄ POCHODNĄ dla klasy A

// jeżeli klasa nie posiada modyfikatora public to nie możemy z niej korzystać
// poza obrębem pakietu w którym jest zdefiniowana
public class PoliceDog extends Dog {
    // wykorzystujemy kod, który napisaliśmy w klasie dogs.Dog, nie musimy pisać go ponownie!

    public String searchDrugs(boolean drugs) {
        woof();
//        privateMethod(); // privateMethod nie jest widoczna z poziomu innych klas niż DOG!

        return drugs ? "woof woof" : "hau hau";
    }

    // przesłanianie/OVERRIDE metody z klasy bazowej (NIE PRZECIĄŻANIE)
    public int givePaw() {
        woof();
        super.givePaw(); // odwołanie się do instancji typu bazowego, zostanie wywołana metoda
        // z klasy dogs.Dog
        System.out.println(paw2); // paw2 istnieje w klasie dogs.Dog, więc mogę z niego korzystać

        return 2;
    }
}