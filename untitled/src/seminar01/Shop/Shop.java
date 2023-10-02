package seminar01.Shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class Shop {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("apple", 140));
        products.add(new Product("tomato", 300));
        products.add(new Product("bread", 80));
        products.add(new Product("water", 105));
        Shop shop = new Shop(products);
        System.out.println("Продукты:" + shop.getProducts());
        System.out.println("Продукты, отсортированные по цене: " + shop.sortProductsByPrice());
        System.out.println("Самый дорогой продукт: " + shop.getMostExpensiveProduct());


//        assertThat(Shop.getMostExpensiveProduct().toString()).isEqualTo("tomato - 300руб.");
//        assertThat(shop.getProducts()).hasSize(4);
//        assertThat(shop.getProducts()).isEqualTo(products);
//        assertThat(shop.sortProductsByPrice().toString())
//                .isEqualTo("[bread - 80руб., water - 105руб., apple - 140руб., tomato - 300руб.]");

    }
    private static List<Product> products;

    public Shop(List<Product> products) {
        this.products = products;
    }
    // Геттеры, сеттеры:
    public static List<Product> getProducts() {
        return products;
    }

//    public void setProducts(List<Product> products) {
//        this.products = products;
//    }



    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public static List<Product> sortProductsByPrice() {
        // Допишите реализацию метода самостоятельно
        products.sort(Comparator.comparing(Product::getCost));
        return products;
//        return null;
    }

    // Метод должен вернуть самый дорогой продукт
    public static Product getMostExpensiveProduct() {
        // Допишите реализацию метода самостоятельно
        return Collections.max(products, Comparator.comparingInt(Product::getCost));

//        return null;
    }
}