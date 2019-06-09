import java.util.HashMap;

public class PromissoryNote {

    private HashMap<String,Double> promissoryNote;


    public PromissoryNote(){
        this.promissoryNote = new HashMap<String,Double>();
    }

    public void setLoan(String toWhom, double value){
        toWhom = cleaner(toWhom);
        this.promissoryNote.put(toWhom,value);
    }

    public double howMuchIsTheDebt(String whose){

        whose = cleaner(whose);

        if(promissoryNote.containsKey(whose)){
            return promissoryNote.get(whose);
        }
        return 0;
    }

    public String cleaner(String nameToClean){
        if(nameToClean == null){
            return "";
        }
        nameToClean = nameToClean.toLowerCase();
        return nameToClean.trim();
    }
}