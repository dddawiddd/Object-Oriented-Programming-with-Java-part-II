
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileManager t = new FileManager();
        t.save("src/testinput1.txt","omuka");

        for (String line : t.read("src/testinput1.txt")) {
            System.out.println(line);
        }
    }
}