package file;

import java.io.File;
import java.util.Scanner;

public class Analysis {

    private final File file;

    public Analysis(File file) throws Exception {
        this.file = file;
    }

    public int lines() throws Exception {
        Scanner scanner = new Scanner(file);
        int pageCounter = 0;
        String s;

        while (scanner.hasNextLine()) {
            s = scanner.nextLine();  // its working with this, how to exchange it for something what to do nothing?
            pageCounter++;
        }
        //scanner.close();  //not needed when I have scanner inside method?

        return pageCounter;
    }

    public int characters() throws Exception {
        Scanner scanner = new Scanner(file);
        int charCounter = lines();

        while (scanner.hasNextLine()) {
            int a = scanner.nextLine().length();
            charCounter += a;
        }

        return charCounter;
    }
}
