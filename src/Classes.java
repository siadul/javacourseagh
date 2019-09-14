public class Classes {
/*
// typy podstawowe
int, double, long itd.

// typ obiektowy
Classes

// przykład
// chcemy typu, który będzie rprezentował punkt płaszczyzny
Point p1 = new Point();
        p1.X = 0.0;
        p1.Y = 1.0;
        p2.X = 2.0;
        p2.Y = 3.0;

p2 - p1 // przeciążanie operatorów
p2.getVector(p1) // w javie nie ma przeciążania operatorów, więc musimy
// zdefiniować metody

// składnia
// class NAZWA_KLASY {
    // definicja pól
    // definicja metod
// }

 */
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.X = 0.0;
        p1.Y = 1.0;

        Point p2 = new Point();
        p2.X = 2.0;
        p2.Y = 3.0;

        Point p3 = new Point();
        p3.X = p2.X - p1.X;
        p3.Y = p2.Y - p1.Y;

        p1.printPoint();
        p2.printPoint();
        p3.printPoint();

        System.out.println("P2 - P1 =  [" + p3.X + ", " + p3.Y + "]");

        // bez użycia klas
        double p1_X = 0.0;
        double p1_Y = 1.0;

        double p2_X = 2.0;
        double p2_Y = 3.0;

        double p3_X = p2_X - p1_X;
        double p3_Y = p2_Y - p1_Y;

        System.out.println("Współrzędne punktu: [" + p1_X + ", " + p1_Y + "]");
        System.out.println("Współrzędne pónktu: [" + p2_X + "," + p2_Y + "]");
        System.out.println("Współrzędne punktu: [" + p3_X + ", " + p3_Y + "]");

        System.out.println("P2 - P1 =  [" + p3_X + ", " + p3_Y + "]");

        System.out.println("Zadanie 2");
        Circle circle = new Circle();
        circle.p = new Point();
        circle.r = 10;
        circle.p.X = 5.5;
        circle.p.Y = 7.5;
        System.out.println(circle.p.X + ", " + circle.p.Y);
        System.out.println(circle.r);
    }
}

class Point {
    // pola
    double X;
    double Y;

    // metody
    void printPoint() {
        // wypisz współrzędne punktu
        System.out.println("Współrzędne punktu: [" + X + ", " + Y + "]");
    }
    void getVector() {
        // zwróc wektor
    }
}

// Wniosek
// dzięki użyciom klas mamy jednolitą strukturę tzn. dokonując operacji na polach
// takiej klasy nie musimy się obawiać, że użyjemy niewłaściwych typów


// Ważne
// Obiekt = przedstawiciel/egzemplarz klasy




// klasa to zbiór metod i pól

// programowanie funkcjonalne
//main() {
//    //sdfaafsdfsdafsd
//    foo1();
//    foo1();
//    foo1();
//    foo1();
//        }
//
//        foo1() {
//    println('test');
//        }

// Zadanie 2
// a) Stworzyć klasę reprezentującą okrąg.
// Pole1 (mogą być 2 double) środek
// Pole2 długośc promienia
// b) skorzystać z utworzonej klasy - utworzyć obiekt oraz wypisać środek oraz promień
// // nowoutworzonego okręgu

class Circle {
    // pola
    Point p;
    double r;
}

// Zadanie 3
// Napisać klasę, która reprezentuje prostokąt
// Skorzystać z tej klasy do wypisania pola tego prostokąta.