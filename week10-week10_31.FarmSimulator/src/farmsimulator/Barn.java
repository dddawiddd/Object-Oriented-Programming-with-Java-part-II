package farmsimulator;

import java.util.Collection;

public class Barn {

    private MilkingRobot milkingRobot;
    private BulkTank bulkTank;

    public Barn(BulkTank tank) {
        bulkTank = tank;
    }

    public BulkTank getBulkTank() {
        return bulkTank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.milkingRobot = milkingRobot;
        this.milkingRobot.setBulkTank(bulkTank);
    }

    public void takeCareOf(Collection<Cow> cows) {

        for (Cow cow : cows) {
            milkingRobot.milk(cow);
        }
    }

    public void takeCareOf(Cow cow) {
        try {
            milkingRobot.milk(cow);

        } catch (Exception e) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
    }


    @Override
    public String toString() {
        return bulkTank.toString();
    }
}