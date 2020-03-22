package zadanie_2;

public class Product {
    private String name;
    private double price;
    private String code;
    private int qty;

    // Without QTY
    public Product(String name, double price, String code) {
        this.name = name;
        this.price = price;
        this.code = code;
        this.qty = 0;
    }

    // With QTY
    public Product(String name, double price, String code, int qty) {
        this.name = name;
        this.price = price;
        this.code = code;
        this.qty = qty;
    }

    public void changePrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Cena nie może być mniejsza od zera");
        }
        this.price = price;
    }

    public void changeQty(int qty) {
        if (qty < 0) {
            throw new IllegalArgumentException("Ilość nie może być mniejsza od zera");
        }
        this.qty = qty;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return  "Name: " + name + '\n' +
                "Price: " + price + '\n' +
                "Product code: " + code + '\n' +
                "Qty: " + qty ;
    }
}
