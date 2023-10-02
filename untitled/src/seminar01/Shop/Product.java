package seminar01.Shop;

public class Product {
    private Integer cost; // Стоимость продукта
    private String title; // Название

    public Product(String title, Integer cost) {
        this.title = title;
        this.cost = cost;
    }

    // Геттеры, сеттеры:
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return this.title + " - " + this.cost + "руб.";
    }
}