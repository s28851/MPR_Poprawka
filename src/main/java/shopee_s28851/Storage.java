package shopee_s28851;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private static Storage instance;

    private List<Product> productList = new ArrayList<>();

    public static Storage getInstance(){
        if ( instance == null){
            instance = new Storage();
        }
        return instance;
    }
    public void addproduct(Product product) {
        productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }
}
