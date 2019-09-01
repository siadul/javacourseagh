import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Klasa test służy do...
 * @author Krzysztof Siadul
 */
public class Operators {
    // definicja metod i/lub pól

    /**
     * metodą main blablabla
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Mój pierwszy program");
        System.out.println("Mój pierwszy program");
        System.out.println("Mój pierwszy program");
        System.out.println("Mój pierwszy program");

        System.out.print("a");
        System.out.print("b");
        System.out.print("c");
        // dla ambitnych, którzy znają pętle i się nudzą
        // narysować kwadrat z gwiazdek o boku n
        // out:
        // n = 3
        // ***
        // * *
        // ***

        // Zadanie 1
        // wypisać liczby od 1 do 3
        // out:
        // 1
        // 2
        // 3

        // ZMIENNE
        System.out.println("Zmienne");
        System.out.println(123343 + 323232 - 44 * 4 / 22);
        // wzór deklaracji zmiennych
        // typ nazwa;

        // Przykład:
        int rezultat = 2 + 2; // tzn. deklaruje zmienną o nazwie "rezultat", która przechowuje liczbę całkowitą
//         int rezultat3 = 2.5 + 2.5;// - nie zadziała, ponieważ wynikiem jest 5.0
        // Wniosek:
        double rezultat2 = 2 + 2; // niejawna konwersja typów
        // Nie możemy przypisywać zmiennej typu A wartości typu B, chyba, że  jawnie wymusimy
        // rzutowanie na typ A, lub taka konwersja nie wiąże się z utratą informacji

        // pamięć:
        // 1010100101010111011110101  01010
        int rezultat3 = (int) (2.0 + 2.0); // jawnie żądam konwersji typów

        System.out.println("2 + 2 = " + rezultat); // MC M+

//        cout << rezultat; - w cpp

        System.out.println("Rezultat działania wynosi: " + rezultat);

        // int - 32 bity = 4 bajty, -2^31 do +2^31-1
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

//        int dsaaa = 4444444444333333444444444444444444453 + 4444444444333333444444444444444444453;
        // zakres: -2147483648;2147483647
        // do operacji na większych liczbach będziemy używać typów Big
        // BigInteger, BigDecimal

        /*
        // typy podstawowe
        // całkowite
        byte - 8bit; - , -128, 127
                // 10101010, 2*2*...*2 = 2^8 = 256
        // 00 - 00, 01, 10, 11
        short - 16bit;
        int - 32bit;
        long - 64bit;

        // zmiennoprzecinkowe
        float - 32 bit;
        double - 64bit

        // logiczny
        boolean - True, False,

        // znakowy
        char - 16bitów, przykład: 't', uwaga! nie ""

        void;

        // typy obiektowe
        // Typy zdefiniowane przez nas jak np klasa Test,
        // String - czyli łańcuch znaków np. "Hello World"

        // tablice
        // grupa zmiennych tego samego typu
        // np. int[]*/

        // w javie mamy 3 rodzaje komentarzy

        // onelinery - jedna linia kodu

        /*
        komentarze wieloliniowe
        sdfsdsd
        sdfafsdafds
        fsdaafsdd
         */

        /**
         * komentarz dokumentujący
         */

        // Zadanie 2
        // w oparciu o powyższy kod proszę
        // stworzyć zmienną reprezentującą liczbę zmiennoprzecinkową
        // zapisać do niej wynik operacji 5.5 + 7.5
        // i wypisać ją.
        double d1 = 5.5 + 7.5;
        System.out.println(d1);

        short e = (short) 5;
        byte b = (byte) 4;
        long l = 4L;
        int i = 4;
        double d = 4.5;
        float f = 4.5f;
        boolean b1 = true;
        boolean b2 = false;
//        boolean b3 = (boolean) S0;  // mie uda się!

        // stałe vs zmienne
        d = 344;

        final int c = 45; // stałe tworzy się za pomocą słowa kluczowego final
//        c = 4; // nie uda się zmodyfikować stałej

        String str1 = "jakichś łańcuch znaków";
        System.out.println(str1);

        String str2 = "drugi łańcuch";
        String str3 = str1 + " + " + str2;
        System.out.println(str3);

        int nazwa_zmiennej = 4; // staramy się nie używać konwencji underscore
        int nazwaZmiennejKonwencjaCamelCase; // lecz camel case


        // operatory matematyczne
        int i1 = 4 + (byte)3;
        System.out.println(i1);
        int i2 = 2 + 2 * 2; // 6, 8?
        String s = "2+2=" + 2 + 2; // uwaga na dodawanie i konkatencacje
        String s2 =  2 + 2 + "=2+2"; // uwaga na dodawanie i konkatencacje
        System.out.println(i2);
        System.out.println(s);
        System.out.println(s2);
        int i3 = -4;

        int i4 = 5/2;
        System.out.println(i4);

        double d2 = 5/2;
        System.out.println(d2);

        double d3 = 5f/2;
        System.out.println(d3);

        // operator modulo - reszta z dzielenia dówch liczb
        int modulo = 10 % 2;
        System.out.println(modulo);


        // operator przypisania
        int aa1 = 4;
        int bb1 = 6;
        int cc1 = 9;

        aa1 = bb1 = cc1; // przypisania - operator prawostronny
        System.out.println(aa1); // 9?

        aa1 += 5; // równorzędny zapis: aa1 = aa1 + 5;
        bb1 -= 5; // równorzędny zapis: aa1 = aa1 - 5;
        System.out.println(aa1); // 9?
        System.out.println(bb1); // 9?
        aa1 *= 2;
        aa1 /= 2;
        aa1 %= 2;

