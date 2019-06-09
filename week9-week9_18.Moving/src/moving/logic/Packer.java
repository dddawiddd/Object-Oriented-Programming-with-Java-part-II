package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {

    int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {

        List<Box> listOfBoxes = new ArrayList<Box>();
        listOfBoxes.add(new Box(boxesVolume));

        for (Thing asd : things) {

            if(!listOfBoxes.get(listOfBoxes.size() - 1).addThing(asd)){
                listOfBoxes.add(new Box(boxesVolume));
                listOfBoxes.get(listOfBoxes.size() - 1).addThing(asd);
            }

/*            if ((boxesVolume - listOfBoxes.get(listOfBoxes.size() - 1).getVolume()) >= asd.getVolume()) {
                listOfBoxes.get(listOfBoxes.size() - 1).addThing(asd);

            } else {
                listOfBoxes.add(new Box(boxesVolume));

                if ((boxesVolume - listOfBoxes.get(listOfBoxes.size() - 1).getVolume()) >= asd.getVolume()) {
                    listOfBoxes.get(listOfBoxes.size() - 1).addThing(asd);
                }
            }*/
        }
        return listOfBoxes;
    }
}