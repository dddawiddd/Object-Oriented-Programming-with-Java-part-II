import java.io.File;
import java.util.Scanner;


public class Printer {

    private File f;

    public Printer(String fileName) throws Exception {
        this.f = new File(fileName);
    }

    public void printLinesWhichContain(String word) throws Exception {

        Scanner scanner = new Scanner(this.f);
        String readLine;

        while (scanner.hasNextLine()) {
            readLine = scanner.nextLine();
            if (readLine.contains(word)) {
                System.out.println(readLine);
            }
        }
    }
}