import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Whats the card's limit");
        double limit = input.nextDouble();
        CreditCard myCard = new CreditCard(limit);

        int logout = 1;
        while (logout != 0) {
            System.out.println("Product description");
            String description = input.next();
            System.out.println("Product price");
            double price = input.nextDouble();

            Product product = new Product(description, price);

            boolean confirmPurchase = myCard.purchase(product);

            if (confirmPurchase) {
                System.out.println("Purchase confirmed");
                System.out.println("Type 0 to logout or 1 to continue");
                logout = input.nextInt();
            } else {
                System.out.println("Insufficient balance");
                logout = 0;
            }
        }

        System.out.println("****************");
        System.out.println("Shopping Cart\n");

        for (Product p : myCard.getShoppingCart()){
            System.out.println(p.getDescription() + " - " + p.getValue());
        }

        System.out.println("\n****************");
        System.out.println("\nCard's Balance: " + myCard.getBalance());
    }
}
