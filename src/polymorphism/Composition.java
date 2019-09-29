package polymorphism;

public class Composition {

    Inner obj; // klasy moga przechowywać obiekty innych klas

    public void test() {
        System.out.println(obj.name);
    }

    public Composition() {
        obj = new Inner(); // Jeżeli klasa zarządza obiektem, który przechowuje
        // to taka relacja nazywa się kompozycją.
        // Jeżeli tylko zawiera taki obiekt, natomiast obiekt zarządzany jest
        // "z zewnątrz" to taka relacja nazywa się agregacją
        // Kompozycja to szczególny rodzaj agregacji.
    }

    public void test2(Inner arg) {
        System.out.println(arg.name);
    }

    public Inner createInner(String name) {
        Inner i =  new Inner();
        i.name = name;
        return i;
    }
}

class Inner {
    String name = "Inner";
}
