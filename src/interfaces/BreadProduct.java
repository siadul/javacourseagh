package interfaces;

public class BreadProduct extends AbstractProduct
        implements FoodInterface {

    @Override
    public void open() {
        System.out.println("Prepare bread dough...");
        System.out.println("Baking...");
    }

    @Override
    public void eat() {
        System.out.println("Eating bread: omomom...");
    }
}
