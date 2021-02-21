public class Piano extends Instrument {

    private int noOfKeys;

    public Piano(String name, double retailPrice, double costPrice, String colour, String material, String family, int noOfKeys) {
        super(name, retailPrice, costPrice, colour, material, family);
        this.noOfKeys = noOfKeys;
    }


    @Override
    public String play() {
        return "Piano sounds";
    }
}
