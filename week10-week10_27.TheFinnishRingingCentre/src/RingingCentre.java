import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {

    private Map<Bird, List<String>> birds;


    public RingingCentre() {
        this.birds = new HashMap<Bird, List<String>>();
    }


    public void observe(Bird bird, String place) {

        List<String> places = new ArrayList<String>();
        if (!birds.containsKey(bird)) {
            places.add(place);
            birds.put(bird, places);
        } else {
            birds.get(bird).add(place);
        }
    }


    public void observations(Bird bird) {

        try {
            System.out.println(bird.getLatinName() + " (" + bird.getRingingYear() + ") observations: " + birds.get(bird).size());
        } catch (NullPointerException e) {
            System.out.println(bird.getLatinName() + " (" + bird.getRingingYear() + ") observations: " + 0);
        }
        for (Bird b : birds.keySet()) {
            if (b.equals(bird)) {
                for (String asd : birds.get(bird)) {
                    System.out.println(asd);
                }
            }
        }
    }
}