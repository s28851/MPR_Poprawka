package shopee_s28851;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    public static Cart instance;
    List<ProductBuyInfo> buyList = new ArrayList<>();

    public static Cart getInstance(){
        if(instance == null){
            instance = new Cart();
        }
        return instance;
    }
    void addBuy(ProductBuyInfo buy){
        buyList.add(buy);
    }

    public List<ProductBuyInfo> getBuyList() {
        return buyList;
    }

    public void setBuyList(List<ProductBuyInfo> buyList) {
        this.buyList = buyList;
    }

    public void printRentList(){
        for (ProductBuyInfo buyInfo : buyList) {
            System.out.println(buyInfo.getUser() + " " + buyInfo.getVIN() + " " + buyInfo.getDateNow() + " " + buyInfo.getDateTo());
        }
    }
}
