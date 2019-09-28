package object;

import dogs.AbstractAnimal;
import dogs.Bird;
import dogs.Dog;
import dogs.Mammal;

public class Object3 {
    void test() {
        Dog dog1;
    }

    public static void main(String... args) {
//        AbstractAnimal animal = new AbstractAnimal();
        Mammal mammal = new Mammal();
        mammal.getName();
        Bird bird = new Bird();
        bird.getName();

        System.out.println("showAnimal(AbstractAnimal abstractAnimal) ");
        showAnimal(mammal);
        showAnimal(bird);
    }

    // w stary sposób
    public static void showBird(Bird bird) {
        bird.getName();
    }
    public static void showDog(Mammal mammal) {
        mammal.getName();
    }

    // dzięki klasom abstrakcyjnym mogę zdefiniować metodę tylko raz
    public static void showAnimal(AbstractAnimal abstractAnimal) {
        abstractAnimal.getName();
        // w jaki sposób kompilator ogarnia, którą metodę ma wywołać?
        // POLIMORFIZM
    }

}
