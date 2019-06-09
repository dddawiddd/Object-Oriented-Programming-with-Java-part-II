package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive {


    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    private double amount;
    private double capacity;
    private Random random = new Random();
    private String name;


    public Cow(String name) {
        this.name = name;
        capacity = 15 + random.nextInt(26);
        amount = 0;
    }

    public Cow() {
        name = NAMES[random.nextInt(NAMES.length)];
        capacity = 15 + random.nextInt(26);
        amount = 0;
    }


    public String getName() {
        return name;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getAmount() {
        return amount;
    }


    @Override
    public String toString() {
        return getName() + " " + Math.ceil(getAmount()) + "/" + getCapacity();
    }

    @Override
    public double milk() {
        double amountToSend = amount;
        amount = 0;
        return amountToSend;
    }


    @Override
    public void liveHour() {
        double newMilk = (random.nextInt(13) + 7) / 10.0;
        if ((capacity - amount) >= newMilk) {
            amount += newMilk;
        } else {
            amount = capacity;
        }
    }
}