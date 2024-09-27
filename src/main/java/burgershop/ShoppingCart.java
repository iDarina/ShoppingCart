package burgershop;

public class ShoppingCart {
    public static double totalPrice;
    public static int itemsInYourCart;

    public final double burgerPrice = 4;
    public final double friesPrice = 1;
    public final double sodaPrice = .50;

    public void printMenu() {
        System.out.println("Today's menu:\n" + "Burger: " + burgerPrice + "\n" + "Fries: " + friesPrice + "\n" + "Soda: " + sodaPrice);
        System.out.println(" ");
    }

    public void addBurger() {
        totalPrice = totalPrice + burgerPrice;
        itemsInYourCart++;
        System.out.println("Burger is in your cart");
        System.out.println("Price for a Burger: " + burgerPrice);
        System.out.println("You have " + itemsInYourCart + " items in your cart");
        System.out.println("Your total price: " + totalPrice);
        System.out.println(" ");
    }

    public void addFries() {
        totalPrice = totalPrice + friesPrice;
        itemsInYourCart++;
        System.out.println("Fries is in your cart");
        System.out.println("Price for a Fries: " + friesPrice);
        System.out.println("You have " + itemsInYourCart + " items in your cart");
        System.out.println("Your total price: " + totalPrice);
        System.out.println(" ");
    }

    public void addSoda() {
        totalPrice = totalPrice + sodaPrice;
        itemsInYourCart++;
        System.out.println("Soda is in your cart");
        System.out.println("Price for a Soda: " + sodaPrice);
        System.out.println("You have " + itemsInYourCart + " items in your cart");
        System.out.println("Your total price: " + totalPrice);
        System.out.println(" ");
    }
}