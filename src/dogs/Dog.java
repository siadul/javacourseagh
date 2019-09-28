package dogs;

public class Dog {
    String paw1 = "lewa z przodu";
    String paw2 = "prawa z przodu";
    String paw3 = "lewa z tyłu";
    String paw4 = "prawa z tyłu";

    public String name;
    // overloading/przeciążenie metod - kilka wersji metody różniących się liczbą argumentów
    // lub ich typami

    // Jeżeli metoda nie ma żadnego modyfikatora dostępu tak jak tutaj
    // to wówczas mamy dostęp pakietowy
    Dog() { // konstruktor domyślny
        name = "burek";
        privateMethod();
    }

    public Dog(String name) {
        this.name = name;
        privateMethod();
        woof();
    }

    private void privateMethod() {
        System.out.println("Private method from dogs.Dog class");
        woof();
    }

    protected void woof() {
        System.out.println("Woof woof");
    }

    public int givePaw() {
        privateMethod();
        woof();
        System.out.println(paw1);

        return 1;
    }

    public int givePaw(int pawNumber) {
        String paw; // UWAGA! inicjalizacja zmiennych w metodzie nie odbywa się
        // automatycznie!!!
        // INACZEJ jest w przypadku pól, te są zawsze inicjalizowane wartościami domyślnymis
        switch(pawNumber) {
            case 2:
                paw = paw2;
                break;
            case 3:
                paw = paw3;
                break;
            case 4:
                paw = paw4;
                break;
            default:
                paw = paw1;
        }
        System.out.println(paw);

        return pawNumber;
    }

    // UWAGA! nie możemy przeciążać metod w taki sposób, że będą się one różniły JEDYNIE
    // typem zwracanym

//    public String givePaw(int pawNumber) {
//        return "woof woof";
//    }

    public int givePaw(int paw1Number, int paw2Number) {
        String paw;
        int pawNumber;
        for(int i=0; i<2; i++) {
            if(0 == i) {
                pawNumber = paw1Number;
            } else {
                pawNumber = paw2Number;
            }
            switch (pawNumber) {
                case 2:
                    paw = paw2;
                    break;
                case 3:
                    paw = paw3;
                    break;
                case 4:
                    paw = paw4;
                    break;
                default:
                    paw = paw1;
            }
            System.out.println(paw);
        }

        return paw1Number + paw2Number;
    }

    public int givePaw(String pawName) {
        String paw;
        int number;
        switch(pawName) {
            case "prawa z przodu":
                paw = paw2;
                number = 2;
                break;
            case "lewa z tyłu":
                paw = paw3;
                number = 3;
                break;
            case "prawa z tyłu":
                paw = paw4;
                number = 4;
                break;
            default:
                paw = paw1;
                number = 1;
        }
        System.out.println(paw);

        return number;
    }

    // Zadanie
    // Stworzyć klasę Kot i na jej podstawie zademonstrować przeciążanie metod.

}
