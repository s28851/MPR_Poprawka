package shopee_s28851;

import java.time.LocalDate;
public class ProductBuyInfo {
    public Buyer Buyer;
    public int VIN;

    private LocalDate dateNow;
    private LocalDate dateTo;

    public ProductBuyInfo(Buyer Buyer, int VIN, LocalDate dateNow, LocalDate dateTo) {
        this.Buyer = Buyer;
        this.VIN = VIN;
        this.dateNow = dateNow;
        this.dateTo = dateTo;
    }

    public String getUser() {
        return String.valueOf(this.Buyer);
    }

    public void setUser(Buyer Buyer) {
        this.Buyer = Buyer;
    }

    public int getVIN() {
        return VIN;
    }

    public LocalDate getDateNow() {
        return dateNow;
    }

    public void setDateNow(LocalDate dateNow) {
        this.dateNow = dateNow;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

}
