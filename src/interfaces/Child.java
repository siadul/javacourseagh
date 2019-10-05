package interfaces;

public class Child {
    public void play(AbstractProduct product) {
        product.open(); // polimorfizm - wywoływana
        // jest wersja metody na podstawie faktycznego
        // obiektu kryjącego się pod zmienną product
        double price = product.getPrice();
        System.out.println(price);
    }

    public void playCloth(ClothInterface cloth) {
        cloth.wear(); // polimorfizm - wywoływana
        // jest wersja metody na podstawie faktycznego
        // obiektu kryjącego się pod zmienną cloth
    }

    public void playFood(FoodInterface food) {
        food.eat(); // polimorfizm - wywoływana
        // jest wersja metody na podstawie faktycznego
        // obiektu kryjącego się pod zmienną food
    }


}
