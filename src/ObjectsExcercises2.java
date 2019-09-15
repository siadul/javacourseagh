class Calculator {
    double a;
    double b;

    // składnia definicji metody
    // nazwa_typu_zwracanego nazwa_metody (argumenty) {

            // instrukcje do wykonania

    //      return zwracana_wartość
    // }

    void printSum() {
        System.out.println("Suma a = " + a  +
                ", b = "+ b + " jest równa " + (a + b));

    }

    double getSum() {
        return a + b;
    }

    /**
     * liczy kwadrat liczby podanej jako argument
     * @return
     */
    void sqr(double x) {
        double xx = x * x;
        System.out.println(xx);
    }

    double sum(double x, double y) {
        return x + y;
    }

    double getMax(double x, double y) {
        if(x >= y) {
            return x;
        } else {
            return y;
        }
    }

    int getSumOfN(int n) {
        // 1, 2, 3, ... n
        // dla n = 5 -> 1 + 2 + 3 + 4 + 5 + 6 =  21
        // I sposób - przy użyciu pętli
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum = sum + i;
        }

        // II sposób
        // 1 + 6
        // 2 + 5
        // 3 + 4
        // (a1 + an)*n/2

        return (1 + n) * n/2;
    }

    // silnia n, gdy n = 0, 1, silnia(0) = 1, silnia(1) = 1, dla n > 1
    // silnia(n) = 1*2*3..*n,
    // wywołanie rekurencyjne, silnia(n-1) * n
    int factorial(int n) {
        System.out.println("liczę factorial(" + n + ")");
        if(n < 2) {
            System.out.println("n < 2, zwróć 1");
            return 1;
        }
        System.out.println("zwróc factorial(" + (n-1) + ")*"+n);

        return factorial(n-1)*n; // wywołanie rekurencyjne
    }

    int fib(int n) {
        System.out.println("liczę fib(" + n + ")");
        if(n < 2) {
            return n;
        }
        System.out.println("zwróć fib(" + (n-1) + ") + fib(" + (n-2) + ")");

        return fib(n-1) + fib(n-2); // wywołanie rekurencyjne x2
    }
}

    // Zadanie
    // napisać funkcję rekurencyjną, która liczy n-ty wyraz ciągu
    // Fibbonaciego
    // Wskazówka: ciąg Fibbonaciego
    // fib(0) = 0. fib(1) = 1, dla n > 1, fib(n) = fib(n-1) + fib(n-2)
    // przykład dla n = 5
    // 0, 1, 1, 2, 3, 5

public class ObjectsExcercises2 {

    // tutaj na razie nie bedziemy definiowac klas

