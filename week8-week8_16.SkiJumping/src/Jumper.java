import java.util.ArrayList;

public class Jumper implements Comparable<Jumper> {

    private String name;
    private int length;
    private ArrayList<Integer> lenghts;
    private int points;


    public Jumper(String name, int length) {
        this.name = name;
        this.length = length;
        this.lenghts = new ArrayList<Integer>();
    }


    public String getName() {
        return name;
    }

    public void addPoints(int points) {
        this.points += points;
    }

    public int getPoints() {
        return points;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void addToArrayLength(int length) {
        lenghts.add(length);
    }

    public String getLenghts() {
        String lenghtsToPrint = "";
        for (int i = 0; i < lenghts.size(); i++) {
            if (i == lenghts.size() - 1) {
                lenghtsToPrint += lenghts.get(i) + "m";
                return lenghtsToPrint;
            }
            lenghtsToPrint += lenghts.get(i) + "m, ";
        }
        return "-1";
    }

    @Override                                           //it is necessary?
    public String toString() {
        return name + " (" + length + " points)";
    }

    @Override
    public int compareTo(Jumper o) {
        //return o.getPoints() - this.getPoints();
        return this.getPoints() - o.getPoints();
    }
}