import java.util.Scanner;
import java.lang.Math;

public class M{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double a = sc.nextDouble();
        System.out.println("Square root of a: " + a + " is " + Math.sqrt(a));
        double c = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Power of c^b: "+ c +" , " + b + " is " + Math.pow(c, b));
        System.out.println("PI Value of " + Math.PI);
    }
}