package farmsimulator;

public class MilkingRobot {

    private BulkTank bulkTank;


    public MilkingRobot() {

    }

    public BulkTank getBulkTank() {
        return bulkTank;
    }

    public void setBulkTank(BulkTank tank) {
        bulkTank = tank;
    }

    public void milk(Milkable milkable){
        double add = milkable.milk();

        try{
            bulkTank.addToTank(add);
        }catch (Exception e){
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
    }
}
