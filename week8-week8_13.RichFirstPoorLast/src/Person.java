public class Person implements Comparable<Person> {

    private int salary;
    private String name;

    public Person(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Person o) {

        if(this.salary==o.salary)
            return 0;
        else if(this.salary<o.salary){
            return 1;
        }
        else
            return -1;

        //return o.getSalary()-this.getSalary();
    }

    @Override
    public String toString() {
        return name + " " + salary;
    }
}