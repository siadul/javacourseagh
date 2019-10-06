import interfaces.*;

import java.util.*;

import collections.Stack;

//import polymorphism.Inner;

public class Zajecia8 {
    public static void main(String[] args) {

        /*
        // tablice wielowymiarowe...
        arrays2();

        // Zadanie 1
        // Napisać metodę, która przyjmuje n
        // i wypisuje macierz jednostkową n*n
        // czyli dla n = 3
        // 100
        // 010
        // 001
        excercise1(1);
        excercise1(3);
        excercise1(5);

        // Zadanie 2
        // Napisać metodę, która przyjmuje n
        // i wypisuje macierz n-wymiarową, która
        // ma na obu przekątnych znak 'X, a na pozostałych
        // znak 'O"
        //
        // in: 3

        // out:
        // XOX
        // OXO
        // XOX

        // in: 4

        // out:
        // XO0X
        // OXXO
        // 0XX0
        // XO0X
        excercise2('X', 1);
        excercise2('X', 3);
        excercise2('X', 4);
        excercise2('X', 5);

        // tablice są fajne, ale co jeżeli potrzebujemy
        // dynamicznie zmieniać ich rozmiar?

        // Musimy użyć kontnerów
        // List (Stack, Queue, Dequeue), Set, Map
        collections1();
        excercise3();

        // List
        stack();
        queue();
        deque();

        // Set
        set();
        excercise4();

        // Map
         */
        map();
    }

    private static void map() {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("klucz1", 10);
        hashMap.put("klucz2", 20);
        hashMap.put("klucz3", 30);
        System.out.println(hashMap); // brak konkretnego
        // uporządkowania par klucz->wartość

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("klucz3", 30);
        linkedHashMap.put("klucz1", 10);
        linkedHashMap.put("klucz2", 20);
        System.out.println(linkedHashMap); // pary występują
        // w kolejności dodawania

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("klucz3", 30);
        treeMap.put("klucz1", 10);
        treeMap.put("klucz2", 20);
        System.out.println(treeMap); // pary są posortowane
        // rosnąco wg wartości (alfabetycznie w przypadku stringów)

        // zagnieżdżanie map
        Map<String, Map<String, Integer>> map = new HashMap<>();
        Map<String, Integer> innerMap = new HashMap<String, Integer>();
        innerMap.put("innerMap - key1", 4);
        innerMap.put("innerMap - key2", 9);
        map.put("innerMap", innerMap);
        map.put("treeMap", treeMap);
        map.put("linkedHashMap", linkedHashMap);
        map.put("hashMap", hashMap);
        System.out.println(map);

        // Zadanie
        // Stworzyć mapę, która odwzorowywuje
        // String na String
    }

    private static void excercise4() {
        // Korzystając z kontenera typu Set
        // stworzyć kolekcję unikatówych ciągów
        // znaków wprowadzonych przez użytkownika
        // z klawiatury.
        // Przy każdym wprowadzeniu danych proszę
        // wypisywać zawartość kontenera
        Scanner scanner = new Scanner(System.in);
        String input;
        Set<String> set = new HashSet<>();
        do {
            input = scanner.nextLine();
            set.add(input);
            System.out.println(set);
        } while(!input.equals("exit"));
    }

    private static void set() {
        System.out.println("Set");
        Set<Integer> set1 = new HashSet<Integer>();

        set1.add(4);
        set1.add(8);
        set1.add(7);
        set1.add(4);
        System.out.println(set1);

        // TreeSet
        // LinkedHashSet
        Set<Integer> set2 = new LinkedHashSet<Integer>();
        set2.add(4);
        set2.add(8);
        set2.add(7);
        set2.add(4);
        System.out.println(set2);
    }

    private static void deque() {
        Deque<Integer> deque = new LinkedList<>();
        deque.add(8);
        deque.addLast(7);
        deque.addFirst(4);
        System.out.println(deque);
        while(!deque.isEmpty()) {
            int el = deque.poll();
            System.out.println(el);
        }
    }

