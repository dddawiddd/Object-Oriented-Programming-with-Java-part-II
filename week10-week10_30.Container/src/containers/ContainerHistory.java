package containers;

import java.util.ArrayList;
import java.util.Collections;

public class ContainerHistory {

    private ArrayList<Double> containerHistory;


    public ContainerHistory() {
        this.containerHistory = new ArrayList<Double>();
    }


    @Override
    public String toString() {
        return containerHistory.toString();
    }


    public void add(double situation) {
        containerHistory.add(situation);
    }


    public void reset() {
        containerHistory.clear();
    }


    public double maxValue() {
        if (containerHistory.isEmpty()) {
            return 0;
        } else {
            return Collections.max(containerHistory);
        }
    }

    public double minValue() {
        if (containerHistory.isEmpty()) {
            return 0;
        } else {
            return Collections.min(containerHistory);
        }
    }


    public double average() {
        if (containerHistory.isEmpty()) {
            return 0;
        } else {
            double sumOfAll = 0;
            for (double value : containerHistory) {
                sumOfAll += value;
            }
            return sumOfAll / containerHistory.size();
        }
    }

    //30.5
    public double greatestFluctuation() {

        double greatestFluc = 0;
        if (containerHistory.size() <= 1) {
            return 0;
        }

        double fluc;
        for (int i = 1; i < containerHistory.size(); i++) {
            fluc = Math.abs(containerHistory.get(i - 1) - containerHistory.get(i));
            if (fluc > greatestFluc) {
                greatestFluc = fluc;
            }
        }
        return greatestFluc;
    }


    public double variance() {
        double leftPart = 0;
        double average = average();

        for (double value : containerHistory) {
            leftPart += Math.pow(value - average, 2);
        }
        return leftPart / (containerHistory.size() - 1);
    }
}