public class Main {
    public static void main(String[] args) {

        ProductsImpl products = new ProductsImpl();
        products.addProduct("Молоко", 100);
        products.addProduct("Хлеб", 15);
        products.addProduct("Минералка", 150);
        products.addProduct("Сыр", 200);
        products.buyingFood();
    }
}
