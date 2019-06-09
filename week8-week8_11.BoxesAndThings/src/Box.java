
import java.util.ArrayList;

public class Box implements ToBeStored {
    private double maxWeight; //in kilograms
    private ArrayList<ToBeStored> boxes;

    public Box(double weight) {
        this.boxes = new ArrayList<ToBeStored>();
        this.maxWeight = weight;
    }

    @Override
    public double weight() {

        double weight = 0;

        for(ToBeStored asd : boxes){
            weight += asd.weight();
        }
        return weight;    //to do poprawy;
    }

    public void add(ToBeStored toAdd){
        double boxWeight = toAdd.weight();
        if((boxWeight + this.weight())<=this.maxWeight){
            this.boxes.add(toAdd);
        }
    }

    public String toString(){
        return "Box: " + this.boxes.size() + " things, total weight " + weight() + " kg";
    }

}
