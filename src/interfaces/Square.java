package interfaces;

public class Square extends AbstractShape {
    public String name = "Prostokąt";
    // uwaga! pola nie są
    // polimorficzne

    @Override
    public String getName() {
        System.out.println(name);

        return name;
    }

}
