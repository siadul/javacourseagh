import interfaces.*;
import polymorphism.*;

import java.util.Arrays;
//import polymorphism.Inner;

public class Zajecia7 {
    public static void main(String[] args) {
//        interfaces1();
//        interfaces2();
        arrays1();
    }

    public static void interfaces1() {
//        ShapeInterface sh = new ShapeInterface();

        // wniosek -> nie można tworzyć instancji interfesju!
        // ale możemy utworzyć instancje klasy która
        // IMPLEMENTUJE interfejs

        interfaces.Circle c = new interfaces.Circle();
        c.getName();
        System.out.println("Square");
        Square s = new Square();
        s.getName();
        s.show();
    }

    public static void interfaces2() {
        // na podstawie przykładu z interfaces1
        // a) stworzyć 1 interface z 1 metodą abstrakcyjną
        // b) 1 klasę abstrakcyjną z 1 metodą abstrakcyjną
        // c) 2 klasy zwykłe (pierwsza implementuje interfejs,
        // druga dziedziczy po klasie abstrakcyjnej)
        // Stworzyć instancje tych 2 klas i wywołać metody
        // abstrakcyjne

        // d) stworzyć kolejną nieabstrakcyjną klasę, która
        // dziedziczy po klasie z pkt b)
        // e) stworzyć kolejną nieabstrakcyjną klasę, która
        // implementuje interfejs z pkt a)
        // f) stworzyć kolejną nieabstrakcyjną klasę,
        // posiadającą METODĘ, która przyjmuje jako argument
        // interface z pkt a)
        // g) do klasy z pkt f dodać METODĘ, która przyjmuje
        // jako argument klasę abstrakcyjną z pkt b)
        // h) skorzystać z metod w pkt. f) i g)

        // Dla ambitnych udowodnić, że metody statyczne
        // nie mogą być polimorficzne

        CandyBracelet candyBracelet = new CandyBracelet();
        PantsProduct pantsProduct = new PantsProduct();
        BreadProduct breadProduct = new BreadProduct();

//        pantsProduct.open();
//        pantsProduct.wear();
//
//        breadProduct.open();
//        breadProduct.eat();
//
//        candyBracelet.open();
//        candyBracelet.wear();
//        candyBracelet.eat();

        Child child = new Child();
        child.play(pantsProduct);
        child.play(breadProduct);
        child.play(candyBracelet);

        child.playFood(breadProduct);

        child.playCloth(pantsProduct);

        child.playFood(candyBracelet);
        child.playCloth(candyBracelet);

    }

    public static void arrays1() {
        System.out.println("arrays1");
        // co to są tablice?
        // zbiór zmiennych tego samego typu, do których
        // możemy się odwołać za pomocą indeksów
        int x1 = 4;
        int x2 = 4;
        int x3 = 4;
        int x4 = 4;
        int x5 = 4;
        int x6 = 4;
        // a co jeżeli mamy n zmiennych?

        int[] array1 = {10, 20, 30};
        int array2[] = {10, 20, 30};
        // indeksacje zaczynamy od 0
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);


        int[] array3 = new int[5];
        // jeżeli nie podam konkretnych wartości
        // w tablicy to zostaną one zainicjalizowane
        // wartościami domyślnymi (czyli 0 dla int)

        System.out.println(array3); // [I@31befd9f
//        for (int i=0; i<5; i++) {
        for (int i=0; i<array3.length; i++) {
            System.out.println(array3[i]);
        }

        // skoro tablice mają pola tzn.?
        // TABLICE SĄ OBIEKTAMI!!!
        int[] array4;
        array4 = array3; // NIE MA KOPIOWANIE TABLIC, przypisujemy tak naprawde REFERENCJĘ
        array4[1] = 5;
        System.out.println("array3 po modyfikacji array4[1]");
        for (int i=0; i<array3.length; i++) {
            System.out.println(array3[i]);
        }
        System.out.println("array4 po modyfikacji array4[1]");
        for (int i=0; i<array4.length; i++) {
            System.out.println(array4[i]);
        }
        array3[0] = 10;
        System.out.println("array3 po modyfikacji array3[0]");
        for (int i=0; i<array3.length; i++) {
            System.out.println(array3[i]);
        }
        System.out.println("array4 po modyfikacji array3[0]");
        for (int i=0; i<array4.length; i++) {
            System.out.println(array4[i]);
        }

        // drugi sposób wypisywania tablic
        System.out.println("Arrays.toString");
        System.out.println(
                Arrays.toString(array4)
        );

        Arrays.fill(array4, 696);
        System.out.println(
                Arrays.toString(array4)
        );

        // foreach współpracuje z tablicami
        for (int el: array4) {
            System.out.println(el);
        }

        // Zadanie 1
        // a) stworzyć tablicę 100 elementową
        // b) wypełnić ją wartościami od 100 do 1
        //    (100, 99, 98, 97, ..., 1)
        // c) wypisać tablicę
//        tab[i] = 100-i, i = 0, i++
//        tab[100-i] = i, i = 100, i--

        // Zadanie 2* (dla ambitnych)
        // a) napisać metodę, która przyjmuje n
        //    i zwraca tablicę n-elementową wypełnioną
        //    gdzie t(x) = x^2 (x >= 0, x < n, x - calkowite)

        // metody mogą zwracać tablice
        int[] arr = generateArray(10);
        System.out.println(
                Arrays.toString(arr)
        );

        // możemy tworzyć tablice obiektów
        CandyBracelet[] arrOfObject = new CandyBracelet[2];
        System.out.println(Arrays.toString(arrOfObject));
        arrOfObject[0] = new CandyBracelet();
        arrOfObject[1] = new CandyBracelet();

        doSomething(arrOfObject);
    }

    public static void doSomething(CandyBracelet[] bracelets) {
        for (CandyBracelet bracelet : bracelets) {
            bracelet.open();
            bracelet.wear();
            bracelet.eat();
        }
    }

    public static int[] generateArray(int n) {
        int[] array = new int[n];
        for(int i=0; i<n; i++) {
            array[i] = i*i;
        }

        return array;
    }
}
