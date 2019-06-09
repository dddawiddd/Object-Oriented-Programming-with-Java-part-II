package boxes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MaxWeightBox extends Box {

    private List<Thing> things;
    private int maxWeight;


    public MaxWeightBox(int maxWeight) {
        things = new ArrayList<Thing>();
        this.maxWeight = maxWeight;
    }


    @Override
    public void add(Thing thing) {
        if (thing.getWeight() <= (maxWeight - checkVolume())) {
            things.add(thing);
        }
    }


    private int checkVolume() {
        int volume = 0;
        for (Thing thing : things) {
            volume += thing.getWeight();
        }
        return volume;
    }


    @Override
    public void add(Collection<Thing> things) {
        super.add(things);
    }


    @Override
    public boolean isInTheBox(Thing thing) {
        for (Thing thing1 : things) {
            if (thing.equals(thing1)) {
                return true;
            }
        }
        return false;
    }
}
