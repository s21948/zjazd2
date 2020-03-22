package zadanie_3;

import zadanie_2.Product;

import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Product> products = new ArrayList<>();

    public Category() {

        if (name == null || products == null) {
            name = "Main Category";
        }

        this.name = name;
    }

    public Category(String name) {
        this.name = name;
    }

    public Category(String name, ArrayList products) {
        this.name = name;
        this.products = products;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    @Override
    public String toString() {
        return  "Name: " + name + '\n' +
                "Products: " + products;
    }
}
