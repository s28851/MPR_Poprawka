package shopee_s28851;

import java.util.ArrayList;
import java.util.List;

public class ProductStorageSingleton {
    private List<Product> products = new ArrayList<>();

    private ProductStorageSingleton() {

    }

    public List<Product> getCars() {
        return products;
    }

    public void addCar(Product product) {
        products.add(product);
    }
}
