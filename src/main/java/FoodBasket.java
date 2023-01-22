import java.util.ArrayList;
import java.util.Scanner;

public class FoodBasket {
    Scanner scanner = new Scanner(System.in);

    ArrayList<String> buyingProducts = new ArrayList<>();
    int buyingPrices;
    Products products;

    public FoodBasket(Products products) {
        this.products = products;
    }

    protected void addInBasket() {
        System.out.println("Введите название продукта");
        String buying = scanner.next();
        for (String string : products.products) {
            if(string.matches(buying)) {
                int index = products.products.indexOf(string);
                buyingPrices += products.prices.get(index); // 1) МАГИЧЕСКИЕ ЧИСЛА
                buyingProducts.add(string);  // 3) Open-closed principle
            }
        }
    }

    protected void findingGoods() {
        System.out.println("Введите название продукта");
        String buying = scanner.next();
        for (String string : products.products) {
            if(string.matches(buying)) {
                int index = products.products.indexOf(string);
                System.out.println("Товар: " + products.products.get(index) + " Стомостью: " + products.prices.get(index));
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
}
