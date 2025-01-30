package collectionsHashSet;

import java.util.HashSet;
import java.util.Iterator;

public class TestCollectionsHashSet {
    public static void main(String[] args) {
        HashSet <Product> products = new HashSet<>();
        products.add(new Product("Laptop", "Asus", 20000));
        products.add(new Product("Reproductor mp3", "Sony", 1000));
        products.add(new Product("Auriculares", "Asus", 2000));
        products.add(new Product("SSD", "Wester digital", 1000));

        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println(product + ", HashCode: " + product.hashCode());
        }

    }
}
