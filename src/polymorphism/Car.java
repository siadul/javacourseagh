package polymorphism;

public class Car {
    Engine engine = new Engine();

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void show() {
        System.out.println("Samochód zawiera silnik o mocy " + engine.getPower());
    }
}
