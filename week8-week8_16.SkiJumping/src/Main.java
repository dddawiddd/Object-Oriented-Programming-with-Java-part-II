import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        UserInterface start = new UserInterface();
        start.Ui(reader);
    }
}