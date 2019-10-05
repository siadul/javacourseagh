package interfaces;

public class Circle implements ShapeInterface {
    String name = "Okrąg";
    @Override // adnotacja override gwarantuje nam
    // przesłanianie metody (nie pozwala na przeciążanie)
    public String getName() {
        System.out.println(name);

        return name;
    }

}
