import com.sun.source.tree.Scope;

public class Scopes {
    public static void main(String... args) {
        int a1 = 5; // zakres zewnętrzny
        for(a1=6; a1<4; a1++) { // zakres wewnętrzny
            int c = 4;
//            int a1 =3; // nie zadziała, nie możemy przesłaniać zmiennych w taki sposób
        }
//        System.out.println(c); // nie zadziała
        // Uwaga!
        // W zakresach zewnętrznych nie możemy odwoływać się do zmiennych,
        // które deklarujemy w zakresach wewnętrznych

        int x = 3;
        {
            {
                int b = 3;
                {
                    int c = 4;
                    b = 2;
                } // w tym miejscu zapominamy o c
            }
            System.out.println(x);
        }
//        System.out.println(c); // nie zadziała

        // Uwaga!
        // W drugą stronę to działa tzn. w zakresach wewnętrznych
        // możemy odwoływać się do zmiennych definiowanych
        // w zakresach zewnętrznych


//        foo2();
//        foo1();

        // Zadanie
        // Napisać metodę "swap", która pobiera 2 liczby całkowite i
        // "zamienia" je miejscami tzn. swap(a, b), dla a = 3, b = 5
        // sprawia, że a = 5, b = 3

        Scopes scopes = new Scopes();
        int a = 3;
        int b = 5;
        System.out.println("a=" + a + ", b=" + b);
        scopes.swap(a, b); // tutaj następuje kopiowanie wartości zmiennych a i b
        // do zmiennych reprezentujących argumenty funkcji swap
        // to jest tzw. PRZEKAZYWANIE PRZEZ WARTOŚĆ ZMIENNYCH TYPÓW PODSTAWOWYCH
        // w javie nie istnieje coś takiego jak przekazywanie
        // zmiennych typów podstawowych przez referencje
        System.out.println("a=" + a + ", b=" + b);

        // spróbujmy rozwiązać ten problem przy użyciu obiektów
        C0 c0 = new C0();
        c0.a = 3;
        c0.b = 5;
        System.out.println("c0.a=" + c0.a + ", c0.b=" + c0.b);
        System.out.println(c0);
        scopes.swap2(c0);
        System.out.println("c0.a=" + c0.a + ", c0.b=" + c0.b);

        // wniosek
        // przekazywanie obiektów do funkcji odbywa się inaczej
        // niż w przypadku typów podstawowych, a mianowicie poprzez referencję
        // innymi słowy, w ciele tej metody będziemy operować na tym samym
        // obiekcie, który przekazaliśmy w momencie wywołania jej



        // STATIC
        // jak korzystać z pol klasy C0
        C0 c = new C0();
        c.a = 3;
        c.b = 5;
        System.out.println(c.a); // 3
        System.out.println(c.b); // 5

        C0 c1 = new C0();
        c1.a = 4;
        c1.b = 8;
        System.out.println(c.a); // 4? nie, 3
        System.out.println(c.b); // 8? nie, 5
        System.out.println(c1.a); // 4
        System.out.println(c1.b); // 8

        C0 c2 = null;
        c.staticField = 3; // działa, ale nie zaleca się odwoływać do pola statycznego na rzecz obiektu
        c1.staticField = 5; // zapis równoważny
        c2.staticField = 5; // zapis równoważny
        C0.staticField = 6; // zapis równoważny
        System.out.println(c.staticField); // 5
        System.out.println(c1.staticField); // 5
        System.out.println(C0.staticField); // 5


        // Przykład
        // Zliczanie instancji danej klasy.
        // Napisać klasę, która bedzie posiadała pole statyczne
        // odpowiedzialne za przechowywanie informacji odnośnie
        // liczby utworzonych obiektów tej klasy.


        // te pola są związane z konkretnym egzemplarzem klasy

        // pole statyczne - pole związane jest klasą a nie konkretnym
        // obiektem
        // składania
        // class {
        //    static nazwa_typu nazwa_zmiennej;
        // }

        System.out.println(P1.counter);
        P1 p1 = new P1();
        P1.counter++;
        System.out.println(P1.counter);
        P1 p2 = new P1();
        P1.counter++;
        System.out.println(P1.counter);
        P1 p3 = new P1();
        P1.counter++;
        System.out.println(P1.counter);

        scopes.foo2();

        System.out.println(P1.c);

        // Zadanie
        // Stworzyć klasę z 1 polem statycznymi
        // Następnie pokazać, że przypisanie jakiejś wartości do tego pola
        // powoduje zmianę u wszystkich instancji tej klasy.
    }

    public void foo2() {
        System.out.println("liczba instancji klasy P1: " + P1.counter);
    }

    public int swap(int a1, int b1) {
        int c = a1;
        a1 = b1;
        b1 = c;
        System.out.println("a=" + a1 + ", b=" + b1);

        return a1; // UWAGA! W JAVIE możemy zwracać tylko jedną wartość!
    }

    public void swap2(C0 obj) {
        int c = obj.a;
        obj.a = obj.b;
        obj.b = c;
        System.out.println("obj.a=" + obj.a + ", obj.b=" + obj.b);
        System.out.println(obj);
    }
}

class C0 {
    int a;
    int b;
    static int staticField;
}

class C1 {
    public void foo1() {

    }
}

class P1 {
    static int counter;
    static int a = 4;
    static int b = 6;
    static int c;
    // blok statyczny
    static {
        counter++;
        c = a + b;
    }
}

