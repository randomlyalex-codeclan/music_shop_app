import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    private Guitar guitar;
    private Piano piano;
    private Accessory accessory;
    private Shop shop;

    @Before
    public void before(){
        guitar = new Guitar("Stratocaster",1000,400,"black","wood","Electric Guitar", 6, "Right");
        piano = new Piano("Yamaha", 1000, 600, "black", "wood","String", 188);
        shop = new Shop("Al's music Shop");
    }

    @Test
    public void addToStock() {
        shop.addToStock(guitar);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void removeFromStock() {
        shop.addToStock(guitar);
        shop.addToStock(piano);
        shop.removeFromStock(guitar);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void calculateTotalShopMarkup(){
        shop.addToStock(guitar);
        shop.addToStock(piano);
        assertEquals(1.083333333333333, shop.totalMarkup(), 0.0001);
    }
}