    private static void queue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(8);
        queue.add(7);
        queue.add(4);
        System.out.println(queue);
        while(!queue.isEmpty()) {
            int el = queue.poll();
            System.out.println(el);
        }
    }

    private static void linkedlists() {
        //        class Node {
//            Node next;
//        }
//        Node n = new Node();
//        n.next = new Node();

        List<Integer> l = new LinkedList<Integer>();
        // Jeżeli będe wykonywał wiele ooperacji
        // pobierania elementu z kolecji - używam
        // ArrayList

        // jeżeli wykonuje wiele operacji wstawiania
        // używam kolekcji LinkedList
        // Interfejs List nie posiada m.in. niżej wymienionych
        // metod
//        l.offer();
//        l.addFirst()
    }

    private static void excercise3() {
        // Zadanie 3
        // W pętli wczytywać liczby dopóki
        // użytkownik nie wpisze exit.
        // Wartości umieszczać w kolekcji ArrayList.
        // Po każdym podaniu przez użytkownika liczby
        // wypisywać całą zawartość kolekcji.
        Scanner scanner = new Scanner(System.in);
        String input;
        List<Integer> list = new ArrayList<>();
        do {
            input = scanner.nextLine();
            try {
                int parsedInput = Integer.parseInt(input);
                list.add(parsedInput);
            } catch(NumberFormatException e) {
                if (!input.equals("exit")) {
                    System.out.println(
                            "Podano nieprawidłową wartość");
                }
            }
            System.out.println(list);
        } while(!input.equals("exit"));
    }

    public static void arrays2() {
        int[][] arr = new int[3][]; // wystarczy określić
        // liczbe elementów pierwszej tablicy

        arr[0] = new int[5];
        arr[1] = new int[10];
        arr[2] = new int[15];


        // za pomocą foreach nie uda mi się modyfikacja
        // elementów tablicy - ponieważ zachodzi
        // kopiowanie wartości typów podstawowych.
        // Musiałbym wprowadzić indeksy i,j
//        for (int[] subArr:arr) {
//            for (int el: subArr) {
//                el = 3;
//                System.out.println(el);
//            }
//        }

        // lepszym wyjściem jest skorzystanie z pętli for
        Random random = new Random(47);
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }

        for (int[] subArr:arr) {
            for (int el: subArr) {
                System.out.print(el + " ");
            }
            System.out.println();
        }

        int[][][] arr3 = {
                {
                        {100, 200, 300}, {400, 500, 600},
                        {1000, 2000, 3000}, {4000, 5000, 6000},
                },
                {
                        {1, 2, 3}, {4, 5, 6},
                        {10, 20, 30}, {40, 50, 60},
                },
        };
        // 2 wiersze, 4 kolumny, 3 elementy w najbardziej
        // zagnieżdzonej podtablicy
        for (int[][] subArr1:arr3) {
            for (int[] subArr2: subArr1) {
                System.out.print("{");
                for (int el: subArr2) {
                    System.out.print(el + ", ");
                }
                System.out.print("}, ");
            }
            System.out.println();
        }

        System.out.println(
            Arrays.deepToString(arr3)
        );
    }

    private static void stack() {
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        l2.offer(4);
        l2.addFirst(2);
        l2.getFirst();
        l2.removeFirst();
        l2.listIterator();
        l2.peek();
        l2.poll();


        // LIFO (Last In First Out) - Stack (stos)-
        // przykład:
        // stoś naczyń w zlewie

        // FIFO (First In First Out)
        // przykład:
        // kolejka w sklepie


//        l.add();
//        l.get();

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(4);
        stack.push(7);
        stack.push(8);
        while(!stack.empty()) {
            int x = stack.pop();
            System.out.println(x);
        }
        System.out.println(stack);
    }

    public static void excercise1(int n) {
        int[][] matrix = new int[n][n];
        for(int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {
                if(i == j) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void excercise2(char c, int n) {

//        tab[0][n-1]
//        tab[1][n-2]
//        tab[2][n-3]
//        tab[n][n-n]

        char[][] matrix = new char[n][n];
        for(int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {
                if(i == j) {
                    System.out.print(c);
                } else if(j == n-i-1) {
                    System.out.print(c);
                } else {
                    System.out.print('O');
                }
            }
            System.out.println();
        }
    }

    public static void collections1() {
        // Problem
        // Pobierać od użytkownika z klawiatury
        // liczby typu int, dopóki nie wpisze exit i nacisnie
        // znak enter
        // Następnie wypisywać tablica, która składa się
        // z kwadratów liczb wprowadzonych przez użytkownika.

        int a1 = 10;
        int a2 = 20;
        int a3 = 30;
        char c1 = '4';
        List list = new ArrayList(); // LinkedList
        list.add(new Integer(a1)); // mechanizm automatycznego
        // pakowania
        list.add(a2);
        list.add(a3);
        list.add(c1);
        System.out.println(list);

        int a2b = (int) list.get(1);
//        int c1b = (int) list.get(3); // dopiero
        // w czasie działania programu wystąpi błąd@
        System.out.println(a2b);
//        System.out.println(c1b);


        // O wiele lepiej określać typ
        // przechowywanych elementów
        List<Integer> list2 = new ArrayList<Integer>(); // LinkedList
        list2.add(new Integer(a1)); // mechanizm automatycznego
        // pakowania
        list2.add(a2);
        list2.add(a3);
//        list2.add(c1); // dzięki określeniu typu
        // przechowywanych elementów, kompilator
        // już na etapie analizy statycznej zgłosi bład
        // jeżeli spróbujemy dodać zmienną niewłaściwego
        // typu
        System.out.println(list2);

        a2b = list2.get(1);
        System.out.println("Rozmiar list2: " + list2.size());
//        int c1b = list2.get(3); // 3 elementy, a próbujemy
        // odwołać się do 4 (indeksujemy od zera)
        System.out.println(a2b);
//        System.out.println(c1b);
        System.out.println(list2);
        list2.remove(1);
        System.out.println(list2);
        list2.remove(1);
        System.out.println(list2);
//        list2.removeAll(list2);
        list2.clear();
        System.out.println(list2);
        System.out.println(list2.isEmpty());

        list2.addAll(Arrays.asList(2, 3, 4, 5));
        List<?> list3 = new ArrayList<>(
                Arrays.asList(3, 4, 5, 6)
        );
        list2.retainAll(list3);
        System.out.println(list2);
        Object[] arr = list3.toArray();
        System.out.println(
                Arrays.toString(arr)
        );
        System.out.println(arr[0].getClass());

        int[] arr2 = new int[arr.length];
        for(int i = 0; i<arr.length; i++) {
            arr2[i] = (int)arr[i];
        }
        System.out.println(
                Arrays.toString(arr2)
        );
        System.out.println(arr2[0]);

        // iterator
        System.out.println("iteratory");
        Iterator iterator = list2.iterator();
//        list2.add(3); // nie mogę modyfikować
//        kolekcji dopóki istnieje iterator
        iterator.next();
        int next = 0;
        if(iterator.hasNext()) {
            next = (int) iterator.next();
        }
        System.out.println(next);

        for (int next2: list2) {
            System.out.println(next2);
        }

    }
}
