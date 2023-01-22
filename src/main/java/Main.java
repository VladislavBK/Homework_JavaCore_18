public class Main {
    public static void main(String[] args) {

        Products products = new Products();
        products.addProduct("Молоко", 100);
        products.addProduct("Хлеб", 15);
        products.addProduct("Минералка", 150);
        products.addProduct("Сыр", 200);
        FoodBasket foodBasket = new FoodBasket(products);
        foodBasket.buyingFood();
    }
}
