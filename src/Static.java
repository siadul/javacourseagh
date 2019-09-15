public class Static {
    int a = 4;
    public void foo() {
        System.out.println("aaa");
    }
    public static void main(String... args) {
//        foo(); // nie zadziała - kontekst statyczny
//        a++; // nie zadziała - kontekst statyczny

        System.out.println("pola statyczne c.d.");
        Static1 st1 = new Static1();
        Static1 st2 = new Static1();
        Static1 st3 = new Static1();
        st1.staticField = 1;
        st1.nonStaticField = 2;
        System.out.println(st1.staticField);
        System.out.println(st1.nonStaticField);

        st2.staticField = 3;
        st2.nonStaticField = 4;
        System.out.println(st2.staticField);
        System.out.println(st2.nonStaticField);

        st3.staticField = 5;
        st3.nonStaticField = 6;
        System.out.println(st3.staticField); // 5
        System.out.println(st3.nonStaticField); // 6

        System.out.println(st2.staticField); // 5
        System.out.println(st2.nonStaticField); // 4

        System.out.println(st1.staticField); // 5
        System.out.println(st1.nonStaticField); // 2

        System.out.println(Static1.staticField); // 5
//        System.out.println(Static1.nonStaticField); // error

        // Metody statyczne
        Static1 obj1 = new Static1();

        // skorzytanie z metody niestatycznej (zwykłej) wymaga od nas zmiennej, która przechowywuje obiekt
        obj1.nonStaticMethod();

        Static1.staticMethod();

        // Zadanie
        // a) Stworzyć klasę i dodać pole statyczne, które przechowuje liczbę instancji tej klasy.
        // b) Dodać metodę statyczną, która wypisuje liczbę obiektów tej klasy
        // c) Wywołać metodę statyczną z pkt b)
        Static2.printCounter();
        Static2 stat1 = new Static2();
//        stat1.counter++;
        Static2.counter++;
        Static2.printCounter();
        Static2 stat2 = new Static2();
//        stat1.counter++;
        Static2.counter++;
        Static2.printCounter();


        // blok inicjalizujący

        System.out.println("blok inicjalizujący");
        Static3.printCounter(); // 1
        Static3 stat3 = new Static3();
        Static3.printCounter(); // 2
        Static3 stat4 = new Static3();
        Static3.printCounter(); // 3

        // Wniosek
        // Blok inicjalizujący (niestatyczny) wykonywany jest za każdym razem
        // gdy tworzę nową instancję klasy w której się ten blok zawiera.
        // Czyli jeżeli nie będę miał żadnej instancji, nie wykona się ani razu.

        // Konstruktory
        // Konstruktory to szczególne metody, które wykonują się podczas tworzenia obiektu.
        // Służy on zainicjalizowaniu pól obiektu wartościami domyślnymi.

        // Składnia
        // class nazwa_klasy {
                // nazwa_klasy(typ arg1, typ arg2) {
                // ciało konstruktora
                // }
        // }
        // Konstruktory nie zwracają żadnej wartości!
        // Dlaczego?
        // Ponieważ dostarczają nam nowy egzemplarz klasy.

        System.out.println("Konstruktory");
        Static4.printCounter();

        Static4 static4;
        static4 = new Static4();
        static4 = new Static4();
        static4 = new Static4();
        Static4.printCounter();

        static4 = new Static4(2);
        Static4.printCounter();
        // wniosek - konstruktory mogą przyjmować argumenty
        // (wówczas to są tzw. konstrutkory sparametryzowane).

        // konstruktor, który nie przyjmuje żadnych argumentów to konstruktor domyślny.

        // Zadanie
        // a) Stworzyć klasę, która posiada, dwa pola.
        // b) Dodać do niej konstruktor przyjmujący 2 argumenty. Konstruktor ma za zadanie
        // przypisać tym polom wartości argumentów.
        // c) Stworzyć obiekt tej klasy na podstawie sparametryzowanego konstruktora utworzonego
        // w pkt. b)






    }
}

class Static1 {
    static int staticField; // domyslnie 0
    int nonStaticField; // domyslnie 0
    static {
        // blok statyczny inicjalizujący
        staticField++;
//        nonStaticField++; nie zadziała
    }
    {
        // niestatyczny blok inicjalizujący
        staticField++;
        nonStaticField++;
        // możemy odwoływać się do elementów zarówno statycznych jak i niestatycznych
    }

    // UWAGA!!!
    // pola statyczne są związane z KLASĄ
    // metody statyczne są związane z KLASĄ
    // pola niestatyczne (bez modyfikatora static) są związane z OBIEKTEM
    // metody niestatyczne (bez modyfikatora static) są związane z OBIEKTEM

    static void staticMethod() {
        System.out.println("Witamy w statycznej metodzie Static.staticMethod");

        // UWAGA!!!
        // w metodzie statycznej nie możemy odwoływać się do pól/metod tej klasy, które nie są statyczne!
//        nonStaticField++; // nie zadziała!

        // Dlaczego???

    }
    void nonStaticMethod() {
        System.out.println("Witamy w zwykłej (niestatycznej) metodzie obj.nonStaticMethod");
    }


}

class Static2 {
    static int counter = 1;
    static void printCounter() {
        System.out.println(counter);
    }
}

class Static3 {
    {
        // blok inicjalizujący niestatyczny
        System.out.println("Zwiększam counter");
        counter++;
    }
    static int counter = 1;
    static void printCounter() {
        System.out.println(counter);
    }
}

class Static4 {
    Static4() {
        System.out.println("Teraz działa konstruktor!");
        counter++;
    }
    Static4(int x) {
        System.out.println("Teraz działa konstruktor! x = " + x);
        counter+=x;
    }

    static int counter = 0;
    static void printCounter() {
        System.out.println(counter);
    }
}