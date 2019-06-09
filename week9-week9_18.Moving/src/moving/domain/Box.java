package moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {

    private List<Thing> items;
    private int maximumCapacity;


    public Box(int maximumCapacity) {
        this.items = new ArrayList<Thing>();
        this.maximumCapacity = maximumCapacity;
    }

    public boolean addThing(Thing thing) {
        if(thing.getVolume() <= (maximumCapacity - getVolume())){
            items.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {

        int usedCapacity = 0;

        for (Thing asd : items) {
            usedCapacity += asd.getVolume();
        }
        return usedCapacity;
    }
}
