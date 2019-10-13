package inner;

import inner.external.Calculation;
import inner.external.HiggsFinder;


public class Inner {
    static class X {
        int x = 1;
        // klasy niestatyczne nie mogą mieć żadnych elementów statycznych
        static class Y {
            int y = 2;
        }
    }

    public static void main(String[] args) throws Throwable {
        inner1();
        zadanie1();
        anonymous1();
        zadanie2();
        lambdas();
        staticClass();
    }

    private static void lambdas() {
        HiggsFinder higgsFinder = new HiggsFinder();
        final int x = 1;
        higgsFinder.findHiggsBozon(new Calculation() {
            @Override
            public int getX(int a) {
                System.out.println();
                return a*x;
            }
        });

        // lambda - odpowiadający kod ale bez println
        higgsFinder.findHiggsBozon((a) -> 2*x);

        // lambda - odpowiadający kod
        higgsFinder.findHiggsBozon((a) -> {
            System.out.println("hello lambda");
            return 2*x;
        });
    }

    private static void staticClass() {
        // w klasach statycznych nie możemy odwoływać się do pól
        // i metod klasy otaczającej

//        X x = new X();
//        System.out.println(x.x);

//        X.Y xy = x.new Y(); nie tak jak w przypadku klas niestatycznych
        X.Y xy = new X.Y();
        System.out.println(xy.y);

        // Zadanie dla ambitnych
        // 1) Zastanowić się nad klasami wewnętrznymi tworzonymi w obrębie
        // interfejsów
        // 2) Zastanowić się nad interfejsami tworzonymi w obrębie klasa
    }

    private static void zadanie2() {
        // Stworzyć klasę abstrakcyjną z metodą abstract void show().
        // Stworzyć zwykłą klasę z 1 metodą. W tej metodzie proszę tworzyć obiekt
        // anonimowej klasy wewnętrznej, która implementuje show z powyższej klasy abstrakcyjnej.
        // Wywołać tę metodę.
    }

    private static void anonymous1() {
        Parcel p = new Parcel();
        System.out.println(
                p.destination("test").readLabel()
        );
        System.out.println(
                p.destination().readLabel()
        );
        new User().makeExtraDinner(2, "dinner created from anonumous1").tellMeWhatItIs();
    }

    private static void zadanie1() {
        // Pokazać, że obiekty klasy wewnętrznej mogą korzystać
        // z pól i metod klasy zewnętrznej.
    }

    private static void inner1() {
        User u = new User();
        u.show();
        User.Dinner dinner = u.new Dinner("chicken", 1);
        dinner.tellMeWhatItIs();
        User.Dinner dinner2 = u.new Dinner("lasagne", 2);
        u.show();
    }

}

interface Destination {
    String readLabel();
}

class Parcel {
    public Destination destination(String s) {
//        { // definicja klas w bloku kodu - na zewnątrz klasa będzie niewidoczne i nie będe mógł jej zwrócić
            class PDestination implements Destination {
                private String label;
                private PDestination(String whereTo) {
                    label = whereTo;
                }
                public String readLabel() {
                    return label;
                }
            }
//        }

        return new PDestination("test");
    }

    public Destination destination() {
        // anonimowa klasa wewnętrzna
        return new Destination() {
            // klasy anonimowe nie mogą mieć konstruktorów, możemy jednak inicjalizować
            // obiekty w poniższy sposób
            // sposób I
            String field = "445";
            {
                // sposób II
                field = "454";
                System.out.println("inicjalizacja egzemplarza");
            }
            @Override
            public String readLabel() {
                return "readLabel from anonymous class";
            }
        };
    }

//    public ss() {
//        PDestination p;
//    }
}

class User {
    private String name = "Jan Kowalski";
    private int counter;

    class Dinner {
        protected String type;
        Dinner(String type, int counter) {
            this.type = type;
            User.this.counter += counter;
        }
        void tellMeWhatItIs() {
            System.out.println("This is a " + type + " made by " + name);
            // Obiekty klasy wewnętrznej mogą odwoływać się nawet do prywatnych
            // pól/metod klasy, którą tę klasę wewnętrzną otacza
        }

        // klasy wewnętrzne (niestatyczne) nie mogą mieć składników statycznych
        // static void st1(){}
    }

    Dinner makeExtraDinner(int counter, String type2) {
        return new Dinner(type2, counter) {
            {
//                type2 = "asdsda"; nie mogę modyfikować type2, ponieważ jest ono
                // dostarczone z zewnątrz, a więc jest FINAL
                tellMeWhatItIs();
                type = "ekstra dinner";
                User.this.counter += counter;
            }

            void tellMeWhatItIs() {
                System.out.println("This is an extra dinner " + type + " made by " + name);
                // Obiekty klasy wewnętrznej mogą odwoływać się nawet do prywatnych
                // pól/metod klasy, którą tę klasę wewnętrzną otacza
            }

        };
    }

    void show() {
        System.out.println(name + ", dinners: " + counter);
//        tellMeWhatItIs();
    }
}

