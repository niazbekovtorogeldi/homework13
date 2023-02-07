import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("adilet", "электрик", 10000L, "redmi");
        Person person1 = new Person("musa", "razna rabochiy", 12000L, "sumsung");
        Person person2 = new Person("dastan", "sann tehnik", 30000L, "redmi");
        Person person3 = new Person("manas", "programmist", 123000L, "phone");
        Person person4 = new Person("torogeldi", "police", 11000L, "redmi");

        System.out.println("name:" + person.getName() + "\twork:" + person.getWork() + "\t\tsalary:" + person.getSalary() + "\tphone:" + person.getPhone());

        System.out.println("name:" + person.getName() + "\twork:" + person1.getWork() + "\t\tsalary:" + person1.getSalary() + "\tphone:" + person1.getPhone());

        System.out.println("name:" +person.getName() + "\twork:" + person2.getWork() + "\t\tsalary:" + person2.getSalary() + "\tphone:" + person2.getPhone());

        System.out.println("name:" + person.getName() + "\twork:" + person3.getWork() + "\t\tsalary:" + person3.getSalary() + "\tphone:" + person3.getPhone());

        System.out.println("name:" + person.getName() + "\twork:" + person4.getWork() + "\t\tsalary:" + person4.getSalary() + "\tphone:" + person4.getPhone());
        int max = Integer.MIN_VALUE;
        int[] numbers = new int[]{(int)person.getSalary(), (int)person1.getSalary(), (int)person2.getSalary(), (int)person3.getSalary(), (int)person4.getSalary()};
        int[] var8 = numbers;
        int var9 = numbers.length;

        for(int var10 = 0; var10 < var9; ++var10) {
            int i = var8[var10];
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Max number: " + max);
    }
}

