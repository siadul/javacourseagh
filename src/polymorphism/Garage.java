package polymorphism;

public class Garage {
    Motorcycle bike1;
    Motorcycle bike2;
    Motorcycle bike3;
    Motorcycle bike4;

    public Motorcycle getBike1() {
        return bike1;
    }

    public void setBike1(Motorcycle bike1) {
        this.bike1 = bike1;
        if(bike1 == null) {
            System.out.println("Miejsce 1 stoi puste.");
            return;
        }
        System.out.println("Na miejscu 1 stanął motocykl " + bike1.name);
    }

    public Motorcycle getBike2() {
        return bike2;
    }

    public void setBike2(Motorcycle bike2) {
        this.bike2 = bike2;
        if(bike2 == null) {
            System.out.println("Miejsce 2 stoi puste.");
            return;
        }
        System.out.println("Na miejscu 2 stanął motocykl " + bike2.name);
    }

    public Motorcycle getBike3() {
        return bike3;
    }

    public void setBike3(Motorcycle bike3) {
        this.bike3 = bike3;
        if(bike3 == null) {
            System.out.println("Miejsce 3 stoi puste.");
            return;
        }
        System.out.println("Na miejscu 3 stanął motocykl " + bike3.name);
    }

    public Motorcycle getBike4() {
        return bike4;
    }

    public void setBike4(Motorcycle bike4) {
        this.bike4 = bike4;
        if(bike4 == null) {
            System.out.println("Miejsce 4 stoi puste.");
            return;
        }
        System.out.println("Na miejscu 4 stanął motocykl " + bike4.name);
    }

    public void removeAll() {
        bike1 = bike2 = bike3 = bike4 = null;
    }


    public void setBike(Motorcycle m) {
        if(bike1 == null) {
            bike1 = m;
            System.out.println("Motocykl \"" + m.getName() +  "\"" +
                    " stanął na miejscu 1");

        } else if(bike2 == null) {
            bike2 = m;
            System.out.println("Motocykl \"" + m.getName() +  "\"" +
                    " stanął na miejscu 2");
        } else if(bike3 == null) {
            bike3 = m;
            System.out.println("Motocykl \"" + m.getName() +  "\"" +
                    " stanął na miejscu 3");
        } else if(bike4 == null) {
            bike4 = m;
            System.out.println("Motocykl \"" + m.getName() +  "\"" +
                    " stanął na miejscu 4");
        } else {
            System.out.println("Wszystkie miejsca zajęte, nie można zaparkować motocykla!");
        }

    }
}
