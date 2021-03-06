public abstract class StockItem implements ISell {
    private String name;
    private double retailPrice;
    private double costPrice;

    public StockItem(String name, double retailPrice, double costPrice) {
        this.name = name;
        this.retailPrice = retailPrice;
        this.costPrice = costPrice;
    }

    public double calculateMarkUp(){
        return (this.retailPrice / this.costPrice) - 1;
    }
}
