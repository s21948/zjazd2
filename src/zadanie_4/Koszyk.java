package zadanie_4;

import zadanie_1.User;
import zadanie_2.Product;

import java.util.ArrayList;
import java.util.Date;

public class Koszyk {
    private ArrayList<Product> products = new ArrayList<Product>();
    private User user;

    public Koszyk() {
    }

    public Koszyk(User user) {
        this.user = user;
    }

    public Koszyk(ArrayList products, User user) {
        this.products = products;
        this.user = user;
    }

    public void simulateCart(Product p) {
        products.add(p);
    }

    @Override
    public String toString() {
        return  "Products: " + products + '\n' +
                "User: " + user + '\n';
    }
}
