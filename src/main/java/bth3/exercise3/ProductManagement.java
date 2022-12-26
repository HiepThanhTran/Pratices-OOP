package bth3.exercise3;

import java.util.ArrayList;

public class ProductManagement {

    private ArrayList<Product> products;

    public ProductManagement() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public boolean removeProduct(Product product) {
        if (products.contains(product)) {
            products.remove(product);
            return true;
        }
        return false;
    }

    public boolean removeProduct(String id) {
        Product other = search(id);
        if (other == null) {
            return false;
        }
        removeProduct(other);
        return true;
    }

    public void showList() {
        products.forEach(product -> System.out.println(product.toString()));
    }

    public Product search(String s) {
        return products.stream().filter(
            product -> product.id.equalsIgnoreCase(s) || product.name.equalsIgnoreCase(s) || product.desc.equalsIgnoreCase(s)
                || product.producer.equalsIgnoreCase(s)).findFirst().orElse(null);
    }

    public void sortList() {
        products.sort((p1, p2) -> {
            return p1.price < p2.price ? 1 : (p1.price > p2.price ? -1 : 0);
        });
    }
}
