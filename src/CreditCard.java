import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limit;
    private double balance;
    private List<Product> shoppingCart;

    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.shoppingCart = new ArrayList<>();
    }

    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public List<Product> getShoppingCart() {
        return shoppingCart;
    }

    public boolean purchase(Product product){
        if (this.balance > product.getValue()) {
            this.balance -= product.getValue();
            this.shoppingCart.add(product);
            return true;
        }
        return false;
    }
}
