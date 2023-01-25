import java.util.ArrayList;
import java.util.Scanner;

public class ProductsImpl implements Products {   // 2) Single-responsibility principle

    Scanner scanner = new Scanner(System.in);

    int buyingPrices;
    ArrayList<String> buyingProducts = new ArrayList<>();
    ArrayList<String> products;
    ArrayList<Integer> prices;

    public ProductsImpl() {
        this.products = new ArrayList<>();
        this.prices = new ArrayList<>();
    }

    protected void addProduct(String name, int price) {  // 3) Open-closed principle
        products.add(name);
        prices.add(price);
    }

    private void addInBasket() {
        System.out.println("Введите название продукта");
        String buying = scanner.next();
        for (String string : products) {
            if(string.matches(buying)) {
                int index = products.indexOf(string);
                buyingPrices += prices.get(index); // 1) МАГИЧЕСКИЕ ЧИСЛА
                buyingProducts.add(string);
            }
        }
    }

    protected void buyingFood() {
        while(true) {
            System.out.println(products);
            System.out.println("Корзина: " + buyingProducts);
            System.out.println("Суммарная стоимость: " + buyingPrices);
            System.out.println("Выберите операцию и введите её номер");
            System.out.println("1. Добавить в корзину");
            System.out.println("2. Найти по названию");
            System.out.println("Введите 'закончить' что-бы закрыть покупки");
            String input = scanner.next();
            if("закончить".equals(input)) {
                break;
            }
            int inputParse = Integer.parseInt(input);
            switch(inputParse) {
                case 1:
                    addInBasket();
                    break;
                case 2:
                    findingGoods();
                    break;
            }
        }
    }

    private void findingGoods() {
        System.out.println("Введите название продукта");
        String buying = scanner.next();
        for (String string : products) {
            if(string.matches(buying)) {
                int index = products.indexOf(string);
                System.out.println("Товар: " + products.get(index) + " Стомостью: " + prices.get(index));
            }
        }
    }

    @Override
    public ArrayList<String> toStringProducts() {
        return products;
    } // 4) Interface Segregation Principle

    @Override
    public ArrayList<Integer> toStringPrices() {
        return prices;
    }


    @Override
    public String toString() {                           // 5) Dependency inversion principle
        return "Продукты: " + toStringProducts() + "\n"
                + "Цены: " + toStringPrices();
    }

}
