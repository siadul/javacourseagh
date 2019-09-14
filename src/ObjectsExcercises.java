// możemy definiować powyżej klasy zawierającej metodę główną
class Rectangle {
    // wiele sposobów
    // I współrzednych dwóch wierzchołków leżących na przekątnej prostokąta
    // ****
    // *  *
    // ****

    // dlugości boków a i b - wystarczą do celów zadania
    double a;
    double b;
}


public class ObjectsExcercises {

    // tutaj na razie nie bedziemy definiowac klas

    public static void main(String... args) {

        // tutaj również nie będziemy definiować klas (na razie)

        System.out.println("ObjectsExcercises");

        Rectangle rectangle1 = new Rectangle();
        rectangle1.a = 5;
        rectangle1.b = 10;
        System.out.println(rectangle1.a * rectangle1.b);


    }
}

// lub możemy definiować poniżej klasy zawierającej metodę główną
class BetterRectangle {

}
