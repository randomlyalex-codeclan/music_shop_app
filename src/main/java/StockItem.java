public abstract class StockItem {
    private String name;
    private double retailPrice;
    private double costPrice;

    public StockItem(String name, double retailPrice, double costPrice) {
        this.name = name;
        this.retailPrice = retailPrice;
        this.costPrice = costPrice;
    }
}
