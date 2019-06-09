import java.util.*;

public class UserInterface {

    public void Ui(Scanner reader) {


        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");


        Calculation calc = new Calculation();
        ArrayList<Jumper> playeList = new ArrayList<Jumper>();

        while (true) {

            System.out.print("  Participant name: ");
            String name = reader.nextLine();

            if (name.isEmpty()) {
                break;
            }
            playeList.add(new Jumper(name, 0));
        }

        System.out.println("\nThe tournament begins!\n");


        System.out.print("Write \"jump\" to jump; otherwise you quit: ");
        String order = reader.nextLine().trim();
        int round = 1;


        while (order.equalsIgnoreCase("jump")) {

            System.out.println("\nRound " + round + "\n");

            System.out.println("Jumping order: ");

            Collections.sort(playeList);

            for (int i = 0; i < playeList.size(); i++) {
                System.out.println("  " + (i + 1) + ". " + playeList.get(i).getName() + " (" + playeList.get(i).getPoints() + " points)");
            }

            System.out.println("\nResults of round " + round);

            int lenght;
            int[] votes = new int[5];

            for (Jumper jumper : playeList) {
                System.out.println("  " + jumper.getName());

                lenght = calc.calcLength();
                jumper.setLength(lenght);
                jumper.addToArrayLength(lenght);
                System.out.println("    length: " + lenght);

                votes = calc.calcVotes();
                System.out.println("    judge votes: " + Arrays.toString(votes));
                jumper.addPoints(calc.calcPoints(lenght, votes));
            }

            System.out.print("\nWrite \"jump\" to jump; otherwise you quit: ");
            order = reader.nextLine();
            round++;
        }

        System.out.println("\nThanks!\n");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");

        Collections.sort(playeList);
        Collections.reverse(playeList);

        for (int i = 0; i < playeList.size(); i++) {

            System.out.println(i + 1 + "           " + playeList.get(i).getName() + " " + "(" + playeList.get(i).getPoints() + " points)");       //todo compare with toString from Jumper
            System.out.println("            jump lengths: " + playeList.get(i).getLenghts());
        }
    }
}