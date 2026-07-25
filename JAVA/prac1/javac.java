class Calculator {
    int add(int a, int b){
        return a + b;
    }

    double add(double a, double b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b + c;
    }
}

public class javac{
    public static void main(String[] args){
        Calculator c = new Calculator();
        System.out.println(c.add(45,64));
        System.out.println(c.add(96.3,58.6));
        System.out.println(c.add(235,254,36));
    }
}
