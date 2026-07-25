package JAVA_practical.pract4;
import java.util.TreeSet;

public class tree {
    public static void main(String[] args) {
        TreeSet<String> numbers = new TreeSet<>();
        numbers.add("10");
        numbers.add("5");
        numbers.add("20");
        numbers.add("10");
        System.out.println("Sorted Numbers: " + numbers);
    }
}
