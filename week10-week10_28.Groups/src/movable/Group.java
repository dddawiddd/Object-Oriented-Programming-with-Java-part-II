package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {

    private List<Movable> group;

    public Group() {
        group = new ArrayList<Movable>();
    }

    public void addToGroup(Movable movable) {
        group.add(movable);
    }


    @Override
    public String toString() {
        String string = "";
        for (Movable g : group) {
            string += g.toString() + "\n";
        }
        return string;
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable a : group) {
            a.move(dx, dy);
        }
    }
}
