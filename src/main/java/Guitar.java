public class Guitar extends Instrument {

    private int noOfStrings;
    private String handedness;

    public Guitar(String name, double retailPrice, double costPrice, String colour, String material, String family, int noOfStrings, String handedness) {
        super(name, retailPrice, costPrice, colour, material, family);
        this.noOfStrings = noOfStrings;
        this.handedness = handedness;
    }

    public double calculateMarkUp() {
        return 0;
    }

    @Override
    public String play() {
        return null;
    }
}
