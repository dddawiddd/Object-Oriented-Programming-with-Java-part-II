import java.util.ArrayList;

public class Container {

    private int maxWeightLimit;
    private ArrayList <Suitcase> suitcases;


    public Container(int maxWeightLimit){
        this.maxWeightLimit = maxWeightLimit;
        this.suitcases = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase){
        if(totalWeeight()+suitcase.totalWeight()<=maxWeightLimit){
            this.suitcases.add(suitcase);
        }
    }

    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeeight() + " kg)";
    }

    public int totalWeeight(){
        int weight = 0;

        for(Suitcase asd : suitcases){
            weight+=asd.totalWeight();
        }
        return weight;
    }

    public void printThings(){

        for(Suitcase asd : suitcases){
            asd.printThings();
        }
    }
}