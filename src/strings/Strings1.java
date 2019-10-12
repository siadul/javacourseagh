package strings;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings1 {
    public static void main(String[] args) {
//        strings1();
        strings2();
    }

    private static void strings2() {
//        Formatter
//        printf("test %d %f", 4, 2.34); // cout << sdsds < dsdssd;
        System.out.format("test %d %50.2e %s", 4, 2.34, "xxx");
        System.out.format("test %d %-50.2f %s", 4, 2.34, "xxx");
        System.out.format("test %2$d %1$d", 4, 9); // numeracja zaczyna się od 1
        // b, e - zmiennoprzecinkowe w notacji naukowej
        // x - całkowite w zapisie heksadecymalnym (16tkowym)
        // h - hash code (skórt)
        // c - znak

        // składnia
//        %[indeks_argumentu$][znaczniki][szerokość][.precyzja]konwersja

        // Przykład
        System.out.println();

        class Receipt {
            private double total = 0;
            private Formatter f = new Formatter(System.out);
            public void printTitle() {
                f.format("%-15s %5s %10s\n", "Towar", "Ilość", "Cena");
                f.format("%-15s %5s %10s\n", "-----", "-----", "----");
            }
            public void print(String name, int qty, double price) {
                f.format("%-15.15s %5d %10.2f\n", name, qty, price);
                total += price;
            }
            public void printTotal() {
                f.format("%-15s %5s %10.2f\n", "Podatek", "", total*0.23);
                f.format("%-15s %5s %10s\n", "", "", "-----");
                f.format("%-15s %5s %10.2f\n", "Razem", "", total * 1.23);
            }
        }

        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Magiczna fasola", 4, 4.25);
        receipt.print("Ziarnko grochu", 3, 5.1);
        receipt.print("Kij samobij", 1, 14.29);
        receipt.printTotal();

        // String.format
        String s = String.format("%-15s %5s %10.2f\n", "Podatek", "", 99*0.23);
        System.out.println(s);


        System.out.println("Wyrażenia regularne");
        // Wyrażenia regularne
//        Pattern i Matcher
        String s1 = "Jan Kowalski, 554 234 687";
        String s2 = "Adam Nowak, +48 343 23 21";
//        Pattern p = Pattern.compile("\\d\\d\\d \\d\\d\\d \\d\\d\\d");
//        Pattern p = Pattern.compile("(\\d\\d\\d ){3}"); // nie zadziała
        Pattern p = Pattern.compile("(\\+\\d{2} )?(\\d{2,3} ?){3}");
        Matcher matcher = p.matcher(s1);
        System.out.println(s1);
        System.out.println(matcher.find());
        System.out.println(matcher.start());
        System.out.println(matcher.end());
        System.out.println(matcher.group());
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
//        Pattern p2 = Pattern.compile("\\+\\d{2} \\d{3} \\d{2} \\d{2}");
        matcher = p.matcher(s2);
        System.out.println(s2);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }

        String s3 = "Model YZF-R1";
        System.out.println(
                s3.matches("Model[^\\w][A-Z0-9-]+")
        );

        String s4 = "jakieś,dane,zapisane,w,formacie,csv";
        String s5 = "jakieś;dane;zapisane;w;formacie;csv";
        System.out.println(
                Arrays.toString(s4.split(",|;"))
        );
        System.out.println(
                Arrays.toString(s5.split("[,;]"))
        );

        // grupy - ()
        String s6 = "Model YZF-R1 (2019)"; // interesuje mnie rocznik
        Pattern p2 = Pattern.compile("YZF-R1 \\((\\d{4})\\)");
        Matcher m = p2.matcher(s6);
        if(m.find()) {
            System.out.println(m.group());
            System.out.println(m.group(1));
        }

        // Zadanie
        // Napisać metodę, która w oparciu o REGEX będzie sprawdzała czy podany ciąg
        // jest adresem email

        // Założenia:
        // - musi być w środku znak @
        // - @ nie może się powtarzać
        // - ogólny wzór ADRES@DOMENA1.DOMENA2...DOMENAN










    }

    private static void strings1() {
        // Stringi w Javie są NIEMUTOWALNE
        // wszelkie operacje na nich zwracają nowe obiekty typu String
        String x = "test";
        String y = "something";
        y = x;
        x = y.replace('t','k');
        System.out.println(x);

        // split - dzieli string na tablice stringów w oparciu o regex
        y = "ala:-:ma:-:kota";
        System.out.println(y);
        String[] chunks = y.split(":-:");
        System.out.println(
                Arrays.toString(chunks)
        );

        // jeżeli chce umieścić znak " w obrębie stringa to muszę go
        // poprzedzić znakiem \
        System.out.println("liczba znaków w \"" + y + "\" wynosi " + y.length());
        int n = y.length() - 1;
        System.out.println(n + "ty znak w tym stringu to: " + y.charAt(n));

        // contains - czy podciąg występuje w ciągu znaków, zwraca boolean
        System.out.println(y.contains("alek"));
        System.out.println(y.contains("ala"));

        // porównywanie stringów
        System.out.println(y == "ala:-:ma:-:kota"); // true
        x = "ala:-:ma:-:kota";
        System.out.println(y == x); // true

        y = y.replace('a', 'k');
        x = x.replace('a', 'k');
        System.out.println("y: " + y);
        System.out.println("x: " + x);
        System.out.println(y == x); // false

        // Stringi są obiektami, porównujemy je metodą equals!!!
        x = new String(""); // z
        y = new String("");
        System.out.println(x == y); // false
        System.out.println(x.equals(y));

        y = "ala ma kota";
        x = "ala ma kota";
        System.out.println(x.startsWith("ala", 1));
        System.out.println(x.startsWith("la", 1));
        System.out.println(x.endsWith("kota"));

        // indexOf - zwraca pozycję od której zaczyna się podciąg występujący w stringu
        //           lub -1 jeżeli on nie występuje
        System.out.println(x.indexOf("ma")); // 4
        System.out.println(x.indexOf("psa")); // -1
        System.out.println("ma ala kota ma".indexOf("ma", 1)); // 12
        System.out.println("ma ala kota ma".lastIndexOf("ma")); // 12

        // substring - zwraca podciąg określony za pomocą indeksów pocz i kończ
        System.out.println("ala kota ma".substring(3)); // 12
        System.out.println("ala kota ma".substring(4, 6)); // 12
//        System.out.println("ala kota ma".substring(-2));

        // replace
        System.out.println(
                "ala ma kota lala".replace("la", "nia")
        );
        System.out.println(
                "ala ma kota lala".replaceFirst("la", "nia")
        );
        System.out.println(
                "ala ma kota lala".replaceAll("l.+?a", "nia")
        );

        // do replaceAll mogę podawać wyrażenie regularne!
        System.out.println(
                "      test  sdsdds      ".trim()
        );

        // valueOf
        System.out.println(
                String.valueOf(4).equals("4")
        );
        char[] c = {'a', 'b', 'c'};
        System.out.println(
                String.valueOf(c)
        );


        // Zadanie 1
        // Stworzyć metodę, która będzie zwracała zbiór niepowtarzalnych
        // Stringów, składający się ze słów występujących w ciągu wejściowym

        // IN:
        // "ma ala kota ma"

        // OUT:
        // [ma, ala, kota]

        // podpowiedź: Set<String>
//        zadanie1();

        // toUpperCase/toLowerCase - zmiana wielkości liter
        // radzi sobie również z polskimi znakami!
        System.out.println(
                "ala ma kota ś".toUpperCase()
        );
        System.out.println(
                "ALA MA KOTA Ś".toLowerCase()
        );

        // StringBuilder
        String s1 = "";
        String s2 = "word";
        for (int i=0; i<5; i++) {
            s1 += s2 + i + " "; // Stringi nie są mutowalne
            // przy każdej takiej operacji powstaje nowy obiekt
        }

        // jeżeli mamy wiele tego typu operacji to lepiej korzystać
        // z obiektu StringBuilder, który jest mutowalny
        StringBuilder sb1 = new StringBuilder();
        for (int i=0; i<5; i++) {
            sb1.append(s2).append(i).append(" ");
        }

        sb1.delete(3, 5);
        String xx = sb1.toString(); // tworze Stringa na podstawie StringBuildera
        System.out.println(
            sb1.reverse()
        );

        System.out.println(sb1);

        // Zadanie
        // Dodać metodę, która sprawdza czy String podany jako argument
        // jest palindromem (bez względu na wielkość liter)
        // KAJAK - true
        // Ala - true
        // zaKOPANEnaPOKAZ - true
        // KOt - false
        palindrom("za");
        palindrom("ZAKOPANENAPOKAZ");
        palindrom("ZakopaneNaPokaz");
        palindrom("KAJAK");

        // porównywanie stringów
        // aaa < bbb, true
        System.out.println("aaa".compareTo("bbb"));
        System.out.println("aaa".compareTo("cde"));
        System.out.println("aaa".compareTo("aaa"));
        System.out.println("bbb".compareTo("aaa"));
        System.out.println("a".compareTo("d"));


        // join - przeciwieństwo split
        String[] s = {"xx", "yy", "zzz"};
        System.out.println(
                String.join(", ", "ala", "ma", "kota")
        );
        System.out.println(
                String.join("|", s)
        );

        // StringBuffer - klasa podobna do StringBuildera
        // służy tworzenia łańcuch znaków mutowalnych
        // StringBuffer jest bezpieczny jeśli chodzi o operacje
        // wielowątkowe
        // StringBuilder nie jest bezpieczny jeśli chodzi o operacje
        // wielowątkowe, ale jest bardziej WYDAJNY

        // Zadanie 3
        // Napisać metodę, która przyjmuje 3 argumenty
        // int n, int k i String charSet, i na ich podstawie generuje
        // tablicę/kontener n-elementowy Stringów o długości k,
        // składających się z losowych znaków ze zbioru charSet.
        // Litery w generowanych ciągach znaków nie mogą się powtarzać.

        // IN
        // 2, 3, "abc123"

        // OUT - przykładowe
        // 1ca
        // a3b


        // Wskazówka
        // str.toCharArray() - zwraca tablicę znaków utworzoną na podstawie Stringa str

        // informacyjnie - getChars/getBytes - zwraca tablicę znaków/bajtów


        // a3a - nie spełnia bo a nie może się powtarzać
        zadanie3(2, 3, "abcdef1234");
        zadanie3(20, 5, "@#$%^&*");



    }

    private static void zadanie3(int n, int k, String charSet) {
        String[] result = new String[n];
        Random r = new Random();
        for(int i=0; i<n; i++) {
            StringBuilder s = new StringBuilder();
            for(int j=0; j<k; j++) {
                char ch = charSet.charAt(r.nextInt(charSet.length()));
                if (-1 != s.toString().indexOf(ch)) {
                    j--;
                } else {
                    s.append(ch);
                }
            }
            result[i] = s.toString();
        }
        System.out.println(
                Arrays.toString(result)
        );
    }

    private static void palindrom(String s) {
//        System.out.println(
//                s.toLowerCase().equals(
//                        new StringBuilder(s).reverse().toString().toLowerCase()
//                )
//        );
        System.out.println(
                s.equalsIgnoreCase(
                        new StringBuilder(s).reverse().toString()
                )
        );
    }

    private static void zadanie1() {
        System.out.println("Zadanie1");
        Scanner s = new Scanner(System.in);
        String[] in = s.nextLine().split(" ");
        Set<String> set = new LinkedHashSet<>();
        for (String word: in) {
            set.add(word);
        }
        System.out.println(set);
    }
}
