
public class Smileys {

    public static void main(String[] args) {

        printWithSmileys("Mikael");
        printWithSmileys("87.");
        printWithSmileys("Meth");
        printWithSmileys("Bee");
        printWithSmileys("Inter");
    }

    private static void printWithSmileys(String charakterString){

        charakterString = " " + charakterString + " ";

        int lenght = charakterString.length();

        if(lenght%2==1){
            charakterString = charakterString + " ";
            lenght +=1;
        }

        if(lenght==8)
            lenght-=1;

        printLineOfSmiles(lenght);
        System.out.println(":)" + charakterString + ":)");
        printLineOfSmiles(lenght);
    }

    private static void printLineOfSmiles(int length){

        for(int i = 1; i<length; i++){
            System.out.print(":)");
        }
        System.out.println();
    }
}