package exam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie2 {
    public static void main(String[] args) {
        // Napisz program, który wczyta do zawartość pliku tekstowego ASCII o nazwie literki.txt.
        Path path = Paths.get("literki.txt");
        List<String> in = new ArrayList<>();
        try {
            in = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Nie udało się otworzyć pliku!");
        }

        System.out.println(in);

        // Stwórz histogramu wystąpienia znaków w tekście i zapisz tablicę w pliku hist.txt
        // 0 - pierwszy znak ASCII
        // 48 - 0
        // 97 - a
        // 127 - ostatni znak ASCII

        // aabc
        // tab[97] - 2
        // tab[98] - 1
        // tab[99] - 1
        System.out.println((char)48);
        System.out.println((char)97);
        System.out.println((char)127);

        final int asciiSize = 128;
        int hist[] = new int[asciiSize];
        for(String line: in) {
            char[] chars = line.toCharArray();
            for(char ch: chars) {
                if(ch < asciiSize) {
                    hist[ch]++;
                }
            }
        }

        char[] hist2 = new char[asciiSize];
        for(int i=0; i<hist.length; i++) {
            if(i<30) {
                hist2[i] = 0;
            } else {
                hist2[i] = (char) i;
            }
        }
        System.out.println(Arrays.toString(hist));
        System.out.println(Arrays.toString(hist2));

        List<String> out = new ArrayList<>();
        out.add(Arrays.toString(hist));
        Path pathOut = Paths.get("hist.txt");
        try {
            Files.write(pathOut, out);
        } catch (IOException e) {
            System.out.println("Nie udało się otworzyć pliku!");
        }

        // Zamień miejscami dwa najczęściej występujące w tekście znaki i zapisz cały zmieniony ciąg znaków
        // do pliku zamiana.txt
        int maxCode1 = 0;
        int maxCode2 = 0;
        for(int i=0; i<hist.length; i++) {
            if(hist[i] > hist[maxCode1]) {
                maxCode1 = i;
            }
        }
        for(int i=0; i<hist.length; i++) {
            if(hist[i] > hist[maxCode2] && i != maxCode1) {
                maxCode2 = i;
            }
        }

        System.out.println((char)maxCode1);
        System.out.println((char)maxCode2);

        List<String> out2 = new ArrayList<>();
        for(String line: in) {
            char[] chars = line.toCharArray();
            StringBuilder str = new StringBuilder();
            for(char ch: chars) {
                if(ch == maxCode1) {
                    ch = (char)maxCode2;
                } else if(ch == maxCode2) {
                    ch = (char)maxCode1;
                }
                str.append(ch);
            }
            out2.add(str.toString());
        }

        Path pathOut2 = Paths.get("zamiana.txt");
        try {
            Files.write(pathOut2, out2);
        } catch (IOException e) {
            System.out.println("Nie udało się otworzyć pliku!");
        }

        // wspak
        List<String> out3 = new ArrayList<>();
        for (String line: in) {
            StringBuilder str = new StringBuilder();
            char[] chars = line.toCharArray();
            for(char c: chars) {
                str.insert(0, c);
            }
            out3.add(0, str.toString());
        }

        Path pathOut3 = Paths.get("wspak.txt");
        try {
            Files.write(pathOut3, out3);
        } catch (IOException e) {
            System.out.println("Nie udało się otworzyć pliku!");
        }
    }
}
