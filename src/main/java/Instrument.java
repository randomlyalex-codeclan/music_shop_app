public abstract class Instrument extends StockItem implements IPlay {
    private String colour;
    private String material;
    private String family;

    public Instrument(String name, double retailPrice, double costPrice, String colour, String material, String family) {
        super(name, retailPrice, costPrice);
        this.colour = colour;
        this.material = material;
        this.family = family;
    }
    public abstract String play();
}
