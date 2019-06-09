import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {


    public List<String> read(String file) throws FileNotFoundException {

        File fileIn = new File(file);
        Scanner scanner = new Scanner(fileIn);
        List<String> readedLines = new ArrayList<String>();

        while (scanner.hasNextLine()) {
            readedLines.add(scanner.nextLine());
        }
        return readedLines;
    }


    public void save(String file, String text) throws IOException {

        FileWriter writer = new FileWriter(file, true);

        writer.append(text + "\n");
        writer.close();
    }


    public void save(String file, List<String> texts) throws IOException {

        FileWriter writer = new FileWriter(file, true);

        for (String text : texts) {
            writer.append(text + "\n");
        }
        writer.close();
    }
}