package exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Exceptions {
    public static void main(String[] args) throws Throwable {
//        exceptions1();
//        exceptions2();
        zadanie1();
        exceptions3();

    }

    private static void exceptions3() {
        // łączenie obsługi kilku wyjątków naraz
        // zagnieżdząnie try-catch
        // deklaracja throws dla kilku wyjątków
        // ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException

    }

    private static void zadanie1() {
        // Stworzyć własną klasę wyjątku CriticalException
        // Podczas rzucania wyjątku powinien się wyświetlić napis
        // na standardowe wyjście z informacją dla użytkownika o wystąpieniu
        // błędu krytycznego.
        // Dodać metodę w osobnej klasie i wyrzucić ten wyjątek oraz dodać jego obsługę
        // w kontekście wyżej (np. w metodzie głównej main)
        // za pomocą klauzuli try-catch-finally
        // Niezależnie od przechwycenia bądź nie wyjątku powinniśmy wypisywać
        // komunikat "TRWA ZAMYKANIE PLIKU..."
        try {
            try {
                innerContext();
            } catch (CriticalException | ArithmeticException |
            NullPointerException | ArrayIndexOutOfBoundsException
                    | StringIndexOutOfBoundsException e) {


                e.printStackTrace();
                // tutaj powinno być co najmniej logowanie błędu
            } finally {
                System.out.println("TRWA ZAMYKANIE PLIKU...");
                System.out.println(10/0);
                System.out.println("after 10/0");
            }
        } catch(ArithmeticException e) {
            e.printStackTrace();
        }
    }

    private static void innerContext() throws CriticalException, ArithmeticException {
        if(false) {
            System.out.println(10/0);
        }
        throw new CriticalException("trying to do calculation 10/0");
    }

    private static void exceptions1() throws Throwable {
        // something goes wrong...
        throw new Throwable();
    }

    private static void exceptions2() {
        // something goes wrong...
        try {
            throw new RuntimeException();
        } catch (RuntimeException re) {
            // od szczegółu do ogóły - kolejność przechwytywania wyjątków

        } catch (Throwable throwable) {
//             powinniśmy dodać logowanie błedu np. do pliku
            throwable.printStackTrace();
        } finally {
            // tutaj instrukcję będą wykonane zawsze
            // niezależnie od tego czy przechwycimy wyjątek
            // czy też nie
            System.out.println("blok finally");
            // sprzątamy
            // np. zamykamy otwarty do przetwarzania plik
        }

        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Przechwycono " + e);
        }
        try {
            throw new LoggingException();
        } catch(LoggingException e) {
//            System.err.println("Przechwycono + " + e);
        }
//        System.out.println("RuntimeException");

    }
}

class LoggingException extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException");
    public LoggingException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

class CriticalException extends Exception {
    public CriticalException() {
        System.out.println("Wystąpił błąd krytyczny");
    }
    public CriticalException(String message) {
        super(message);
        System.out.println("Wystąpił błąd krytyczny");
    }
}