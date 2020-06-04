package Lessons3;

import java.util.Objects;

public class Product {
    private String name;
    private int price;
    private String type;
    private String color;

    public Product(String name, int price, String type, String color) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, price, type, color);
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", price = " + price +
                ", type = " + type +
                ", color = " + color + ";";
    }
}
