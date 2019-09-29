package polymorphism;

public abstract class Motorcycle {
    protected String name = "Motorcycle";

    public String getName() {
        if (name != null) {
            return name;
        }

        return "motocykl ma wartość null";
    }

    public abstract void makeNoise();
}
