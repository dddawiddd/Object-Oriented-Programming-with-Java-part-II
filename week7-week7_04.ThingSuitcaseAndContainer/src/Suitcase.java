import java.util.ArrayList;

public class Suitcase {

    private int maxWeightLimit;
    private ArrayList<Thing> things;


    public Suitcase(int maxWeightLimit){
        things = new ArrayList<Thing>();
        this.maxWeightLimit = maxWeightLimit;
    }

    public void addThing(Thing thing){

        if(totalWeight()+thing.getWeight()<=maxWeightLimit){
            things.add(thing);
        }
    }

    public String toString() {
        if(things.size()==0){
            return "empty (" + totalWeight() + " kg)";
        }
        else if(things.size()==1){
            return things.size()+ " thing (" + totalWeight() + " kg)";
        }
        return things.size()+ " things (" + totalWeight() + " kg)";
    }

    public int totalWeight(){
        int weight = 0;

        for(Thing asd : things){
            weight += asd.getWeight();
        }
        return weight;
    }

    public void printThings(){

        for(Thing asd : things){
            System.out.println(asd.toString());
        }
    }

    public Thing heaviestThing(){               //4.5
        Thing forChoose = null;
        int heaviest = 0;
        for(Thing asd : things){
            if(asd.getWeight()>heaviest){
                forChoose = asd;
                heaviest = asd.getWeight();
            }
        }
        return forChoose;
    }
}
