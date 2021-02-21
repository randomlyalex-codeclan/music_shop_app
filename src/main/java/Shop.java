import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<StockItem> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<StockItem>();
    }

    public void addToStock(StockItem item){
        this.stock.add(item);
    }

    public void removeFromStock(StockItem item){
        this.stock.remove(item);
    }

    public int stockCount() {
        return stock.size();
    }

    public double totalMarkup() {
        double totalMakupAdded = 0;
        for (StockItem stockItem : this.stock){
            totalMakupAdded += stockItem.calculateMarkUp();
        }
        return totalMakupAdded / this.stockCount();
    }
}
