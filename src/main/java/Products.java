import java.util.ArrayList;

public class Products {   // 2) Single-responsibility principle

    ArrayList<String> products;
    ArrayList<Integer> prices;

    public Products() {
        this.products = new ArrayList<>();
        this.prices = new ArrayList<>();
    }

    protected void addProduct(String name, int price) {
        products.add(name);
        prices.add(price);
    }

    protected ArrayList<String> toStringProducts() {
        return products;
    }

    protected ArrayList<Integer> toStringPrices() {
        return prices;
    }

    @Override
    public String toString() {                           // 4) Dependency inversion principle
        return "Продукты: " + toStringProducts() + "\n"
                + "Цены: " + toStringPrices();
    }

}
