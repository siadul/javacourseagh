package interfaces;

public class CandyBracelet extends AbstractProduct
        implements ClothInterface, FoodInterface {

    @Override
    public void open() {
        System.out.println("Prepare material...");
        System.out.println("Sew pants...");
    }

    @Override
    public void wear() {
        System.out.println("Bursting at the seams...");
    }

    @Override
    public void eat() {
        System.out.println("Eating candy bracelet...");
    }
}
