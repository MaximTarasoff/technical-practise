package lesson_two.hw.taskSix;

import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int id;

    public Product() {

    }

    public Product(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }

    @Override
    public Product clone() {
        return new Product(name, price, id);
    }
}
