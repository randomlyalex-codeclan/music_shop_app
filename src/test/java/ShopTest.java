import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    private Guitar guitar;
    private Accessory accessory;
    private Shop shop;

    @Before
    public void before(){
        guitar = new Guitar("Stratocaster",1000,400,"black","wood","Electric Guitar", 6, "Right");
        shop = new Shop("Al's music Shop");
    }

    @Test
    public void addToStock() {
        shop.addToStock(guitar);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void removeFromStock() {
    }
}