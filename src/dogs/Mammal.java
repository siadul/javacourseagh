package dogs;

public class Mammal extends AbstractAnimal {
    @Override // Override wymusza przesłanie metody z klasy bazowej
    public void getName() {
        System.out.println("mammal");
    }

}
