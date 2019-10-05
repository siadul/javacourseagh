package interfaces;

public abstract class AbstractShape {
    public String name = "kształt"; // uwaga! pola nie są
    // polimorficzne
    public abstract String getName();

    public void show() {
        System.out.println("Rysuję kształt - name: "
                + name); // nie ma polimorfizmu

        System.out.println("Rysuję kształt - getName(): "
                + getName()); // jest polimorfizm
    }
}
