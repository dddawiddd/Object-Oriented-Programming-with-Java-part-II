package boxes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BlackHoleBox extends Box {
    private List<Thing> things;

    public BlackHoleBox() {
        things = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        things.add(thing);
    }

    @Override
    public void add(Collection<Thing> things) {
        super.add(things);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}