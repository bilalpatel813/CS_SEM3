package JAVA_practical.pract4;
import java.util.*;

public class fruits {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> fruits = new ArrayList<>();

        System.out.println("Enter the number of fruits you want to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i <= n; i++){
            System.out.println("Enter fruit " + i + ":");
            String fruit = sc.nextLine();
            fruits.add(fruit);
        }
        System.out.println("\nList of Fruits: ");

        for( String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
