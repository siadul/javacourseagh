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
}

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

        // Zadanie
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

        // Zadanie
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

        // Zadanie
        // Napisać metodę, która przyjmuje 2 zmienne typu dobule
        // Wypisać watość większej zmiennej.
        // Wskazówka: if, > < == >= <=



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