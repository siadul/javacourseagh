package interfaces;

public class PantsProduct extends AbstractProduct
        implements ClothInterface {

    @Override
    public void open() {
        System.out.println("Prepare material...");
        System.out.println("Sew pants...");
    }

    @Override
    public void wear() {
        System.out.println("Bursting at the seams...");
    }
}
