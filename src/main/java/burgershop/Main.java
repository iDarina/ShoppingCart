package burgershop;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shop = new ShoppingCart();
        shop.printMenu();
        shop.addBurger();
        shop.addFries();
        shop.addSoda();

    }
}
