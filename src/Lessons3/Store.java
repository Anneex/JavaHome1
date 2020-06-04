package Lessons3;

import java.util.ArrayList;
import java.util.List;

public class Store {

//
//    Product product1 = new Product("carRed", 11, "toys", "red");
//    Product product2 = new Product("carSil", 12, "toys", "silver");
//    Product product3 = new Product("car3", 13, "toys", "green");
//    Product product4 = new Product("car4", 14, "toys", "blue");
//    Product product5 = new Product("car5", 15, "toys", "black");


    List<Product> productsList = new ArrayList<>();

//    public void add() {
//        productsList.;
//    }

    public void setProductsList(Product product) {

        if (!product.getName().matches("^[а-яА-ЯёЁa-zA-Z]+$")) {
            System.out.println("Please, write in name only letter");
        } else if (product.getPrice() < 0) {
            System.out.println("Please, write in price only positive number");
        } else {
            productsList.add(product);
        }
        System.out.println("1 " + productsList); //test
    }

    ;

    public void removeProduct(String name) {
        productsList.removeIf(p -> p.getName().equals(name));
        System.out.println("2 " + productsList); //test
    }

    public void addPrice(String name) {
        for (Product product : productsList) {
            if (name.equals(product.getName())) {
                product.setPrice(product.getPrice() * 2);
                System.out.println("3 " + productsList); //test
            }
        }
    }

    ;

    public void premiumGoods(Integer price) {
        List<Product> productsList1 = new ArrayList<>();
        for (Product product : productsList) {
            if (price < product.getPrice()) {
                productsList1.add(product);
            }
        }
        System.out.println("В нашому магазині продаються такі преміум товари " + productsList1.toString()); //test
    }
    public void scoreType (String type) {
        int i = 0;
        for (Product product: productsList) {
            if (product.getType().equals(type)){
                i++;
            }
        }
                System.out.println(i); //test
    }
    public void argProduct() {
        double score = 0;
        for (Product product: productsList) {
            score += product.getPrice();
        }
        double arg = score / productsList.size();
        System.out.println(arg); //test
    }

}
