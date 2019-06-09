package containers;

public class ProductContainerRecorder extends ProductContainer {

    private ContainerHistory containerHistory;


    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        containerHistory = new ContainerHistory();
        this.addToTheContainer(initialVolume);
    }

    public String history() {
        return containerHistory.toString();
    }

    public void printAnalysis() {
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Greatest product amount: " + containerHistory.maxValue());
        System.out.println("Smallest product amount: " + containerHistory.minValue());
        System.out.println("Average: " + containerHistory.average());
        System.out.println("Greatest change: " + containerHistory.greatestFluctuation());
        System.out.println("Variance: : " + containerHistory.variance());
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String newName) {
        super.setName(newName);
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
        containerHistory.add(getVolume());
    }

    @Override
    public double takeFromTheContainer(double amount) {
        double i = super.takeFromTheContainer(amount);
        containerHistory.add(getVolume());
        return i;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
