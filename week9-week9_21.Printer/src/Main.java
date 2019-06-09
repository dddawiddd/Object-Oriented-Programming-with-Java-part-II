
public class Main {

    public static void main(String[] args) throws Exception {

        Printer printer = new Printer("src/kalevala.txt");

        printer.printLinesWhichContain("Mieleni");
        System.out.println("-----");
        printer.printLinesWhichContain("toinen");
        System.out.println("-----");
       // printer.printLinesWhichContain("");
       // System.out.println("-----");
    }
}
