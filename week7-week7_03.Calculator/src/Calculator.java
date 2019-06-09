import java.util.Random;

public class Calculator {

    private Reader reader = new Reader();
    private int counter = 0;

    public void start(){

        while(true){
            System.out.print("command: ");
            String command = reader.readString();

            if(command.equals("end")){
                statistics();
                break;
            }

            if(command.equals("sum")){
                sum();
            }
            else if(command.equals("difference")){
                difference();
            }
            else if(command.equals("product")){
                product();
            }
        }
    }

    private void sum(){
        System.out.println("value1: ");
        int value1 = this.reader.readInteger();
        System.out.println("value2: ");
        int value2 = reader.readInteger();
        System.out.println("sum of the values " + (value1+value2));
        this.counter++;
    }

    private void difference(){
        System.out.println("value1: ");
        int value1 = this.reader.readInteger();
        System.out.println("value2: ");
        int value2 = reader.readInteger();
        System.out.println("difference of the values " + (value1-value2));
        this.counter++;
    }

    private void product(){
        System.out.println("value1: ");
        int value1 = this.reader.readInteger();
        System.out.println("value2: ");
        int value2 = reader.readInteger();
        System.out.println("product of the values " + (value1*value2));
        this.counter++;
    }

    private void introduce(){           //add yesterday
        System.out.println("value1: ");
        int value1 = this.reader.readInteger();
        System.out.println("value2: ");
        int value2 = reader.readInteger();
        this.counter++;
    }

    private void statistics(){
        System.out.println("Calculations done " + this.counter);
    }
}