        aa1 = 10;
        aa1++; // operator postinkrementacji
        aa1++;
        aa1--; // operator postdekrementacji
        System.out.println(aa1);
        ++aa1; // operator preinkrementacji // równorzędny zapis: aa1 = aa1 + 1
        --aa1; // operator predekrementacji
        --aa1;
        System.out.println(aa1); // 10
        System.out.println(aa1++); // 10
        System.out.println(aa1); // 11
        System.out.println(++aa1); // 12
        System.out.println(aa1); // 12
        // Wniosek
        // operator preinkrementacji/predekrementacji zwraca nam wartość zmiennej
        // powiększonej/pomniejszonej o 1
        // operator postinkrementacji/postdekrementacji zwraca nam wartość zmiennej
        // przed powiększeniem/pomniejszeniem tej zmiennej o 1
//        aa1++ = bb1++;

        // operatory relacji
        System.out.println(4 == 4.0);
        System.out.println(4 != 4.0);
        System.out.println(4 > 4.1);
        System.out.println(4 < 4.1);
        System.out.println(4 >= 4.1);
        System.out.println(4 <= 4.1);
        boolean boolean1 = 4 <= 4.2;
        System.out.println(boolean1);
        System.out.println((4 < 5) && (5 < 6));
        System.out.println((4 > 5) || (5 < 6));
        System.out.println(!(4 > 5));
        System.out.println(!(4 > 5) || ((5<2) && (6>3)));

//        boolean b33 = d == 0 ? false : true; // wyrażenie warunkowe

        // operatory bitowe
        byte byte1 = (byte)3; // 00000011;
        byte byte2 = (byte)2; // 00000010;

        System.out.println(byte1 & byte2); // and
        System.out.println(byte1 | byte2); // or
        System.out.println(byte1 ^ byte2); // xor
        System.out.println(~byte2); // not

        byte2 &= byte1; // równoważny zapis: byte2 = byte2 & byte1;
        byte2 |= byte1;
        byte2 ^= byte1;

        byte2 = (byte)3;

        // operatory przesunięć bitowych
        System.out.println("Operator przesunięć bitowych");
        System.out.println(byte2 << 1);
        System.out.println(byte2 << 2);
        System.out.println(byte2 >> 1);
        System.out.println(byte2 >> 2);
        // wniosek: mnożenie i dzielenie przez potęgę liczby 2

        byte2 >>= byte1; // równoważny zapis byte2 = byte2 >> byte1;
        byte2 <<= byte1; // równoważny zapis byte2 = byte2 << byte1;

        System.out.println("Operator trójargumentowy");
        // wyrażenie logiczne ? wartośc0 : wartość1
        System.out.println(4 < 5 ? 44 : "fałsz");

        // instrukcja if - else
        int wiek = 5;
        if (wiek >= 18) {
            // blok kodu wykonywany jeżeli warunek jest spełniony
            System.out.println("jesteśmy pełnoletni");
            System.out.println("możemy iść na piwo");
        } else {
            // blok kodu wykonywany jeżeli warunek nie jest spełnjony
            System.out.println("nie jesteśmy pełnoletni");
            System.out.println("idziemy pić kubusia");
        }

        // notacja wykładnicza
        double de1 = 1e3;
        double de2 = 10e-6;

        System.out.println(de1);
        System.out.println(de2);

        int oct1 = 071;
        System.out.println(oct1); // 57

        int hex1 = 0xFF; // ?
        System.out.println(hex1); // 255

        char ch = 'ą';
        System.out.println(ch);
        System.out.println((int)ch);
        ch = 'a';
        System.out.println((int)ch);


        // Zadanie
        // proszę napisać warunek if, który będzie wypisywał koumunikat
        // czy możemy iść do domu w oparciu o zmienną przechowywującą godzinę
//        int hour = 1;
        int hour = 11;
        if(hour == 16) {
            System.out.println("Możemy iść do domu");
        }
        else {
            System.out.println("Nie możemy iść do domu");
        }

        // możemy pominąć stosowanie klamer, jeżeli mamy tylko 1 instrukcję
        // natomiast nie jest to zalecane z punktu widzenia przejrzoystości
//        if(hour == 16)
//            System.out.println("Możemy iść do domu");
//        else
//            System.out.println("Nie możemy iść do domu");
        if(hour == 16) {
            System.out.println("Możemy iść do domu");
        } else if(hour == 11) {
            System.out.println("Możemy iść na przerwę");
        } else {
            System.out.println("Musimy siedzieć i się uczyć javy");
        }

        // Zadanie
        // Sprawdzić czy zmienna n jest podzielna przez 3. Jeżeli tak
        // wypisać stosowny komunikat. Jeżeli nie sprawdzić
        // czy liczba ta jest podzielna przez 2.
        // Jeżeli nie jest podzielna ani przez 3 ani przez 2.
        // wypisać komunikat, że liczba nie jest podzielna przez 6.


        int n = 35;

        if (n % 3 == 0) {
            System.out.println("n podzielne jest przez 3");
        } else if (n % 2 == 0) {
            System.out.println("n podzielne jest przez 2");
        } else {
            System.out.println("n nie podzielna jest przez 6");
        }
        // Uwaga!
        // po instrukcji if nie dajemy ; ponieważ najprawdopodobniej
        // kod nie wykona się poprawnie mimo kompilacji


        // Dla ambitnych
        // Zrobić to samo tylko przy użyciu operatora trójargumentowego
        // warunek ? jezeli tak : jezeli nie

        System.out.println(
                n % 3 == 0 ? "n podzielna przez 3" : (n % 2 == 0 ?
                        "n podzielne przez 2" : "nie podzielne przez 6")
        );
    }

}
