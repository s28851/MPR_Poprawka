package shopee_s28851;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class RentalService {

    private Storage storage;
    private Cart cart;

    public RentalService(Storage storage, Cart cart) {
        this.storage = storage;
        this.cart = cart;
    }


    int baseOneDayRent = 100;

    public ProductBuyInfo createRent(LocalDate dateFrom, LocalDate dateTo, Product product, Buyer Buyer) {
        if (!product.isRented() && dateFrom.isBefore(dateTo)) {
            product.setRented(true);
            product.setTemporaryOwner(Buyer);
            return new ProductBuyInfo(product.getTemporaryOwner(), product.getProductPrize(), dateFrom, dateTo);
        } else {
            System.out.println("Błąd przy tworzeniu rezerwacji");
        }
        return null;
    }

    public boolean carExisit(int vin) {
        return storage.getCarList().stream().anyMatch(v -> v.getProductPrize() == vin);
    }

    public double estimatePrice(int vin, LocalDate dateFrom, LocalDate dateTo) {
        double price = baseOneDayRent;
        double daysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
        Product productPrice = storage.getCarList().stream()
                .filter(product -> product.getProductPrize() == vin)
                .findAny()
                .orElseThrow();

        price *= daysBetween * productPrice.getSegment().getStandardValue();
        price = (double) Math.round(price * 100.0) / 100.0;

        return price;
    }
}