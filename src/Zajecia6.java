import polymorphism.*;
//import polymorphism.Inner;

public class Zajecia6 {
    public static void main(String[] args) {
//        kompozycja();
//        zadanieSamochody();
        zadanieMotocykle();
    }

    private static void kompozycja() {
        System.out.println("Composition");

        Composition c1 = new Composition();
        c1.test();

        // klasa Inner znajduje się w zewnętrznym pakiecie
        // nie możemy tworzyć NAWET REFERENCJI do obiektów tej klasy
        // Inner i = c1.createInner("Zajecia6 Inner");
        // c1.test2(i);

        // wciąż jednak możemy korzystać z obiektów tej klasy
        c1.test2(c1.createInner("Zajecia6 Inner"));
    }

    private static void zadanieSamochody() {
        Car bmw = new Car();
        System.out.println("przed wymianą silnika");
        bmw.show();

        Engine engine = new Engine();
//        engine.power = 200.4;
        engine.setPower(200.4);
        bmw.setEngine(engine);
        System.out.println("po wymianie silnika");
        bmw.show();
    }

    private static void zadanieMotocykle() {


// Zadanie 1
// a) Wzorując się na klasie Composition stworzyć klasę Car, która będzie
// zawierała pole "engine" klasy Engine. Klasa Engine powinna zawierać
// 1 pole "power" typu double.
// b) Stworzyć obiekt klasy Car.
// c) Do klasy Car dodać metodę setEngine(), która przyjmuje obiekt klasy Engine.
// d) Wywołać metodę setEngine()

// Zadanie 2
// a) Stworzyć klasę Motorcycle, SportMotorcycle, NakedMotorcycle oraz Garage.
// b) SportMotorcycle oraz NakedMotorcycle powinny dziedziczyć (extends) po klasie
// Motorcycle.
// c) Klasa Garage powinna składać się z 4 pól "bike1", "bike2", "bike3", "bike4".
// d) Do klasy Garage dodać metodę setBike(Motorcycle m), która będzie przyjmowała jako
// argument obiekt klasy Motorcycle i ustawiała to pole bike, które nie jest
// już zajęte (nie jest null)
// e) Do klasy Garage dodać metodę "removeAll", która będzie opróżniała garaż
// (czyli ustawiała wszystkie pola bike1, bike2 itd. na null)
// f) Stworzyć 4 instancje:
//  - Motorcycle
//  - SportMotorcycle
//  - NakedMotorcycle
//  - Garage
// g) Korzystając z metody Garage.setBike umieścić motocykle w garażu
// h) Korzystając z metody Garage.removeAll opróżnić garaż
        System.out.println("Zadanie - motocykle");
        Garage garage = new Garage();
//        Motorcycle m1 = new Motorcycle();
        Motorcycle m2 = new SportMotorcycle();
        Motorcycle m3 = new NakedMotorcycle();
//        Motorcycle m4 = new Motorcycle();

//        garage.setBike1(m1);
        garage.setBike2(m2);
        garage.setBike3(m3);
//        garage.setBike4(m4);

        Motorcycle m3b = garage.getBike3();
        System.out.println(m3b.getName());
        Motorcycle m5 = new SportMotorcycle();
        garage.setBike3(m5);
        m3b = garage.getBike3();
        System.out.println(m3b.getName());

        garage.removeAll();
        m3b = garage.getBike3();
//        System.out.println(m3b.name); // uwaga na NULLPOINTEREXCEPTION
//        System.out.println(m3b.getName()); // uwaga na NULLPOINTEREXCEPTION
        if(m3b != null) {
            System.out.println(m3b.getName());
        } else {
            System.out.println("Miejsce 3 stoi puste");
        }

        garage.setBike(m2);
        garage.setBike(m3);
//        garage.setBike(m4);
        garage.setBike(m5);
//        garage.setBike(m1);
        garage.setBike1(null);
//        garage.setBike(m1);

//        m1.makeNoise(); // motorcycle
        m2.makeNoise(); // sport
        m3.makeNoise();  // naked
//        m4.makeNoise(); // motorcycle
        m5.makeNoise(); // sport

        // Spostrzeżenie
        // Mimo że m1, m2, m3, m4 i m5 to referencje typu Motorcycle
        // to makeNoise wywołuje metody w zależności od konkretnego
        // typu obiektu tzn. dla m1 to będzie Motorcycle.makeNoise()
        // dla m2 - sport, dla m3 - naked, dla m4 - motorcycle, dla m5 - sport.

        // Takie zachowanie nazywamy POLIMORFIZM (jedno z najważniejszych
        // pojęć jeśli chodzi o programowanie zorientowane obiektowo - "oop"")

        System.out.println("Polimorfizm - makeNoise");
//        makeNoiseMotorcyle(new Motorcycle());
        makeNoiseSportMotorcycle(new SportMotorcycle());
        makeNoiseNakedMotorcycle(new NakedMotorcycle());
//        makeNoiseNakedMotorcycle(new SportMotorcycle()); // nie skompiluje się
//        makeNoise(new Motorcycle());
        makeNoise(new SportMotorcycle());
        makeNoise(new NakedMotorcycle());
        makeNoise(new SportMotorcycle());
    }

    // POLIMORFIZM
    public static void makeNoise(Motorcycle m) {
        System.out.println(m.getName());
        m.makeNoise();
    }

    public static void makeNoiseSportMotorcycle(SportMotorcycle m) {
        System.out.println(m.getName());
        m.makeNoise();
    }
    public static void makeNoiseNakedMotorcycle(NakedMotorcycle m) {
        System.out.println(m.getName());
        m.makeNoise();
    }

}
