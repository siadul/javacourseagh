package object;

import dogs.Dog;

public class DogObject extends Dog {
    public DogObject() {
        super("DogObject"); // zadziała ponieważ konstruktor
        // protected Dog(String name)
        // jest protected (z public też zadziała)

        woof();
    }



}
