package JAVA_practical.pract4;
import java.util.*;

public class fruit {
    public static void main(String[] args) {
        List<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Mango");

        for(String f: fruit){
            System.out.println(f);
        }
    }
}
