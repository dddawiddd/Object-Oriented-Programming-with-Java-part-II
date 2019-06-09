import java.util.Random;

public class Calculation {

    private int[] votes = new int[5];
    Random random = new Random();


    public int calcLength() {
        return random.nextInt(59) + 60;
    }

    public int[] calcVotes() {

        for (int v = 0; v < votes.length; v++) {
            votes[v] = random.nextInt(11) + 10;
        }
        return votes;
    }

    public int calcPoints(int length, int[] votes) {

        int min = votes[0];
        int max = votes[0];
        int sum = 0;
        for (int i = 0; i < votes.length; i++) {
            if (min > votes[i]) {
                min = votes[i];
            }
            if (max < votes[i]) {
                max = votes[i];
            }
            sum += votes[i];
        }
        return length + sum - min - max;
    }
}
