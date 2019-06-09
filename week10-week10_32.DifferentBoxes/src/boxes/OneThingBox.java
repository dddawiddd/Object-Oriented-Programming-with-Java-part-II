package boxes;

import java.util.Collection;

public class OneThingBox extends Box {

    private Thing oneThing;

    @Override
    public void add(Thing thing) {
        if (oneThing == null) {
            oneThing = thing;
        }
    }

    @Override
    public void add(Collection<Thing> things) {
        super.add(things);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if (thing.equals(oneThing)) {
            return true;
        }
        return false;
    }
}
