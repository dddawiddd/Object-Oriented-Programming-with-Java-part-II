import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> hand;

    public Hand(){
        hand = new ArrayList<Card>();
    }

    public void add(Card card){
        hand.add(card);
    }

    public void print(){
        for(Card asd : hand){
            System.out.println(asd);
        }
    }

    public void sort(){
        Collections.sort(hand);
    }

    @Override
    public int compareTo(Hand o) {
        int sum1 =0;
        for(Card asd : this.hand){
            sum1 += asd.getValue();
        }

        int sum2 = 0;
        for(Card asd : o.hand){
            sum2 += asd.getValue();
        }
        return sum1-sum2;
    }

    public void sortAgainstSuit(){

        Collections.sort(this.hand,new SortAgainstSuitAndValue());
    }




}