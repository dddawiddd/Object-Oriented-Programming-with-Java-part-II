package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MindfulDictionary {

    private Map<String, String> dict = new HashMap<String, String>();
    private String fileName;


    public MindfulDictionary() {
    }

    public MindfulDictionary(String file) {
        this.fileName = file;
    }

    public void add(String word, String translation) {

        if (!dict.containsKey(word)) {
            dict.put(word, translation);
        }
    }


    public String translate(String word) {

        if (dict.containsKey(word)) {
            return dict.get(word);
        } else if (dict.containsValue(word)) {
            for (String key : dict.keySet()) {
                if (dict.get(key).equals(word)) {
                    return key;
                }
            }
        }
        return null;
    }


    public void remove(String word) {

        String keyToRemove = "";
        if (dict.containsValue(word)) {
            for (String key : dict.keySet()) {
                if (dict.get(key).equals(word)) {
                    keyToRemove = key;
                }
            }
            dict.remove(keyToRemove);
        } else if (dict.containsKey(word)) {
            dict.remove(word);
        }
    }

    //35.3
    public boolean load() {

        File file = new File(this.fileName);
        try {
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                dict.put(parts[0], parts[1]);
            }
        } catch (IOException e) {
            return false;
        }
        return true;
    }


    public boolean save() {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            for (String key : dict.keySet()) {
                fileWriter.write(key + ":" + dict.get(key) + "\n");
            }
            fileWriter.close();

        } catch (IOException e) {
            return false;
        }
        return true;
    }
}