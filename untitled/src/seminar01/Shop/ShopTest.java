package seminar01.Shop;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */

class ShopTest {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("apple", 140));
        products.add(new Product("tomato", 300));
        products.add(new Product("bread", 80));
        products.add(new Product("water", 105));
        Shop shop = new Shop(products);


        assertThat(Shop.getMostExpensiveProduct().toString()).isEqualTo("tomato - 300руб.");
        assertThat(Shop.getProducts()).hasSize(4);
        assertThat(Shop.getProducts()).isEqualTo(products);
        assertThat(Shop.sortProductsByPrice().toString())
                .isEqualTo("[bread - 80руб., water - 105руб., apple - 140руб., tomato - 300руб.]");
    }
}
