package farmsimulator;

import java.util.ArrayList;
import java.util.List;

public class Farm implements Alive {

    private List<Cow> cows = new ArrayList<Cow>();
    private String owner;
    private Barn barn;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
    }

    public String getOwner() {
        return owner;
    }

    public void manageCows() {
        barn.takeCareOf(cows);
    }

    public void addCow(Cow cow) {
        cows.add(cow);
    }

    public void installMilkingRobot(MilkingRobot robot) {
        barn.installMilkingRobot(robot);
    }


    @Override
    public void liveHour() {
        for (Cow cow : cows)
            cow.liveHour();
    }


    @Override
    public String toString() {
        return "Farm owner: " + owner +
                "\nBarn bulk tank: " + barn.getBulkTank() +
                "\n" + getAnimals();
    }


    private String getAnimals() {
        if (cows.isEmpty()) {
            return "No cows.";
        }
        String printCows = "Animals:";
        for (Cow cow : cows) {
            printCows += "\n        " + cow;
        }
        return printCows;
    }
}