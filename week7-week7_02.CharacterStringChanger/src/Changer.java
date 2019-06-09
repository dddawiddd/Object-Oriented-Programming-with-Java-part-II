import java.util.ArrayList;

public class Changer {

    private ArrayList<Change> list;

    public Changer(){
        this.list = new ArrayList<Change>();
    }

    public void addChange(Change change){
        this.list.add(change);
    }

    public String change(String charakterString){
        for (Change asd : list){
            charakterString = asd.change(charakterString);
        }
        return charakterString;
    }
}