    public static void main(String... args) {

        // tutaj również nie będziemy definiować klas (na razie)

        System.out.println("ObjectsExcercises2");


        // Zadanie 4
        // a) Stworzyć klasę Kalkulator, która składa się z dwóch pól a i b
        // b) następnie stworzyć obiekt klasy Kalkulator i wypisać sumę a i b
        Calculator calculator1 = new Calculator();
        calculator1.a = 4;
        calculator1.b = 4.3;
        Calculator calculator2 = new Calculator();
        calculator2.a = 3;
        calculator2.b = 6.3;
        Calculator calculator3 = new Calculator();
        calculator3.a = 33;
        calculator3.b = 61.23;

        // bez użycia metod
        System.out.println("Suma a = " + calculator1.a +
                ", b = " + calculator1.b + " jest równa  " + (calculator1.a + calculator1.b));

        System.out.println("Suma a = " + calculator2.a +
                ", b = " + calculator2.b + " jest równa  " + (calculator2.a + calculator2.b));

        System.out.println("Suma a = " + calculator3.a +
                ", b = " + calculator3.b + " jest równa  " + (calculator3.a + calculator3.b));

        // metody
        // procedury
        System.out.println("za pomocą metod");
        calculator1.printSum();
        calculator2.printSum();
        calculator3.printSum();

        // funkcje - mamy wartość zwracaną
        System.out.println("za pomocą metody getSum zwracającej wartość");
        System.out.println(calculator1.getSum());
        System.out.println(calculator2.getSum());
        System.out.println(calculator3.getSum());

        // wniosek
        // dzięki użyciu metod zapis jest bardziej zwięzły oraz
        // łatwiejszy do modyfikacji - wystarczy to zrobić raz w definicji metody


        // Zadanie 5* - zadanie
        // Stworzyć klasę Painter, korzystającą z wcześniej utworzonych klas
        // Rectangle, Circle i Point.
        // Stworzyć obiekt tej klasy
        // Wypisać pola Rectangle i Circle

        // Przykład
        // Dodać metodę, która będzie zwracała sumę liczb a i

        // Zadanie 6
        // a) Zdefiniować klasę User
        // b) Dodać do niej pola name, surname
        // c) Dodać metodę, która wypisuje imię i nazwisko np.
        //    metoda show() "Cześć, jestem Jan Kowalski."
        // d) utworzyć obiekt klasy User
        // e) wywowałać metodę z punktu c)

        // Przykład - metody, które zwracają wartość
        // Do klasy User dodać metodę, która zwraca wartość pola name oraz surname

//        System.out.println();
        User user = new User();
        user.name = "Jan";
        user.surname = "Kowalski";
        user.show();

        user.getName(); // Jan

        String surname;
        surname = user.getSurname(); // Kowalski

        System.out.println(user.getName());
        System.out.println(surname);


//        user.getNameAndSurname(); // Jan Kowalski
        String nameAndSurname = user.getNameAndSurname();
        System.out.println(nameAndSurname);

        // wniosek
        // Wartość zwracaną możemy przypisać do zmiennej lub bezpośrednio
        // przekazać do innej metody

        // Zadanie 7
        // a) Do klasy User dodać metodę getNameAndSurname(), która
        // będzie zwracała String zbudowany z imienia i nazwiska.
        // b) Przypisać zwróconą w pkt. a) wartość do zmiennej typu String
        // c) Wypisać wartość zmiennej z punktu b)


        // Argumenty - pozwalają nam "parametryzować" metody
        // składnia
        // type name(arg1, arg2, ..., argn) {
        //    instructions...
        //    return value;
        // }


        // Przykład
        // Do klasy Calculator dodać metodę, która będzie
        // obliczała kwadrat liczby podanej jako argument.
        // In: sqr(4.0)
        // Out: 16.0

        calculator1.sqr(4.0);
        calculator1.sqr(5.0);
        calculator1.sqr(3.3);

        System.out.println("suma:");
        double sum1 = calculator1.sum(3, 2.0);
        System.out.println(sum1);
        double sum2 = calculator1.sum(2, 2.5);
        System.out.println(sum2);

        // Zadanie 8
        // Napisać metodę, która przyjmuje 2 zmienne typu double
        // Wypisać watość większej zmiennej.
        // Wskazówka: if, > < == >= <=

        double result = calculator1.getMax(3.4,9.2);
        System.out.println(result);
        System.out.println(calculator1.getMax(4.0, 4.0));


        // Zadanie 9
        // Napisać metodę, która zwraca sumę liczb od 1 do n, gdzie n jest
        // argumentem tej metody

        int sumOfN = calculator1.getSumOfN(5);
        System.out.println(sumOfN);


        // Zadanie 10*
        // Napisać metodę, która liczy silnię w sposób rekurencyjny
        int n = 5;
        System.out.println("silnia(" + n + ") = ");
        int factorial = calculator1.factorial(n); // 120
        System.out.println(factorial);

        System.out.println("fib(" + n + ") = "); // 0 1 1 2 3 5 8 13 21 34 55 89
        int fib = calculator1.fib(n);
        System.out.println(fib);


        // return - przerywa dalsze wykonywanie metody
        // składnia
        // return wartość_zwracana
        // jezeli typ zwracany jest void (pusty)
        // to albo nie uzywamy return albo nie dajemy żadnej
        // wartości po słowie return;
        ObjectsExcercises2 objectsExcercises2 = new ObjectsExcercises2();
        objectsExcercises2.fooWithReturn1();
        float fooResult = objectsExcercises2.fooWithReturn2();
        // może być int, float, ale nie String!. typy muszą się zgadzać
        System.out.println(fooResult);
    }

    public void fooWithReturn1() {
        System.out.println("fooWithReturn1");
        if(1 > 2) {
            return;
        }
        System.out.println("fooWithReturn1 after return");

    }

    public int fooWithReturn2() {
        System.out.println("fooWithReturn2");
        if(1 > 2) {
            return 5;
        }
        System.out.println("fooWithReturn2 after return");

        return 6;
    }
}

class User {
    String name;
    String surname;
    void show() {
        System.out.println("Cześć, jestem " + name + " " + surname);
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    String getNameAndSurname() {
        return name + " " + surname;
    }



}