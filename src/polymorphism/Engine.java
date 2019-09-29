package polymorphism;

public class Engine {
    private double power;

    // Metody get i set są określane mianem Akcesorów
    // metody typu get to GETTERY
    public double getPower() {
        return power;
    }

    // metody typu set to są SETTERY
    public void setPower(double power) {
        this.power = power;
    }

    // gettery i settery możemy wygenerować automatycznie
    // korzystając z menu i wybierając 'Generate"
}
