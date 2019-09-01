import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.println("pętla for");

        // czym są pętle?
        // Przykład wypisać liczby od 1 do 100

        // 4 rodzaje: for, while, do while, foreach

        // for
        // składnia
//        for(definicja zmiennej licznikowej; warunek; modyfikacja licznika) {
            // instrukcje które będziemy powtarzać
//        }
        for (int i = 1; i<=100; i=i+1) {
            System.out.println(i);
        }

        // Przykład
        // Wypisać alfabet.
//        int alphabetLength = (int)'z' - (int)'a' + 1;
//        // I sposob
//        for (int i = 0; i<alphabetLength; i++) {
//            System.out.println((char)('a' + i));
//        }

        // II sposób
        for (char c = 'a'; c<='z'; c++) {
            System.out.println(c);
        }

        // Zadanie 1
        // Wypisać liczby od 50 do 25 (50, 49, 48 ... 25)

        // Zadanie 2
        // Wypisać liczby od 50 do 25 z krokiem 5 (50, 45, 40, ..., 25)
        for(int i=50; i>=25; i=i-5) {
            System.out.println(i);
        }

        // pętli while
//        while(warunek) {
//            // instrukcje
//        }
        int i = 1;
        while(i <= 1000) {
            if(i % 99 == 0) {
                System.out.println(i);
            }
            i++;
        }

        // Zadanie
        // Wypisać wszystkie samogłoski przy użyciu pętli while.
        char c = 'a';
        while(c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                System.out.println(c + " jest samogłoską");
            }
            c++;
        }

        // pętla nieskończona
        // Przykład: znaleźć kod odpowiadający znakowi '$'
        char cc = 0;
        while (true) {
            if(cc++ == '$') {
                System.out.println((int) cc);
                break; // instrukcja ta sprawia, że natychmiast przerywana jest pętla
            }
        }

        // do while
//        do {
//            // instrukcje
//        } while(warunek);

        // Przykład
        // Pobierać dane z klawiatury dopóki użytkownik nie wpisze "koniec" (i nacisnie enter)
//        Scanner scan = new Scanner(System.in);
//        String data;
//        do {
//            data = scan.nextLine();
//        } while(!data.equals("koniec"));

        // wniosek
        // w przypadku do while - najpierw wykonujemy operacje a potem sprawdzamy warunek

        // Zadanie
        // Wypisać liczby od 1 do 100
        // przy użyciu pętli do-while
        i = 1;
        do {
//            System.out.println(++i); // nie zadziała pooprawnie
            System.out.println(i++);
        } while(i <= 100);

        // foreach
//        for (element : zbiór) {
//             instrukcje
//        }

        // Przykład
        int[] array1 = new int[3]; // [ 0, 0, 0 ]
        array1[0] = 1; // [ 1, 0, 0 ]
        array1[1] = 200; // [ 1, 200, 0 ]
        array1[2] = 5000; // [ 1, 200, 5000 ]
        for(int el : array1) {
            System.out.println(el);
        }

        // Zadanie
        // przy użyciu dowolnej pętli proszę rysować trójkąt prostąkątny równoramiennu o bokach
        // o długości k
        // np. k = 3
        // *
        // **
        // ***

        /*int k = 0;
        do {
            System.out.println("Podaj bok k trójkąta: ");
            Scanner scanner = new Scanner(System.in);
//        int k = 8;
            k = Integer.parseInt(scanner.nextLine());
            for (i = 0; i < k; i++) {
                for (int n = 0; n <= i; n++) {
                    System.out.print('*');
                }
                System.out.println();
            }
        } while(k != 0);
*/
        // wskazówka
        // pętle można zagnieżdżać


        // switch
        // składnia
//        switch(zmienna) {
//            przypadek1:
//                // instrukcje
//            break;
//            przypadek2:
//                // instrukcje
//            break;
//            default:
//                // instrukcje wykonywane domyślnie
//        }

        // Przykład
        // Pobrać z klawiatury jakiś ciąg znaków
        // i jeżeli będzie to wartość 9 to wypisz komunikat
        // początek zajęć
        // jeżeli 13 to wypisz "przerwa"
        // jeżeli 16 to wypisz "koniec zajęć"
        // zajęcia trwają
        int hour = 17;
        switch(hour) {
            case 9:
                System.out.println("początek zajęć");
                break;
            case 13:
                System.out.println("przerwa");
                break;
            case 16:
                System.out.println("koniec zajęć ");
                break;
            default:
                System.out.println("zajecia trwaja");
        }

        // Zadanie
        // przerobic instrukcje switch na if
        if(hour == 9) {
            System.out.println("początek zajęć");
        } else if (hour == 13){
            System.out.println("przerwa");
        } else if (hour == 16) {
            System.out.println("koniec zajęć ");
        } else {
            System.out.println("zajecia trwaja");
        }

        // Przykład czy zmienna jest samogłoską czy nie
        char c1 = 'z';
        char c2 = 'y';
        switch (c1) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
//            case c2: // nie zadziała, musimy mieć tutaj STAŁE
                System.out.println("samogłoska");
                break;
            default:
                System.out.println("spółgłoska");

        }

        // kilka pułapek
        // użycie operatora przypisania zamiast porównania
        boolean b1 = true;
        boolean b2 = false;
        if (b1 = b2) {
            // niechcący nadpisaliśmy zmienną b1
        }

        // nieprawidłowe użycie średnika w if
        if (b1 == b2);
        {
            // do something
        }

        // użycie operatorów bitowych zamiast operatorów logicznych
        if (b1 | b2) {
            // do something
        }
    }
}
