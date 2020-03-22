package zadanie_1;

import zadanie_2.Product;
import zadanie_3.Category;
import zadanie_4.Koszyk;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("--- ZADANIE 1 ---"+ '\n');

        User user_1 = new User("s21948@gmail.com");
        System.out.println("User 1");
        System.out.println("Email: " + user_1.getEmail());
        System.out.println("Status: " + user_1.displayUserType());

        System.out.println("");

        user_1.changeFromGuestToUser("Patrycja", "Kieliszek", "123abc");
        System.out.println("User 1 po wprowadzeniu pozostałych danych:");
        System.out.println(user_1.toString());

        System.out.println("");

        User user_2 = new User("Piotr", "Kieliszek", "s20948@gmail.com", "123abc");
        System.out.println("User 2");
        System.out.println(user_2.toString());

        System.out.println("");

        User user_3 = new User("s21950@gmail.com");
        System.out.println("User 3");
        System.out.println("Email: " + user_3.getEmail());
        System.out.println("Status: " + user_3.displayUserType());

        System.out.println("--- ZADANIE 2 ---"+ '\n');

        Product prod_1 = new Product("Książka", 22.00, "88eip", 5);
        System.out.println("Product 1");
        System.out.println(prod_1.toString());

        System.out.println("");

        Product prod_2 = new Product("Puzzle", 32.00, "9daip");
        System.out.println("Product 2");
        System.out.println(prod_2.toString());

        prod_2.changePrice(15);
        prod_2.changeQty(5);

        System.out.println("");

        System.out.println("Product 2 po zmianie ceny i ilości");
        System.out.println(prod_2.toString());

        System.out.println("");

        Product prod_3 = new Product("Długopis", 4.00, "0103167f", 10);
        System.out.println("Product 3");
        System.out.println(prod_3.toString());


        System.out.println("--- ZADANIE 3 ---"+ '\n');

        // Create list of products
        ArrayList<Product> list = new ArrayList<>();
        list.add(prod_3);

        Category cat_1 = new Category();
        cat_1.addProduct(prod_2);
        System.out.println(cat_1.toString());

        System.out.println("");

        Category cat_2 = new Category("Zabawki");
        cat_2.addProduct(prod_2);
        System.out.println(cat_2.toString());

        System.out.println("");

        Category cat_3 = new Category("Przybory szkolne", list);
        cat_3.addProduct(prod_3);
        System.out.println(cat_3.toString());


        System.out.println('\n' + "--- ZADANIE 4 ---"+ '\n');

        // Set STORAGE for products
        ArrayList storage = new ArrayList<>();
        Product p_1 = new Product("Książka", 22.00, "88eip", 10);
        Product p_2 = new Product("Długopis", 3.00, "88eip", 100);
        Product p_3 = new Product("Zeszyt", 5.00, "88eip", 20);
        storage.add(p_1);
        storage.add(p_2);
        storage.add(p_3);

        Koszyk koszyk_1 = new Koszyk();
        System.out.println("Koszyk 1");
        koszyk_1.simulateCart(prod_3);
        System.out.println(koszyk_1.toString());

        Koszyk koszyk_2 = new Koszyk(user_1);
        System.out.println("Koszyk 2");
        System.out.println(koszyk_2.toString());

        // Products in cart
        ArrayList products_in_cart = new ArrayList();
        Product product_1 = new Product("Książka", 22.00, "88eip", 2);
        products_in_cart.add(product_1);


        Koszyk koszyk_3 = new Koszyk(products_in_cart, user_2);
        System.out.println("Koszyk 3");
    }


}
