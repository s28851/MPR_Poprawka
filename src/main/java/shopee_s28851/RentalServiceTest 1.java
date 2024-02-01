package shopee_s28851;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RentalServiceTest {
    private Storage storage;

    private Cart cart;

    private RentalService rentalService;


    @BeforeEach
    void init() {
        storage = new Storage();
        cart = new Cart();
        rentalService = new RentalService(storage, cart);
    }

    @Test
    void estimatePriceIs3000() {
        //Given
        var car = new Product("Skoda", "Octavia", 231323123, Type.Kombi);
        storage.addproduct(car);

        LocalDate dateFrom = LocalDate.of(2023, 11, 20);
        LocalDate dateTo = LocalDate.now();
        //When
        double price = rentalService.estimatePrice(car.getProductPrize(), dateFrom, dateTo);
        //Then
        assertEquals(3000, price);

    }
    @Test
    void estimatePriceIsNot3000() {
        //Given
        var car = new Product("Skoda", "Octavia", 231323123, Type.Kombi);
        storage.addproduct(car);

        LocalDate dateFrom = LocalDate.of(2023, 11, 20);
        LocalDate dateTo = LocalDate.now();
        //When
        double price = rentalService.estimatePrice(car.getProductPrize(), dateFrom, dateTo);
        //Then
        assertNotEquals(2000, price);

    }



    @Test
    void IsCarExist(){
        //given
        var car = new Product("Audi", "A7", 324552, Type.Sedan);
        storage.addproduct(car);
        //when
        boolean isExist = rentalService.carExisit(car.getProductPrize());

        //then
        assertTrue(isExist);

    }

    @Test
    void IsCarNotExist(){
        //given
        var car = new Product("Audi", "A7", 324552, Type.Sedan);
        //when
        boolean isExist = rentalService.carExisit(car.getProductPrize());

        //then
        assertFalse(isExist);

    }



}