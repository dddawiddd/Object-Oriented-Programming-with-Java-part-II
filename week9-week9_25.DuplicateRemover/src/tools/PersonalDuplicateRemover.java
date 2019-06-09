package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {

    private Set<String> chatracterStrings;
    private int duplicates = 0;

    public PersonalDuplicateRemover() {
        this.chatracterStrings = new HashSet<String>();
    }

    @Override
    public void add(String characterString) {
        if (chatracterStrings.contains(characterString)) {
            duplicates++;
        } else {
            chatracterStrings.add(characterString);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return duplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return chatracterStrings;
    }

    @Override
    public void empty() {
        chatracterStrings.clear();
        duplicates = 0;
    }
}
