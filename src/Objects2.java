// jeżeli nie ma słowa kluczowego package, to klasa/interfejs
// należy do pakietu domyślnego

//import dogs.Dog;
//import dogs.PoliceDog;

import dogs.Dog;
import dogs.PoliceDog;

public class Objects2 extends Dog {
//    private class Inner {}; private class jest możliwe tylko w klasach wewnętrznych

    public Objects2() {
        super("");
    }

    public static void main(String... args) {
        Dog dog = new Dog("dog created from Objects2");
        // mimo, że Objects2 dziedziczy po Dog, i Dog(String) jest protected
        // to nie uda nam się z niego skorzystać.
        // main jest w kontekście statycznym, konstruktor musiałby mieć
        // dostęp public.

        int paws = dog.givePaw();
        System.out.println(paws);

        // jak wypisać 4 łapę (prawą z tyłu)?
        paws = dog.givePaw(4);
        System.out.println(paws);

        // jak wypisać łapę, która się nazywa lewa z tyłu (3)?
        paws = dog.givePaw("lewa z tyłu");
        System.out.println(paws);

        // jak wypisać łapy 1 i 3?
        paws = dog.givePaw(1, 3);
        System.out.println(paws);

        paws = dog.givePaw(1, 3);
        System.out.println(paws);

        Dog dog2 = new Dog("Azor");
        System.out.println(dog.name);
        System.out.println(dog2.name);

        System.out.println("Police dog");
        PoliceDog policeDog1 = new PoliceDog();
        policeDog1.givePaw(2);

        String message1FromPoliceDog1 = policeDog1.searchDrugs(false);
        String message2FromPoliceDog1 = policeDog1.searchDrugs(true);
        System.out.println(message1FromPoliceDog1);
        System.out.println(message2FromPoliceDog1);

        int message3FromPoliceDog1 = policeDog1.givePaw();
        System.out.println(message3FromPoliceDog1);

//        dog2.searchDrugs(true); dog2 jest zwyczajnym psem, nie potrafi szukać narkotyków


//        dog.privateMethod(); // privateMethod mogę używać WYŁĄCZNIE w obrębię klasy, w której
        // jest zdefiniowana ta metoda
        // privateMethod


//        policeDog1.privateMethod();
//public
        System.out.println("policeDog1.woof()");
//        policeDog1.woof();
    }
}



// Zadanie
// Na podstawie klasy, którą utworzyliśmy w poprzednim zadaniu stworzyć nową klasę, która
// DZIEDZICZY po tej wcześniejszej
// Dodać do niej nową metodę
// Stworzyć instancję nowego typu i wywołać nowododaną metodę.



// Modyfikatory dostępu:
//public, private, protected, (domyślny package - kiedy nie podamy żadnego słowa przed nazwą klasy/metody/pola)


// public - najszerszy dostęp, można korzystać z metody/pola poza obrębem klasy, w której zdefiniowana jest
//          metoda/pole

// private - najwęższy dostęp, mogę korzystać z metody/pola wyłącznie w obrębie klasy, w której zdefiniowana jest
//           metoda/pole

// protected - możemy korzystać w obrębie klasy, w której zdefiniowana jest metoda/pola ALE
//             RÓWNIEŻ w klasach dziedziczących po tej klasie zawierającej definicję.
//             RÓWNIEŻ możemy korzystać z tej metody/pola w klasie, która nie dziedziczy po niej,
//             jeżeli tylko ZNAJDUJE SIĘ W TYM SAMYM PAKIECIE.
//             Dostęp do takiej metody/pola poza ww. klasami będzie niemożliwy
// uwaga na metody statyczne!!!

// package - możemy korzystać z tej samej metody/pola w obrębie tego samego pakietu

// KLASY
// mogą mieć dostęp public lub package
// analogicznie public - możemy korzystać w klasach spoza pakietu
// package - tylko w obrębie pakietu

// nie ma czegoś takiego jak private class (nie dotyczy klas wewnętrznych)

// Zadanie
// Wydzielić klasy, które tworzyliśmy w poprzednich zadaniach do osobnych pakietów.
// zademonstrować działanie modyfikatorów dostępu:
// public, private, protected oraz bez modyfikatora (dostęp package)