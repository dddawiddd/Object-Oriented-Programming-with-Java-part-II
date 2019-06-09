package containers;

public class ProductContainer extends Container {

    private String productName;


    public ProductContainer(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    public String getName() {
        return productName;
    }

    public void setName(String newName) {
        this.productName = newName;
    }

    @Override
    public double getVolume() {
        return super.getVolume();
    }

    @Override
    public double getOriginalCapacity() {
        return super.getOriginalCapacity();
    }

    @Override
    public double getCurrentCapacity() {
        return super.getCurrentCapacity();
    }

    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
    }

    @Override
    public double takeFromTheContainer(double amount) {
        return super.takeFromTheContainer(amount);
    }

    @Override
    public String toString() {
        return getName() + ": " + super.toString();
    }
}
