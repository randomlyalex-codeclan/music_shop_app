import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public void addToStock(StockItem item){
        this.stock.add(item);
    }

    public void removeFromStock(StockItem item){
        this.stock.remove(item);
    }

}
